package databaseClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection  {




    String url = "jdbc:mysql://localhost:3306/project_Acafola";
    String user = "fola";
    String password = "123456789";

    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;


}
