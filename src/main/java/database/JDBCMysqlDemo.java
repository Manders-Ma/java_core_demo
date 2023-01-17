package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMysqlDemo {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://127.0.0.1:3306/data?serverTimezone=UTC";
    String uname = "root";
    String password = "881626";
    String query = "select * from employee";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }

    Connection connection = DriverManager.getConnection(url, uname, password);
    if (connection != null) {
      System.out.println("Connected to the database!");
    } else {
      System.out.println("Failed to make connection");
      System.exit(1);
    }


    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    while (rs.next()) {
      String employeeData = "";
      for (int i = 1; i <= 7; i++) {
        employeeData += rs.getString(i) + ":";
      }
      System.out.println(employeeData);
    }
    connection.close();



  }

}
