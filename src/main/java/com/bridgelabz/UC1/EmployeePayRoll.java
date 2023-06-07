package com.bridgelabz.UC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayRoll {
    public static void main(String[] args) {
        /*
         * connections
         */
        String url ="jdbc:mysql://localhost:3306/payroll_service";

        String username = "root";
        String password = "root";

        /*
         * making connection with database
         */
        try(Connection connection = DriverManager.getConnection(url,username,password)){

            try(Statement statement = connection.createStatement()){
                System.out.println("Connection successfull");
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
