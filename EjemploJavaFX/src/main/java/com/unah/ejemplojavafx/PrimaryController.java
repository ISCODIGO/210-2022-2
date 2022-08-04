package com.unah.ejemplojavafx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML ImageView imgPerfil;
    @FXML TextField txtTitulo;
    @FXML TextArea txtDescripcion;
    private String errorStr;
    private Path imagePath;
    private final String DIRECTORIO = "card/";
    
    @FXML private void cargarImagen() throws FileNotFoundException {
        // Se abrira un FileChooser para capturar una imagen
        FileChooser fc = new FileChooser();
        File file = fc.showOpenDialog(App.stage);
        // La ruta solicitada se muestra en el componente
        this.imagePath = file.toPath();
        imgPerfil.setImage(new Image(new FileInputStream(file)));
    }

    @FXML private void salvarDatos() throws URISyntaxException, IOException {
        validarDatos();
        
        if (!this.errorStr.isEmpty()) {
            mostrarAdvertencia();
            return;
        }
        
        // Leer el string del HTML de la tarjeta
        Path path = Path.of(App.class.getResource("index.html").toURI());
        String content = Files.readString(path);
        // Modificar los valores del HTML con los componentes de la vista
        String imgURL = imagePath.toString();
        String extension = imgURL.substring(imgURL.lastIndexOf(".") + 1);
        String newImgFilename = String.format("%s.%s", txtTitulo.getText(), extension);
        
        content = content
                .replace("{{IMAGEN}}", newImgFilename)
                .replace("{{TITULO}}", txtTitulo.getText())
                .replace("{{DESCRIPCION}}", txtDescripcion.getText());
        
        // Crear el directorio
        Path newPath = Path.of(DIRECTORIO); 
        if (!Files.exists(newPath)) {
            Files.createDirectory(newPath);
        }
        // Crear el nuevo archivo
        File newFile = new File(String.format("%s%s.html", DIRECTORIO, txtTitulo.getText()));
        // Almacenar el nuevo String en otro archivo HTML
        Files.writeString(newFile.toPath(), content, StandardOpenOption.CREATE);
        // Copiar la imagen en la carpeta
        File newImg = new File(DIRECTORIO + newImgFilename);
        Files.copy(imagePath, newImg.toPath());
    }
    
    private void validarDatos() {
        this.errorStr = "";
        
        if (txtTitulo == null || txtTitulo.getText().isBlank()) {
            errorStr = "\nTitulo es requerido";
        }  
        
        if (txtDescripcion == null || txtDescripcion.getText().isBlank()) {
            errorStr += "\nDescripcion es requerida";
        }
        
        if (imgPerfil.getImage() == null) {
            errorStr += "\nImagen es requerida";
        }               
    }
    
    private void mostrarAdvertencia() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validacion del guardado de datos");
        alert.setHeaderText(null);
        alert.setContentText(errorStr);
        alert.showAndWait();
    }
}
