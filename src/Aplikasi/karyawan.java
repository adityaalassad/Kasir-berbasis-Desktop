/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplikasi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class karyawan extends javax.swing.JFrame {
    public DefaultTableModel dtm;
    private Integer ID;
    private PreparedStatement preparedStatement;
    /**
     * Creates new form karyawan
     */
    public karyawan() {
        initComponents();
        dtm = new DefaultTableModel();
        setLocationRelativeTo(this);
        tabel.setModel(dtm);
        dtm.addColumn("id");
        dtm.addColumn("nama");
        dtm.addColumn("nik");
        dtm.addColumn("jenis kelamin");
        dtm.addColumn("umur");
        dtm.addColumn("asal kota");
        dtm.addColumn("bagian");
        tampil();
    }
    public void hilang(){
        id.setText("");
        nama.setText("");
        nik.setText("");
        jeniskelamin.setText("");
        umur.setText("");
        asalkota.setText("");
        bagian.setText("");
    }
    public void tampil(){
        dtm.setRowCount(0);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_time", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from pegawai");
            while(resultset.next()){
                dtm.addRow(new Object[] {resultset.getInt(1),resultset.getString(2),resultset.getString(3),resultset.getString(4),resultset.getString(5),resultset.getString(6),resultset.getString(7)});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        tabelku = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        nik = new javax.swing.JTextField();
        jeniskelamin = new javax.swing.JTextField();
        umur = new javax.swing.JTextField();
        asalkota = new javax.swing.JTextField();
        bagian = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        tabelku.setViewportView(tabel);

        jPanel1.add(tabelku);
        tabelku.setBounds(260, 92, 795, 330);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(50, 120, 84, 22);
        jPanel1.add(nama);
        nama.setBounds(70, 150, 180, 22);
        jPanel1.add(nik);
        nik.setBounds(70, 190, 180, 22);
        jPanel1.add(jeniskelamin);
        jeniskelamin.setBounds(120, 220, 130, 22);
        jPanel1.add(umur);
        umur.setBounds(80, 250, 170, 22);
        jPanel1.add(asalkota);
        asalkota.setBounds(100, 280, 150, 22);
        jPanel1.add(bagian);
        bagian.setBounds(90, 310, 160, 22);

        simpan.setBackground(new java.awt.Color(255, 204, 204));
        simpan.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan);
        simpan.setBounds(20, 350, 110, 31);

        cancel.setBackground(new java.awt.Color(255, 204, 204));
        cancel.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(130, 350, 120, 31);

        edit.setBackground(new java.awt.Color(255, 204, 204));
        edit.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit);
        edit.setBounds(20, 390, 110, 31);

        delete.setBackground(new java.awt.Color(255, 204, 204));
        delete.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(130, 390, 120, 30);

        home.setBackground(new java.awt.Color(255, 204, 204));
        home.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(26, 35, 122, 51);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Umur");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 250, 110, 23);

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Jenis Kelamin");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 220, 150, 23);

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Nik");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 60, 23);

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 70, 23);

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 120, 15, 23);

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Bagian");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 310, 120, 23);

        jLabel7.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel7.setText("Asal Kota");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 280, 100, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceGambar/Background1.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, -10, 1120, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_time", "root", "");
            preparedStatement = connection.prepareStatement("insert into pegawai (ID,NAMA,NIK,JENIS_KELAMIN,UMUR,ASAL_KOTA,BAGIAN) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1,id.getText());
            preparedStatement.setString(2,nama.getText());
            preparedStatement.setString(3,nik.getText());
            preparedStatement.setString(4,jeniskelamin.getText());
            preparedStatement.setString(5,umur.getText());
            preparedStatement.setString(6,asalkota.getText());
            preparedStatement.setString(7,bagian.getText());
            preparedStatement.execute();
            connection.close();            
            tampil(); 
            hilang();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        hilang();
        tabel.clearSelection();
    }//GEN-LAST:event_cancelActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_time", "root", "");
            preparedStatement = connection.prepareStatement("update pegawai set ID = ?, NAMA = ?,NIK = ?,JENIS_KELAMIN = ?,UMUR = ?,ASAL_KOTA = ?,BAGIAN = ? where ID = '"+id.getText()+"'");
            preparedStatement.setString(1,id.getText());
            preparedStatement.setString(2,nama.getText());
            preparedStatement.setString(3,nik.getText());
            preparedStatement.setString(4,jeniskelamin.getText());
            preparedStatement.setString(5,umur.getText());
            preparedStatement.setString(6,asalkota.getText());
            preparedStatement.setString(7,bagian.getText());            
            preparedStatement.execute();
            connection.close();            
            tampil(); 
            hilang();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_time", "root", "");
            preparedStatement = connection.prepareStatement("delete from pegawai where ID = ?");
            preparedStatement.setString(1, ID.toString());
            preparedStatement.execute();
            connection.close();
            tampil();
            hilang();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        ID = (Integer) tabel.getValueAt(tabel.getSelectedRow(),0);
        id.setText(tabel.getValueAt(tabel.getSelectedRow(),0).toString());
        nama.setText(tabel.getValueAt(tabel.getSelectedRow(),1).toString());
        nik.setText(tabel.getValueAt(tabel.getSelectedRow(),2).toString());                
        jeniskelamin.setText(tabel.getValueAt(tabel.getSelectedRow(),3).toString());                
        umur.setText(tabel.getValueAt(tabel.getSelectedRow(),4).toString());                
        asalkota.setText(tabel.getValueAt(tabel.getSelectedRow(),5).toString());  
        bagian.setText(tabel.getValueAt(tabel.getSelectedRow(),6).toString());    
    }//GEN-LAST:event_tabelMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        new home().show();
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed
                              
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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asalkota;
    private javax.swing.JTextField bagian;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jeniskelamin;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JScrollPane tabelku;
    private javax.swing.JTextField umur;
    // End of variables declaration//GEN-END:variables
}
