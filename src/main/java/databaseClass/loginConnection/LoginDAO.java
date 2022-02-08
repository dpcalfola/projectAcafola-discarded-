package databaseClass.loginConnection;

import databaseClass.ConnDB;

import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginDAO {

    public ArrayList<LoginVO> loginInfoList() {
        ArrayList<LoginVO> list = new ArrayList<>();

        try {
            ConnDB loginConn = new ConnDB();
            loginConn.connDB();

            String query = "SELECT * FROM user";
            ResultSet loginResult = loginConn.getStatement().executeQuery(query);

            while (loginResult.next()){
                String userID = loginResult.getString("user_id");
                String userPW = loginResult.getString("user_pw");

                LoginVO data = new LoginVO(userID, userPW);
                list.add(data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list ;
    }

}
