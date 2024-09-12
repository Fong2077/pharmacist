/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author baste
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("insert into appuser (userRole,hoTen,ngaySinh,sdt,email,username,password,diaChi) values('Admin','thanh','19/06/2002','0779710383','ntphong2027@gmail.com','phong2','phong','Cai rang') ");

            JOptionPane.showMessageDialog(null, "Tạo table thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cook");
        }
    }
}
