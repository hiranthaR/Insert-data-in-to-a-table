/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdatabase.databse.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hirantha
 */
public class Connect {

    Connection a;
    private String url;
    private String driver;
    private String uname;
    private String pword;
    private String dbname;

    private Connection getConnection() {
        a = null;
        url = "jdbc:mysql://localhost:3306/";
        driver = "com.mysql.jdbc.Driver";
        uname = "root";
        pword = "";
        dbname = "inserttable";
        try {
            Class.forName(driver).newInstance();
            a = DriverManager.getConnection(url + dbname, uname, pword);
            System.out.println("Connected");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return a;
    }

//    to get somthing,insert a coorect query to here
    public ResultSet getQuery(String query) {
        ResultSet r = null;
        try {
            a = getConnection();
            Statement s = a.createStatement();
            r = s.executeQuery(query); //by executing we can get a result set

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }

//    to set a something insert a correct query to here
    public boolean setQuery(String query) {

        try {
            a = getConnection();
            Statement s = a.createStatement();
            s.execute(query);

            return true; // query sucessfull
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
            return false; // query failed
        }
    }
}
