/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yudistira;

import Koneksi.konek;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SERVER
 */
public class menuUtama extends javax.swing.JFrame {
JTextField jt1 = new JTextField();
JTextField jt2 = new JTextField();
JTextField jt3 = new JTextField();
JTextField jt4 = new JTextField();

    /**
     * Creates new form menuUtama
     */
    public menuUtama() {
        initComponents();
        setLocationRelativeTo(null);
         Locale locale = new Locale ("id", "ID");
        Locale.setDefault(locale);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new JDesktopPaneGambar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1343, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jMenu3.setText("File");

        jMenuItem9.setText("Log Out");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Input Data");

        jMenuItem1.setText("Data Buku");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Data Karyawan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Data Pelanggan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Data Pembayaran");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Data Pemesanan Buku");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Data Penagihan");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Data Pengiriman");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Data Penjualan Buku");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Laporan");

        jMenuItem10.setText("Laporan Data Buku");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem13.setText("Laporan Data Pemesanan Buku");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Laporan Data Pembayaran");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem15.setText("Laporan Data Pengiriman");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("Laporan Data Penjualan Buku");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DataBuku DB = new DataBuku();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DataKaryawan DB = new DataKaryawan();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        DataPelanggan DB = new DataPelanggan();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        DataPembayaran DB = new DataPembayaran();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        DataPemesananBuku DB = new DataPemesananBuku();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        DataPenagihan DB = new DataPenagihan();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        DataPengiriman DB = new DataPengiriman();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        DataPenjualanBuku DB = new DataPenjualanBuku();
        jDesktopPane2.add(DB);
        DB.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Thanks for use");
        this.setVisible(false);
        
        Login lg = new Login();
        lg.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        printbuku();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        printpemesananbuku();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        PrintPenjualanBuku();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        PrintPembayaranBuku();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        PrintPengirimanBuku();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

     public void printbuku(){
        java.sql.Connection conn = new konek().connect();
        
        try{
            String path="src"+File.separator+"travelbooking"+File.separator+"DataBuku.jasper";
            String  repot="src/yudistira/DataBuku.jasper";
            HashMap hash = new HashMap();
            //hash.put();
            
            File file = new File(repot);
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint  jp = JasperFillManager.fillReport(jr, hash, conn);
            //JasPri = JasperFillManager.fillReport(JasRep, Param, konek.connect());
            JasperViewer.viewReport(jp, false);
            
            /*JRViewer viewer = new JRViewer(jp);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            jScrollPane1.add(viewer);
            jScrollPane1.setViewportView(viewer);*/
           }catch(Exception ex){
            System.out.println(ex);
        }
    }
     
     public void printpemesananbuku(){
        java.sql.Connection conn = new konek().connect();
        
        try{
            String JR = JOptionPane.showInputDialog("Masukan Bulan Pemesanan");
            jt1.setText(JR);
            String  repot="src/yudistira/DataPemesananBuku.jasper";
            HashMap hash = new HashMap();
            hash.put("parameter1", jt1.getText());

            File file = new File(repot);
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint  jp = JasperFillManager.fillReport(jr, hash, conn);
            //JasPri = JasperFillManager.fillReport(JasRep, Param, konek.connect());
            JasperViewer.viewReport(jp, false);
            
            /*JRViewer viewer = new JRViewer(jp);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            jScrollPane1.add(viewer);
            jScrollPane1.setViewportView(viewer);*/
           }catch(Exception ex){
            System.out.println(ex);
        }
    }
     
     public void PrintPenjualanBuku(){
        java.sql.Connection conn = new konek().connect();
        
        try{
            String JR = JOptionPane.showInputDialog("Masukan Nomor Faktur");
            jt1.setText(JR);
            String  repot="src/yudistira/DataPenjualan.jasper";
            HashMap hash = new HashMap();
            hash.put("parameter1", jt1.getText());

            File file = new File(repot);
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint  jp = JasperFillManager.fillReport(jr, hash, conn);
            //JasPri = JasperFillManager.fillReport(JasRep, Param, konek.connect());
            JasperViewer.viewReport(jp, false);
            
            /*JRViewer viewer = new JRViewer(jp);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            jScrollPane1.add(viewer);
            jScrollPane1.setViewportView(viewer);*/
           }catch(Exception ex){
            System.out.println(ex);
        }
    }
     
     public void PrintPembayaranBuku(){
        java.sql.Connection conn = new konek().connect();
        
        try{
            String JR = JOptionPane.showInputDialog("Masukan Nomor Faktur");
            jt1.setText(JR);
            String  repot="src/yudistira/PembayaranBuku.jasper";
            HashMap hash = new HashMap();
            hash.put("parameter1", jt1.getText());

            File file = new File(repot);
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint  jp = JasperFillManager.fillReport(jr, hash, conn);
            //JasPri = JasperFillManager.fillReport(JasRep, Param, konek.connect());
            JasperViewer.viewReport(jp, false);
            
            /*JRViewer viewer = new JRViewer(jp);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            jScrollPane1.add(viewer);
            jScrollPane1.setViewportView(viewer);*/
           }catch(Exception ex){
            System.out.println(ex);
        }
    }
     
     public void PrintPengirimanBuku(){
        java.sql.Connection conn = new konek().connect();
        
        try{
            //String JR = JOptionPane.showInputDialog("Masukan Tanggal Penjualan Buku");
            //jt1.setText(JR);
            String  repot="src/yudistira/DataPengiriman.jasper";
            HashMap hash = new HashMap();
            //hash.put("parameter1", jt1.getText());

            File file = new File(repot);
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint  jp = JasperFillManager.fillReport(jr, hash, conn);
            //JasPri = JasperFillManager.fillReport(JasRep, Param, konek.connect());
            JasperViewer.viewReport(jp, false);
            
            /*JRViewer viewer = new JRViewer(jp);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            jScrollPane1.add(viewer);
            jScrollPane1.setViewportView(viewer);*/
           }catch(Exception ex){
            System.out.println(ex);
        }
    }
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
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
