
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tejas eknath jogale
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionClass {
    public Connection returnConObj(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system?zeroDateTimeBehavior=CONVERT_TO_NULL", "root","");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
