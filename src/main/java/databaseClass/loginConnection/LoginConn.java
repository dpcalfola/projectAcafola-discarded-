package databaseClass.loginConnection;

import java.util.ArrayList;

public class LoginConn {

    LoginDAO dao = new LoginDAO();
    ArrayList<LoginVO> userInfoList = dao.loginInfoList();

    public void getLoginInfo() {



        for (LoginVO l : userInfoList) {
            String userID = l.getUserID();
            String userPW = l.getUserPW();

            System.out.printf("%s, %s\n", userID, userPW);
        }

    }
}
