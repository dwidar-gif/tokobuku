/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yudistira;

import Koneksi.konek;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Ryan
 */
public class DataPengiriman extends javax.swing.JInternalFrame {
DefaultTableModel dtm;
String tanggal1;
    /**
     * Creates new form DataPenjualanBuku
     */
    public DataPengiriman() {
        initComponents();
        tampil_tabel();
    }
    
    public void tampil_tabel(){
        Object[] Baris={"No Faktur","Tanggal Jatuh Tempo","Kode Pelanggan","Nama Pelanggan","Alamat Pelanggan","No Telp Pelanggan","Kode Buku","Jenis Buku","Judul Buku","Jumlah Buku","Jenis Pembayaran","Total Pengiriman"};
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
        TableColumn col5 = jTable1.getColumnModel().getColumn(5);
        col5.setPreferredWidth(150);
        TableColumn col6 = jTable1.getColumnModel().getColumn(6);
        col6.setPreferredWidth(150);
        TableColumn col7 = jTable1.getColumnModel().getColumn(7);
        col7.setPreferredWidth(150);
        TableColumn col8 = jTable1.getColumnModel().getColumn(8);
        col8.setPreferredWidth(150);        
        TableColumn col9 = jTable1.getColumnModel().getColumn(9);
        col9.setPreferredWidth(150);
        TableColumn col10 = jTable1.getColumnModel().getColumn(10);
        col10.setPreferredWidth(150);
        TableColumn col11 = jTable1.getColumnModel().getColumn(11);
        col11.setPreferredWidth(150);
        
             java.sql.Connection con = new konek().connect();
         try{
           String sql="Select * from DataPengiriman";
           java.sql.Statement stmt= con.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String a=rslt.getString("NoFaktur");
               String b=rslt.getString("TglPengiriman");
               String c=rslt.getString("KdPelanggan");
               String d=rslt.getString("NmPelanggan");
               String e=rslt.getString("AlmtPelanggan");
               String f=rslt.getString("NoTelpPelanggan");
               String g=rslt.getString("KdBuku");
               String h=rslt.getString("JnsBuku");
               String i=rslt.getString("JdlBuku");
               String j=rslt.getString("JmlBuku");
               String k=rslt.getString("JnsPembayaran");
               String l=rslt.getString("TtlPengiriman");

               String[] dataField={a,b,c,d,e,f,g,h,i,j,k,l};
               dtm.addRow(dataField);
           }
       }catch(Exception ex){}
    }
    
    public void save () {
        java.sql.Connection conn = new konek().connect();

        try{
            String sql="insert into DataPengiriman(NoFaktur,TglPengiriman,KdPelanggan,NmPelanggan,AlmtPelanggan,NoTelpPelanggan,KdBuku,JnsBuku,JdlBuku,JmlBuku,JnsPembayaran,TtlPengiriman)values(?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt=conn.prepareStatement(sql);

            try{
                stmt.setString(1,jTextField1.getText());
                stmt.setString(2,tanggal1);
                stmt.setString(3,jTextField3.getText());
                stmt.setString(4,jTextField4.getText());
                stmt.setString(5,jTextArea1.getText());
                stmt.setString(6,jTextField6.getText());
                stmt.setString(8,jComboBox1.getSelectedItem().toString());
                stmt.setString(7,jTextField7.getText());
                stmt.setString(9,jTextField8.getText());
                stmt.setString(10,jTextField9.getText());
                stmt.setString(11,jComboBox2.getSelectedItem().toString());
                stmt.setString(12,jTextField10.getText());
                
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil di simpan");
                
                jTextField1.setText("");
                
                jTextField3.setText("");
                jTextField4.setText("");
                jTextArea1.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                
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
            String b=tanggal1;
            String c=jTextField3.getText();
            String d=jTextField4.getText();
            String e=jTextArea1.getText();
            String f=jTextField6.getText();
            String h=jComboBox1.getSelectedItem().toString();
            String g=jTextField7.getText();
            String i=jTextField8.getText();
            String j=jTextField9.getText();
            String k=jComboBox2.getSelectedItem().toString();
            String l=jTextField10.getText();
            
            
                try{
                            String query="UPDATE DataPengiriman SET TglPengiriman='"+b+"',KdPelanggan='"+c+"',NmPelanggan='"+d+"',AlmtPelanggan='"+e+"',NoTelpPelanggan='"+f+"',KdBuku='"+g+"',JnsBuku='"+h+"',JdlBuku='"+i+"',JmlBuku='"+j+"',JnsPembayaran='"+k+"',TtlPengiriman='"+l+"'where NoFaktur='"+a+"'";
               java.sql.PreparedStatement ps = conn.prepareStatement(query);
                try {
                     ps = conn.prepareStatement(query);
                    } catch (SQLException ex) {
            
                }
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                
                jTextField1.setText("");
                
                jTextField3.setText("");
                jTextField4.setText("");
                jTextArea1.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                
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
                String sql="delete from DataPengiriman where NoFaktur='"+jTextField1.getText()+"'";

                java.sql.PreparedStatement stmt=conn.prepareStatement(sql);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
                
                jTextField1.setText("");
                
                jTextField3.setText("");
                jTextField4.setText("");
                jTextArea1.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");

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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item", "Non Fiksi", "Fiksi", "Pelajaran Sekolah", "Perguruan Tinggi", "Anak-Anak", "Referensi" }));

        jLabel7.setText("No. Telepon");

        jLabel3.setText("Kode Pelanggan");

        jLabel1.setText("No Faktur");

        jLabel4.setText("Nama Pelanggan");

        jLabel10.setText("Jumlah Buku");

        jLabel11.setText("Jenis Pembayaran");

        jLabel8.setText("Kode Buku");

        jLabel9.setText("Jenis Buku");

        jLabel5.setText("Alamat Pelanggan");

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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item", "Tunai", "Kredit" }));

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tanggal Pengiriman");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("Data Pengiriman");

        jLabel13.setText("Judul Buku");

        jLabel14.setText("Total Pengiriman");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        java.sql.Connection conn = new konek().connect();
        DateFormat DF = new SimpleDateFormat("yyyy-MM-dd");
        
        int baris = jTable1.getSelectedRow();
        String a = dtm.getValueAt(baris, 0).toString();
        String b = dtm.getValueAt(baris, 1).toString();
        String c = dtm.getValueAt(baris, 2).toString();
        String d = dtm.getValueAt(baris, 3).toString();
        String e = dtm.getValueAt(baris, 4).toString();
        String f = dtm.getValueAt(baris, 5).toString();
        String g = dtm.getValueAt(baris, 6).toString();
        String h = dtm.getValueAt(baris, 7).toString();
        String i = dtm.getValueAt(baris, 8).toString();
        String j = dtm.getValueAt(baris, 9).toString();
        String k = dtm.getValueAt(baris, 10).toString();
        String l = dtm.getValueAt(baris, 11).toString();
        
        jTextField1.setText(a);
        
        try{
        String tanggal2 = b;
        Date d1=DF.parse(tanggal2);
        jDateChooser1.setDate(d1);
        }
        catch(Exception ex){}
        
        jTextField3.setText(c);
        jTextField4.setText(d);
        jTextArea1.setText(e);
        jTextField6.setText(f);
        jTextField7.setText(g);
        jComboBox1.setSelectedItem(h);
        jTextField8.setText(i);
        jTextField9.setText(j);
        jTextField10.setText(l);
        jComboBox2.setSelectedItem(k);
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if (jDateChooser1.getDate()!=null){
            SimpleDateFormat Format=new SimpleDateFormat("yyyy-MM-dd");
            tanggal1=Format.format(jDateChooser1.getDate());}
    }//GEN-LAST:event_jDateChooser1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
