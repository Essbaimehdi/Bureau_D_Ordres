/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logmederne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elmeh
 */
public class Connex {
     
  public static Connection getCon()
    {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          return DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiant","root","");
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Connex.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Connex.class.getName()).log(Level.SEVERE, null, ex);
      }
       return null;
     
       
    }
    public static void main(String[] args){
        getCon();
    }
    }                             

