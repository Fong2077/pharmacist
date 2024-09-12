/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.io.File;
import javax.swing.*;
import dao.PharmacyUtils;
import java.awt.Desktop;

/**
 *
 * @author baste
 */
public class OpenPdf {

    public static void openById(String id) {

        try {

//            if ((new File (PharmacyUtils.billPath+id+".pdf")).exists()) {
//                
//                Process p = Runtime
//                            .getRuntime()
//                            .exec("rund1132 url.dll,FileProtocolHandler"+PharmacyUtils.billPath+""+id+".pdf");
//                
//                
//            }else{
//                JOptionPane.showMessageDialog(null, "File không tồn tại!");
//            }
            if (new File(PharmacyUtils.billPath + id + ".pdf").exists()) {
                Desktop.getDesktop().open(new File(PharmacyUtils.billPath + id + ".pdf"));
            } else {
                JOptionPane.showMessageDialog(null, "File không tồn tại!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
