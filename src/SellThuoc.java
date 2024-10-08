/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Common.OpenPdf;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ConnectionProvider;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.util.Calendar;
import dao.PharmacyUtils;

/**
 *
 * @author baste
 */
public class SellThuoc extends javax.swing.JFrame {

    private String username = "";
    private String numberPattern = "^[0-9]*$";
    private String hoaDonId = "";
    private int tongTienFinal = 0;

    /**
     * Creates new form SellThuoc
     */
    public SellThuoc() {
        initComponents();
    }

    public SellThuoc(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }

    private void tenthuoc(String tenOrUniqueId) {
        DefaultTableModel model = (DefaultTableModel) thuocTable.getModel();
        model.setRowCount(0);

        try {

            Connection conn = ConnectionProvider.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM thuoc WHERE tenThuoc LIKE '" + tenOrUniqueId + "%' or uniqueId LIKE '" + tenOrUniqueId + "%' ");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("uniqueId") + "- " + rs.getString("tenThuoc")

                });

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void ClearThuoc() {
        txtUniqueId.setText("");
        txtTenthuoc.setText("");
        txtTenNSX.setText("");
        txtGia.setText("");
        txtsoLuong.setText("");
        txtTongGia.setText("");
    }

    public String getUniqueId(String prefix) {
        return prefix + System.nanoTime();
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
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        thuocTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtUniqueId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenthuoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenNSX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsoLuong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTongGia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        btnAddtoCart = new javax.swing.JButton();
        btnThanhtoanInHoadon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbFinalTongTien = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Bán Thuốc");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 30, 246, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1363, 10));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1286, 18, 39, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tìm kiếm");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 128, -1, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 310, -1));

        thuocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thuốc"
            }
        ));
        thuocTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thuocTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(thuocTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 310, 520));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thuốc Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 128, 81, -1));

        txtUniqueId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 160, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên Thuốc");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 208, 86, -1));

        txtTenthuoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenthuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenthuocActionPerformed(evt);
            }
        });
        getContentPane().add(txtTenthuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 246, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên nhà sản xuất");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 294, -1, -1));

        txtTenNSX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtTenNSX, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 332, 300, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giá mỗi đơn vị");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 128, 127, -1));

        txtGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 160, 300, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Số lượng mỗi đơn vị");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 208, 153, -1));

        txtsoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtsoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsoLuongKeyReleased(evt);
            }
        });
        getContentPane().add(txtsoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 246, 300, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tổng giá sản phẩm");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 294, 144, -1));

        txtTongGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtTongGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 332, 300, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thuốc Id", "Tên Thuốc", "Tên NSX", "Giá mỗi đơn vị", "Số lượng", "Tổng giá"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 441, 699, 251));

        btnAddtoCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddtoCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnAddtoCart.setText("Thêm vào giỏ hàng");
        btnAddtoCart.setToolTipText("hàng");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1132, 380, -1, -1));

        btnThanhtoanInHoadon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThanhtoanInHoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        btnThanhtoanInHoadon.setText("Thanh toán và In hóa đơn");
        btnThanhtoanInHoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanInHoadonActionPerformed(evt);
            }
        });
        getContentPane().add(btnThanhtoanInHoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 710, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tổng cộng:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 710, -1, -1));

        lbFinalTongTien.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbFinalTongTien.setForeground(new java.awt.Color(255, 255, 255));
        lbFinalTongTien.setText("00");
        getContentPane().add(lbFinalTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminDashboardBackground.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTenthuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenthuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenthuocActionPerformed

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        tenthuoc("");

        txtUniqueId.setEditable(false);
        txtTenthuoc.setEditable(false);
        txtTenNSX.setEditable(false);
        txtGia.setEditable(false);
//        txtsoLuong.setEditable(false);
        txtTongGia.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String search = txtSearch.getText();
        tenthuoc(search);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void thuocTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thuocTableMouseClicked
        // TODO add your handling code here:

        int index = thuocTable.getSelectedRow();
        TableModel model = thuocTable.getModel();
        String tenOrUniqueId = model.getValueAt(index, 0).toString();

        String uniqueId[] = tenOrUniqueId.split("- ", 0);
        try {
            Connection conn = ConnectionProvider.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM thuoc WHERE uniqueId= '" + uniqueId[0] + "'");

            while (rs.next()) {
                txtUniqueId.setText(uniqueId[0]);
                txtTenthuoc.setText(rs.getString("tenThuoc"));
                txtTenNSX.setText(rs.getString("tenNSX"));
                txtGia.setText(rs.getString("gia"));
                txtsoLuong.setText("");
                txtTongGia.setText("");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_thuocTableMouseClicked

    private void txtsoLuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsoLuongKeyReleased
        // TODO add your handling code here:
        String soLuong = txtsoLuong.getText();
        if (!soLuong.equals("")) {
            String gia = txtGia.getText();
            if (!gia.matches(numberPattern)) {
                JOptionPane.showMessageDialog(null, "Số Lượng không phù hợp!");
            }

            int TongGia = Integer.parseInt(soLuong) * Integer.parseInt(gia);
            txtTongGia.setText(String.valueOf(TongGia));

        } else {
            txtTongGia.setText("");
        }
    }//GEN-LAST:event_txtsoLuongKeyReleased

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:

        String soLuong = txtsoLuong.getText();
        String uniqueId = txtUniqueId.getText();

        if (!soLuong.equals("") && !uniqueId.equals("")) {
            String tenThuoc = txtTenthuoc.getText();
            String tenNSX = txtTenNSX.getText();
            String gia = txtGia.getText();
            String TongGia = txtTongGia.getText();

            int checkStock = 0;
            int checkThuocExistInCart = 0;

            try {

                Connection conn = ConnectionProvider.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM thuoc WHERE uniqueId = " + uniqueId + " ");

                while (rs.next()) {
                    if (rs.getInt("soLuong") >= Integer.parseInt(soLuong)) {
                        checkStock = 1;

                    } else {
                        JOptionPane.showMessageDialog(null, "Thuốc hết hàng rồi. Chỉ còn " + rs.getInt("soLuong") + " Thôi...");
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            if (checkStock == 1) {
                DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
                if (cartTable.getRowCount() != 0) {
                    for (int i = 0; i < cartTable.getRowCount(); i++) {
                        if (Integer.parseInt(dtm.getValueAt(i, 0).toString()) == Integer.parseInt(uniqueId)) {
                            checkThuocExistInCart = 1;
                            JOptionPane.showMessageDialog(null, "Thuốc đã tồn tại trong giỏ hàng!!");
                        }
                    }
                }
                if (checkThuocExistInCart == 0) {
                    dtm.addRow(new Object[]{
                        uniqueId,
                        tenThuoc,
                        tenNSX,
                        gia,
                        soLuong,
                        TongGia
                    });
                    tongTienFinal = tongTienFinal + Integer.parseInt(TongGia);
                    lbFinalTongTien.setText(String.valueOf(tongTienFinal));
                    JOptionPane.showMessageDialog(null, "Thêm thành công!");
                }
                ClearThuoc();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Số lượng và thuốc Id không được trống !");
        }

    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here: Xóa khỏi cart
        int index = cartTable.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa thuốc này khỏi giỏ hàng không?", "select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            TableModel model = cartTable.getModel();
            String Tong = model.getValueAt(index, 5).toString();
            tongTienFinal = tongTienFinal - Integer.parseInt(Tong);
            lbFinalTongTien.setText(String.valueOf(tongTienFinal));
            ((DefaultTableModel) cartTable.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_cartTableMouseClicked

    private void btnThanhtoanInHoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoanInHoadonActionPerformed
        // TODO add your handling code here:
        if (tongTienFinal != 0) {
            hoaDonId = getUniqueId("hoadon- ");

            DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();

//            if (cartTable.getRowCount() != 0) {
//                
//                for (int i = 1 ; cartTable.getRowCount() > i; i++) {
//                    
//                    try {
//                        
//                        Connection conn = ConnectionProvider.getConnection();
//                        Statement st = conn.createStatement();
//                        ResultSet rs = st.executeQuery("UPDATE thuoc set soLuong = soLuong-"+Integer.parseInt(dtm.getValueAt(i,4 ).toString())
//                                + "WHERE uniqueId = "+Integer.parseInt(dtm.getValueAt(i, 0).toString()));
//                        
//                    } catch (Exception e) {
//                        JOptionPane.showMessageDialog(null, "cook");
//                    }
//                    
//                }
//            }
            if (cartTable.getRowCount() != 0) { //AI :D
                try (Connection conn = ConnectionProvider.getConnection()) {
                    for (int i = 0; i < cartTable.getRowCount(); i++) {
                        int medicineId = Integer.parseInt(dtm.getValueAt(i, 0).toString());
                        int quantityToUpdate = Integer.parseInt(dtm.getValueAt(i, 4).toString());

                        // Sử dụng prepared statement để ngăn chặn SQL injection
                        String sql = "UPDATE thuoc SET soLuong = soLuong - ? WHERE uniqueId = ?";
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setInt(1, quantityToUpdate);
                        ps.setInt(2, medicineId);

                        ps.executeUpdate();

             
                    }
                } catch (SQLException e) {
                    System.err.println("Error updating medicine quantities: " + e.getMessage());
                    // Cân nhắc xử lý lỗi cụ thể hơn dựa trên loại ngoại lệ
                }
            }

            try {

                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();
                Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement("INSERT INTO hoadon (hoaDonId,hoaDonDate,tongTien,nguoiTao) VALUES (?,?,?,?)");

                ps.setString(1, hoaDonId);
                ps.setString(2, myFormat.format(cal.getTime()));
                ps.setInt(3, tongTienFinal);
                ps.setString(4, "Tao");

                ps.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            //Tạo hóa đơn bằng tay :)))
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

            try {

                PdfWriter.getInstance(doc, new FileOutputStream(PharmacyUtils.billPath + "" + hoaDonId + ".pdf"));
                doc.open();
                Paragraph pharmacyName = new Paragraph("                                            He thong quan ly nha thuoc\n");
                doc.add(pharmacyName);
                Paragraph starline = new Paragraph("*******************************************************************************");
                doc.add(starline);
                Paragraph details = new Paragraph("\tHoa đon Id: " + hoaDonId + "\nNgay: " + new Date() + "\nTong tien: " + tongTienFinal);
                doc.add(details);
                doc.add(starline);

                PdfPTable tb1 = new PdfPTable(6);
                tb1.addCell("Thuoc Id");
                tb1.addCell("Ten thuoc");
                tb1.addCell("Ten  nha san xuat");
                tb1.addCell("Gia");
                tb1.addCell("So luong");
                tb1.addCell("Tong phu");

                for (int i = 0; cartTable.getRowCount() > i; i++) {

                    String a = cartTable.getValueAt(i, 0).toString();
                    String b = cartTable.getValueAt(i, 1).toString();
                    String c = cartTable.getValueAt(i, 2).toString();
                    String d = cartTable.getValueAt(i, 3).toString();
                    String e = cartTable.getValueAt(i, 4).toString();
                    String f = cartTable.getValueAt(i, 5).toString();

                    tb1.addCell(a);
                    tb1.addCell(b);
                    tb1.addCell(c);
                    tb1.addCell(d);
                    tb1.addCell(e);
                    tb1.addCell(f);

                }

                doc.add(tb1);
                doc.add(starline);
                Paragraph arigato = new Paragraph("*** Arigato, Thanks you, Cam on va hen gap lai ***");
                doc.add(arigato);

                //mở pdf
                OpenPdf.openById(String.valueOf(hoaDonId));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new SellThuoc(username).setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Vui lòng thêm thuốc vào giỏ hàng trước khi nhất nút thanh toán!!!");

        }
    }//GEN-LAST:event_btnThanhtoanInHoadonActionPerformed

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
            java.util.logging.Logger.getLogger(SellThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellThuoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnThanhtoanInHoadon;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbFinalTongTien;
    private javax.swing.JTable thuocTable;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNSX;
    private javax.swing.JTextField txtTenthuoc;
    private javax.swing.JTextField txtTongGia;
    private javax.swing.JTextField txtUniqueId;
    private javax.swing.JTextField txtsoLuong;
    // End of variables declaration//GEN-END:variables
}
