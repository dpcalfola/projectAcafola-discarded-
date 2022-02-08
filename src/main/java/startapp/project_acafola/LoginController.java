package startapp.project_acafola;


import databaseClass.loginConnection.LoginConn;

import databaseClass.loginConnection.LoginDAO;
import databaseClass.loginConnection.LoginVO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    @FXML
    private TextField textFieldLoginID;
    @FXML
    private PasswordField passwordFieldLoginPW;
    @FXML
    private Text textGreetingMessage;


    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws IOException {
        System.out.println("LoginButton Clicked!!");
        checkUpIdentification();
    }


    private void checkUpIdentification() {

        // get text field data
        String getID = textFieldLoginID.getText();
        String getPW = passwordFieldLoginPW.getText();
        // print gotten text field data
        System.out.println("textField ID: " + getID);
        System.out.println("textField PW: " + getPW);


        //get DB data
        LoginDAO loginDAO = new LoginDAO();
        ArrayList<LoginVO> userInfoList = loginDAO.loginInfoList();
        String userID = userInfoList.get(0).getUserID();
        String userPW = userInfoList.get(0).getUserPW();
        // print gotten DB data
        System.out.println("DB userID: " + userID);
        System.out.println("DB userPW: " + userPW);

        // check up
        if (getID.equals(userID) && getPW.equals(userPW)){
            System.out.println("Login Successfully");
            textGreetingMessage.setText("Hello " + userID);
        }else {
            System.out.println("Incorrect User Information");
            textGreetingMessage.setText("Incorrect User Information");
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("Initialized");

    }
}