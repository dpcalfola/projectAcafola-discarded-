package databaseClass.testConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class testConnectionDAO {


    String url = "jdbc:mysql://localhost:3306/project_Acafola";
//    String url = "jdbc:mysql://localhost:3306/EZEN";
    String user = "fola";
    String password = "123456789";

    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;


    public ArrayList<testConnectionVO> testConnectList() {
        ArrayList<testConnectionVO> list = new ArrayList<>();

        try {
            connDB();
            String query = "SELECT * FROM test";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int testId = resultSet.getInt("test_id");
                String value1 = resultSet.getString("value1");
                String value2 = resultSet.getString("value2");

                testConnectionVO data = new testConnectionVO(testId, value1, value2);
                list.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    public void connDB() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected with MySQL database successfully");
            statement = conn.createStatement();
            System.out.println("Created Statement Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
