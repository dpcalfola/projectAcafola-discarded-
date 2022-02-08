package databaseClass.loginConnection;

public class LoginVO {

    private String userID ;
    private String userPW ;

    public LoginVO(String userID, String userPW) {
        this.userID = userID;
        this.userPW = userPW;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPW() {
        return userPW;
    }
}
