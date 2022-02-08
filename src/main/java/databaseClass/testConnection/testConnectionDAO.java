package databaseClass.testConnection;

import java.sql.ResultSet;
import java.util.ArrayList;

public class testConnectionDAO {


    private ResultSet resultSet;


    public ArrayList<testConnectionVO> testConnectList() {
        ArrayList<testConnectionVO> list = new ArrayList<>();

        try {
            ConnDB testconn = new ConnDB();
            testconn.connDB();


            String query = "SELECT * FROM test";
            resultSet = testconn.getStatement().executeQuery(query);

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


}
