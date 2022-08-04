/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.unah.ejemplojavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author unah
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;
    
    @FXML
    private void loginClick() throws IOException {
        if (txtUsuario.getText().equals("admin") && txtPassword.getText().equals("1234")) {
            App.setRoot("primary");
        } else {
            System.out.println("No tiene credenciales para ingresar");
        }
    }
    
}
