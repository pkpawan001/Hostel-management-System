package IMGPACKAGE;








/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author pawan
 */
public class conne {

    public Connection c;
    public Statement s;

   public static Connection getCon() {
   

    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "root");
             return c;
//            if (c != null) {
//                System.out.println("conected");
//            }
        }
               catch (Exception e) {
            
//            e.printStackTrace();
//            System.out.println(e);

                 return null;
        }
  }
 
}    
//    }
//    public static void main(String args[]) {

//   }
