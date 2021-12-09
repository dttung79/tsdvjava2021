package com.tsdv.dttung.control;
import java.sql.*;
import com.tsdv.dttung.model.ProductLine;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductLineDA extends DataAccess {
    public ArrayList<ProductLine> selectAllProductLines() throws SQLException {
        ResultSet rs = selectAll("productlines");
        ArrayList<ProductLine> lines = new ArrayList<>();
        while (rs.next()) {
            String productLine = rs.getString("productLine");
            String textDesc = rs.getString("textDescription");
            String htmlDesc = rs.getString("htmlDescription");
            ProductLine pline = new ProductLine(productLine, textDesc, htmlDesc);
            lines.add(pline);
        }
        return lines;
    }
    public ProductLine selectProductLine(String productLine) {
        // prepare SQL statement with info
        // execute statement
        // get info from ResultSet to create a ProductLine object to return
        throw new UnsupportedOperationException();
    }
    public boolean deleteProductLine(ProductLine pline) {
        // call deleteByID
        throw new UnsupportedOperationException();
    }

    public boolean editProductLine(ProductLine pline) {
        // get info from pline
        // prepare SQL statement with info
        // execute statement
        throw new UnsupportedOperationException();
    }
}
