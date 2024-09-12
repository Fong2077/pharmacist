/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import com.sun.jdi.connect.spi.Connection;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author baste
 */
public class ConnectionProvider {

//    public static Connection getCon() {
//        try {
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","123456");
//            return con;
//        } catch (Exception e) {
//            System.out.println(e);
//            return null;
//        }
//    }
    
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
                    + "pharmacy?useUnicode=true&characterEncoding=utf-8", "root", "");
            System.out.println("Ket noi CSDL  \"pharmacy\" thanh cong...");
        } catch (Exception e) {
            System.out.println("Connect failure!");
            System.out.println("Ket noi CSLD \"pharmacy\" that bai ... ");
            System.out.println("--------------------------------------------------------------------");
//            er.printStackTrace();
        }
        return conn;
            
    }
    
    
    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/db_quanlydiemsinhvien";
//        var user = "root";
//        var password = "";
//
//        try (Connection conn = DriverManager.getConnection(url, user, password)) {
//            System.out.println("Ket noi CSDL thanh cong");
//            System.out.println(conn.getCatalog());
//        } catch (SQLException ex) {
//            Logger.getLogger(Myconnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
        getConnection();
        
    }
    
    
    
    
}
