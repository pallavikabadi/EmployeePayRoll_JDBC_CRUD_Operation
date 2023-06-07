
package com.bridgelabz.UC3;

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
            /*UC3::
            * Insert Value Into Table*/

            try (Statement statement = conn.createStatement()) {
                String insertQuery = "insert into employee_payroll (id,name,gender,age,address,phoneNumber,department,salary,basic_pay,deductions,taxable_pay,income_tax,net_pay)" +
                        " values(1,'Pallavi','female',20,'pune',6578989543,'IT',5000,4000000,60000,10000,20000,1700000)," +
                        "(2,'Ajit','male',22,'A.Nagar',567686689,'Civil',6000,5000000,30000,10000,40000,2000000)," +
                        "(3,'Terisa','female',25,'Mumbai',545455768,'Mech',11000,3000000,90000,12000,50000,2500000)";
                statement.executeUpdate(insertQuery);
                System.out.println("Values Added Successfully");
            }



        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
