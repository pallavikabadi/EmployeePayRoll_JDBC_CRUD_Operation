package com.bridgelabz.UC2;

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
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            /*UC2::
            * Creating Table*/
            try (Statement statement = conn.createStatement()) {
                String createTableQuery = "create table employee_payroll (id int primary key, name varchar(20), age int, gender varchar(20),address varchar(60),phoneNumber double,department varchar(20),salary double,basic_pay double," +
                        "deductions double,taxable_pay double,income_tax double,net_pay double)";
                statement.executeUpdate(createTableQuery);
                System.out.println("Table is created Successfully");
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
