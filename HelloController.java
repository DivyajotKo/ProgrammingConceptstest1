package com.example.divyatest1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField username;
    public TextField password;
    public Label ErrorMessage;
    @FXML
    private Label welcomeText;


    static int invalidReqcount=0;

    static String correctUsername="Divya";
    static String correctPassword="hehehe";


    public void onLoginButtonClick(ActionEvent actionEvent) {
        String usernameInput = username.getText();
        String passwordInput = password.getText();

        if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
            ErrorMessage.setText("Please provide username or password");
        }
        else if (invalidReqcount==5){
            ErrorMessage.setText("Sorry, your account is locked!" );
        }
        else   if (usernameInput.equals(correctUsername) && passwordInput.equals(correctPassword)){
            ErrorMessage.setText("Login Successful");
            invalidReqcount=0;
        }
        else { ErrorMessage.setText("Invalid username or Password.");
            invalidReqcount++;
        }

    }
}