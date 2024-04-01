/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CustomerInfo {
    public static void main (String[] args)
    {
        Connection conn = null;
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindetails","root","root@123");
        }
        catch(Exception e)
        {
            System.out.println("exit");
        }
        if(conn!=null)
        {
            System.out.println("connected to database!");
        }
        else
        {
            System.out.println("not connected to database!");
        }
    }
}
