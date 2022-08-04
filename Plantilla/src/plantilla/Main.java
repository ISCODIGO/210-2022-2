package plantilla;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author unah
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // configuracion de scene (contenido de la ventana)
        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
        Scene scene = new Scene(root);
        
        // configuracion de stage (ventana)
        primaryStage.setTitle("Plantilla de Ejemplo");  // titulo de ventana
        primaryStage.setWidth(400);  // anchura de ventana
        primaryStage.setHeight(400);  // altura de ventana
        primaryStage.setScene(scene);
        primaryStage.show();  // mostrar ventana
        
    }

    public static void main(String[] args) {
        launch(args);  // lanzar la aplicacion
    }

}
