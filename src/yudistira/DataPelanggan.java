/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yudistira;

import Koneksi.konek;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Ryan
 */
public class DataPelanggan extends javax.swing.JInternalFrame {
DefaultTableModel dtm;
    /**
     * Creates new form DataPelanggan
     */
    public DataPelanggan() {
        initComponents();
        Locale locale = new Locale ("id", "ID");
        Locale.setDefault(locale);
        tampil_tabel();
    }

    public void tampil_tabel(){
        Object[] Baris={"Kode Pelanggan","Nama Pelanggan","Alamat Pelanggan","No Telp Pelanggan","Email Pelanggan"};
        dtm = new DefaultTableModel(null, Baris);
        jTable1.setModel(dtm);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        TableColumn col0 = jTable1.getColumnModel().getColumn(0);
        col0.setPreferredWidth(150);
        TableColumn col1 = jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(150);
        TableColumn col2 = jTable1.getColumnModel().getColumn(2);
        col2.setPreferredWidth(150);
        TableColumn col3 = jTable1.getColumnModel().getColumn(3);
        col3.setPreferredWidth(150);        
        TableColumn col4 = jTable1.getColumnModel().getColumn(4);
        col4.setPreferredWidth(150);
        
             java.sql.Connection con = new konek().connect();
         try{
           String sql="Select * from DataPelanggan";
           java.sql.Statement stmt= con.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String a=rslt.getString("KdPelanggan");
               String b=rslt.getString("Nmpelanggan");
               String c=rslt.getString("AlmtPelanggan");
               String d=rslt.getString("NoTelpPelanggan");
               String e=rslt.getString("EmailPelanggan");

               String[] dataField={a,b,c,d,e};
               dtm.addRow(dataField);
           }
       }catch(Exception ex){}
    }
    
    public void save () {
        java.sql.Connection conn = new konek().connect();

        try{
            String sql="insert into DataPelanggan(KdPelanggan,NmPelanggan,AlmtPelanggan,NoTelpPelanggan,EmailPelanggan)values(?,?,?,?,?)";
            java.sql.PreparedStatement stmt=conn.prepareStatement(sql);

            try{
                stmt.setString(1,jTextField1.getText());
                stmt.setString(2,jTextField2.getText());
                stmt.setString(3,jTextArea1.getText());
                stmt.setString(4,jTextField4.getText());
                stmt.setString(5,jTextField5.getText());
                
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil di simpan");
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                
            }catch(SQLException se){
                System.out.println("Gagal di simpan");
                System.out.println(se);
                JOptionPane.showMessageDialog(null,"Data Gagal di simpan");
            }
            stmt.close();
        }catch(Exception e){}
    }
    public void update(){
         java.sql.Connection conn = new konek().connect();
            String a=jTextField1.getText();
            String b=jTextField2.getText();
            String c=jTextArea1.getText();
            String d=jTextField4.getText();
            String e=jTextField5.getText();
            
                try{
                            String query="UPDATE datapelanggan SET nmPelanggan='"+b+"',Almtpelanggan='"+c+"',NoTelpPelanggan='"+d+"',EmailPelanggan='"+e+"'where KdPelanggan='"+a+"'";
               java.sql.PreparedStatement ps = conn.prepareStatement(query);
                try {
                     ps = conn.prepareStatement(query);
                    } catch (SQLException ex) {
            
                }
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                
            }catch(SQLException sex){
            System.out.println("Gagal Diubah");
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");}
        
    }
    
    public void delete(){
        //panggil method koneksi
        java.sql.Connection conn = new konek().connect();
        
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Anda yakin?","Konfirmasi",JOptionPane.YES_NO_OPTION);

        if(ok==0){
            try{
                String sql="delete from Datapelanggan where KdPelanggan='"+jTextField1.getText()+"'";

                java.sql.PreparedStatement stmt=conn.prepareStatement(sql);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal di hapus");
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Kode Pelanggan");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Alamat Pelanggan");

        jLabel4.setText("No. Telepon");

        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("Data Pelanggan");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        save();
        tampil_tabel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        update();
        tampil_tabel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        delete();
        tampil_tabel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        java.sql.Connection conn = new konek().connect();
        
        int baris = jTable1.getSelectedRow();
        String a = dtm.getValueAt(baris, 0).toString();
        String b = dtm.getValueAt(baris, 1).toString();
        String c = dtm.getValueAt(baris, 2).toString();
        String d = dtm.getValueAt(baris, 3).toString();
        String e = dtm.getValueAt(baris, 4).toString();
        
        jTextField1.setText(a);
        jTextField2.setText(b);
        jTextArea1.setText(c);
        jTextField4.setText(d);
        jTextField5.setText(e);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
