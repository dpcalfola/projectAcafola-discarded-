package databaseClass.testConnection;

import java.util.ArrayList;

public class testConnection {

    testConnectionDAO dao = new testConnectionDAO();
    ArrayList<testConnectionVO> list = dao.testConnectList();

    public void testConnect(){



        for (int i = 0; i < list.size(); i++) {
            testConnectionVO data = list.get(i);
            int test_id = data.getTest_id();
            String value1 = data.getValue1();
            String value2 = data.getValue2();

            System.out.printf("%d %s %s\n", test_id, value1, value2);
        }
    }
}
