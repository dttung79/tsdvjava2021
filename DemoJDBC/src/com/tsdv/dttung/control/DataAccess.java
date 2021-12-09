package com.tsdv.dttung.control;

import java.sql.*;

public class DataAccess {
     protected Connection connectDB() throws SQLException {
        String url = "jdbc:mysql://localhost/tsdv";
        String user = "tsdv";
        String pass = "tsdv";
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }

    protected ResultSet selectAll(String table) throws SQLException {
        Connection conn = connectDB();
        String sql = "SELECT * from " + table;
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery(sql);
        conn.close();
        return res;
    }

    protected boolean deleteByID(String table, String idCol, int id) throws SQLException {
        Connection conn = connectDB();
        String sql = "DELETE FROM " + table + " WHERE " + idCol + " = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, id);

        int nRows = stm.executeUpdate();
        conn.close();
        return nRows != 0;
    }
}
