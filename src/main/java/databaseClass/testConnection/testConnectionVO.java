package databaseClass.testConnection;

public class testConnectionVO {

    private int test_id ;
    private String value1 ;
    private String value2 ;

    public testConnectionVO(int test_id, String value1, String value2) {
        this.test_id = test_id;
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getTest_id() {
        return test_id;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}
