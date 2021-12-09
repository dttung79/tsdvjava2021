package com.tsdv.dttung;


import java.sql.*;
import java.util.Scanner;

public class DemoJDBC extends MenuProgram {
    @Override
    protected void printMenu() {
        System.out.println("DEMO JDBC PROGRAM");
        System.out.println("1. Show tables");
        System.out.println("2. Add a table");
        System.out.println("3. Select all customer");
        System.out.println("4. Select customer by name");
        System.out.println("5. Delete customer by id");
    }

    @Override
    protected void doTask(int choice) {
        switch (choice) {
            case 1: showTables(); break;
            case 2: addTable(); break;
            case 3: showAllCustomers(); break;
            case 4: searchCustomer(); break;
            case 5: deleteCustomer(); break;
        }
    }

    private void deleteCustomer() {
        System.out.print("Enter customer number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        try {
            Connection conn = connectDB();
            String sql = "DELETE FROM customers WHERE customerNumber = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, number);

            int nRows = stm.executeUpdate();
            if (nRows == 0) {
                System.out.println("Customer not found!");
            } else {
                System.out.println("Delete successful!");
            }

            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void searchCustomer() {
        System.out.print("Enter customer number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        try {
            Connection conn = connectDB();
            String sql = "SELECT customerNumber, customerName from customers WHERE customerNumber = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, number);
            ResultSet res = stm.executeQuery();
            if (!res.next()) System.out.println("Customer not found!");
            do {
                number = res.getInt("customerNumber");
                String name = res.getString("customerName");
                System.out.println("(" + number + ", " + name + ")");
            } while (res.next());

            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void showAllCustomers() {
        try {
            Connection conn = connectDB();
            String sql = "SELECT customerNumber, customerName from customers";
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                int number = res.getInt("customerNumber");
                String name = res.getString("customerName");
                System.out.println("(" + number + ", " + name + ")");
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void addTable() {
        try {
            Connection conn = connectDB();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter table name: ");
            String tbl = sc.nextLine();
            String sql = "CREATE TABLE " + tbl  + " (id int auto_increment primary key)";
            Statement stm = conn.createStatement();
            stm.execute(sql);
            System.out.println("Table " + tbl + " is created successful");
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void showTables() {
        System.out.println("All tables in tsdv DB");
        try {
            Connection conn = connectDB();
            Statement stm = conn.createStatement();
            String sql = "select TABLE_NAME from information_schema.tables WHERE TABLE_TYPE='BASE TABLE'";
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getString("TABLE_NAME"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private Connection connectDB() throws SQLException {
        String url = "jdbc:mysql://localhost/tsdv";
        String user = "tsdv";
        String pass = "tsdv";
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}
