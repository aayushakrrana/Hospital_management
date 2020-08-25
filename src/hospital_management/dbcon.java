/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;
//import java.*;
import java.sql.*;
/**
 *
 * @author AAYUSH_RANA
 */
public class dbcon {
    public static Connection getCon()
    {
        Connection con =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement s = con.createStatement();
           // System.out.println("::::Drivers Registered::::");
        }
        catch(Exception e)
        {
        }
        
        return con;
    }
}
