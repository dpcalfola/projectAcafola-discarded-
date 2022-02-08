package startapp.project_acafola;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws IOException {
        System.out.println("LoginButton Clicked!!");


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}