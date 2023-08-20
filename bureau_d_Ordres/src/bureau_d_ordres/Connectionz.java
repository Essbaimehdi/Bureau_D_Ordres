/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bureau_d_ordres;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author elmeh
 */
public class Connectionz {
   static  Connection conn;
   public static Connection getConnection(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_couriers","root","");
       }catch(Exception ex){
           System.out.println(""+ex);
       }
       return conn;
   }
    public static void main(String[] args){
        getConnection();
    }

   
}