
import dao.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author baste
 */
public class UpdateThuoc extends javax.swing.JFrame {
    
    private String numberPattern = "^[0-9]*$";
    /**
     * Creates new form UpdateThuoc
     */
    public UpdateThuoc() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUniqueId = new javax.swing.JTextField();
        txtSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTenthuoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTennsx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddSoluong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Cập nhật Thuốc");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 22, 285, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 850, 10));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, 38, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Thuốc ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 97, 70, -1));

        txtUniqueId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 92, 300, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        txtSearch.setText("Tìm kiếm");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 92, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên thuốc");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 152, 84, -1));

        txtTenthuoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtTenthuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 184, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tên nhà sản xuất");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 243, -1, -1));

        txtTennsx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtTennsx, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 281, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 329, 66, -1));

        txtSoluong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 367, 300, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Thêm số lượng");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 420, -1, -1));

        txtAddSoluong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtAddSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 415, 111, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Giá mỗi đơn vị");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 152, 118, -1));

        txtGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 184, 300, -1));

        txtUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        txtUpdate.setText("Cập nhật");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 232, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn muốn đóng Cập nhật Thuốc ?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        int checkThuocExist = 0;
        String uniqueId = txtUniqueId.getText();
        
        if (uniqueId.equals("")) {
            JOptionPane.showMessageDialog(null,"Thuốc Id không được để trống!" );
        } else {
//            SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyy");
            try {
                
                Connection conn = ConnectionProvider.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM thuoc WHERE uniqueId = '" + uniqueId + "' ");
                
                while (rs.next()) {
                    txtUniqueId.setEditable(false);
                    checkThuocExist = 1;
                    
                    txtTenthuoc.setText(rs.getString("tenThuoc"));
                    txtTennsx.setText(rs.getString("tenNSX"));
                    txtSoluong.setText(rs.getString("soLuong"));
                    txtGia.setText(rs.getString("gia"));
                    
                    txtSoluong.setEditable(false);
                   
                    
                } 
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            if (checkThuocExist == 0) {
                JOptionPane.showMessageDialog(null, "Thuốc Id không tồn tại!");
            }
            
        }
        
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        // TODO add your handling code here:
        
        String uniqueId = txtUniqueId.getText();
        String tenThuoc = txtTenthuoc.getText();
        String tenNSX = txtTennsx.getText();
        String soLuong = txtSoluong.getText();
        String gia = txtGia.getText();
        String addSoluong = txtAddSoluong.getText();
        
        int tongSoluong = 0;
        
        if (addSoluong.equals("")) {
            tongSoluong =Integer.parseInt(soLuong);
        }else{
            tongSoluong = Integer.parseInt(soLuong) + Integer.parseInt(addSoluong);  
        }
        
        if (uniqueId.equals("")) {
            JOptionPane.showMessageDialog(null, "Thuốc Id không được trống!");
        }else if (tenThuoc.equals("")){
            JOptionPane.showMessageDialog(null, "Tên thuốc không được để trống!");
        }else if (tenNSX.equals("")){
            JOptionPane.showMessageDialog(null, "Tên Nhà sản Xuất không được để trống!");
        }else if (soLuong.equals("")){
            JOptionPane.showMessageDialog(null, "Số lượng không được để trống!");
        }else if (gia.equals("")){
            JOptionPane.showMessageDialog(null, "Giá không được để trống!");
        }
        else if (!gia.matches(numberPattern)){
            JOptionPane.showMessageDialog(null, "Giá không hợp lệ !");
        }
        else if (!addSoluong.matches(numberPattern)){
            JOptionPane.showMessageDialog(null, "Số lượng thêm không hợp lệ !");
        }
        else{
            try {
                Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement("UPDATE thuoc set tenThuoc = ?,tenNSX = ?,soLuong = ?,gia = ? WHERE uniqueId = ? ");
                
                ps.setString(1, tenThuoc);
                ps.setString(2, tenNSX);
                ps.setInt(3, tongSoluong);
                ps.setString(4, gia);
                ps.setInt(5, Integer.parseInt(uniqueId));
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cập nhật thuốc thành công !");
                setVisible(false);
                new UpdateThuoc().setVisible(true);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
    }//GEN-LAST:event_txtUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateThuoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddSoluong;
    private javax.swing.JTextField txtGia;
    private javax.swing.JButton txtSearch;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTennsx;
    private javax.swing.JTextField txtTenthuoc;
    private javax.swing.JTextField txtUniqueId;
    private javax.swing.JButton txtUpdate;
    // End of variables declaration//GEN-END:variables
}
