/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplikasi;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.Timer;
/**
 *
 * @author user
 */
public class kasir extends javax.swing.JFrame {
    private PreparedStatement preparedStatement;
    private Integer KODE;
    /**
     * Creates new form kasir
     */
    
    public void Tampil_Tanggal() {
    java.util.Date tglsekarang = new java.util.Date();
    SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
    String tanggal = smpdtfmt.format(tglsekarang);
    label_tanggal.setText(tanggal);
}
    
    public kasir() {
        initComponents();
        Tampil_Tanggal();
    }
    public void hilang(){
        kode.setText("");
        makananminuman.setText("");
        harga.setText("");
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        makananminuman = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        jumlah = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        bayar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        label_tanggal = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Kode");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 110, 30);

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Makanan/Minuman");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 120, 190, 23);

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Jumlah");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 50, 60, 30);

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Harga");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 180, 110, 16);

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Subtotal");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 240, 110, 16);

        kode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });
        kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kodeKeyPressed(evt);
            }
        });
        jPanel1.add(kode);
        kode.setBounds(10, 80, 90, 26);

        makananminuman.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(makananminuman);
        makananminuman.setBounds(10, 140, 150, 26);

        harga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        jPanel1.add(harga);
        harga.setBounds(10, 200, 150, 26);

        subtotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(subtotal);
        subtotal.setBounds(10, 260, 150, 26);

        jumlah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jumlah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumlahStateChanged(evt);
            }
        });
        jPanel1.add(jumlah);
        jumlah.setBounds(130, 80, 40, 26);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Makanan/Minuman", "Jumlah", "Harga", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 120, 664, 350);

        tambah.setBackground(new java.awt.Color(255, 204, 204));
        tambah.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(290, 80, 110, 30);

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Total");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 310, 110, 23);

        txtotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtotal);
        txtotal.setBounds(10, 330, 150, 26);

        jLabel7.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel7.setText("Bayar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 120, 80, 16);

        txtbayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtbayar);
        txtbayar.setBounds(170, 140, 110, 26);

        jLabel8.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel8.setText("Balance");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 120, 100, 16);

        balance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(balance);
        balance.setBounds(300, 140, 100, 26);

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(170, 180, 230, 290);

        bayar.setBackground(new java.awt.Color(255, 204, 204));
        bayar.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        bayar.setText("BAYAR");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        jPanel1.add(bayar);
        bayar.setBounds(400, 80, 100, 30);

        jLabel9.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel9.setText("Tanggal :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 370, 90, 18);
        jPanel1.add(label_tanggal);
        label_tanggal.setBounds(10, 390, 130, 30);

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 10, 110, 30);

        cancel.setBackground(new java.awt.Color(255, 204, 204));
        cancel.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(180, 80, 110, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceGambar/Background1.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1200, 497);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String pcode = kode.getText();  
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_time","root","");
                pst = con.prepareStatement("select * from cafemenu where KODE = ?");
                pst.setString(1, pcode);
                rs = (ResultSet) pst.executeQuery();
                
                if(rs.next()== false)
                {    
                    JOptionPane.showMessageDialog(this, "Product Tidak Ditemukan");  
                }
                else
                {
                    String menu = rs.getString("MENU");
                     String price = rs.getString("HARGA");
                     makananminuman.setText(menu.trim());
                     harga.setText(price.trim());
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_kodeKeyPressed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void   Balance(){
        int total = Integer.parseInt(txtotal.getText());
        int pay = Integer.parseInt(txtbayar.getText());
        int bal = pay - total;
        
        balance.setText(String.valueOf(bal));
        
    }
    
    public void bill()
    {
        String total = txtotal.getText();
        String pay = txtbayar.getText();
        String bal = balance.getText();
        
          DefaultTableModel model = new DefaultTableModel();
        
        model = (DefaultTableModel)tabel.getModel();
        
         txtbill.setText(txtbill.getText() + "******************************************************\n");
         txtbill.setText(txtbill.getText() + " CAFE TIME                                     \n");
         txtbill.setText(txtbill.getText() + "*******************************************************\n");
        
         //Heading
          txtbill.setText(txtbill.getText() + "Product" + "\t" + "Price" + "\t" + "Amount" + "\n"  );
          
          
          for(int i = 0; i < model.getRowCount(); i++)
          {
              
              String pname = (String)model.getValueAt(i, 1);
              String price = (String)model.getValueAt(i, 3);
              String amount = (String)model.getValueAt(i, 4);
              
           txtbill.setText(txtbill.getText() + pname  + "\t" + price + "\t" + amount  + "\n"  );
    
          }
          
          txtbill.setText(txtbill.getText() + "\n");    
          
          txtbill.setText(txtbill.getText() + "\t" + "\t" + "Subtotal :" + total + "\n");
          txtbill.setText(txtbill.getText() + "\t" + "\t" + "Pay :" + pay + "\n");
          txtbill.setText(txtbill.getText() + "\t" + "\t" + "Balance :" + bal + "\n");
          txtbill.setText(txtbill.getText() + "\n");
          txtbill.setText(txtbill.getText() + "*******************************************************\n");
          txtbill.setText(txtbill.getText() + "           THANK YOU COME AGAIN             \n");
 
        
    }
    
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_time", "root", "");
            preparedStatement = connection.prepareStatement("insert into transaksi (KODE,MAKANAN_MINUMAN,HARGA,TERJUAL,TANGGAL) values (?,?,?,?,?)");
            preparedStatement.setString(1,kode.getText());
            preparedStatement.setString(2,makananminuman.getText());
            preparedStatement.setString(3,harga.getText());
            preparedStatement.setString(4,subtotal.getText());
            preparedStatement.setString(5,label_tanggal.getText());
            preparedStatement.execute();
            connection.close();            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)tabel.getModel();
        model.addRow(new Object[]
                
        {
            kode.getText(),
            makananminuman.getText(),
            jumlah.getValue().toString(),
            harga.getText(),
            subtotal.getText(),          
        });  
                
            int sum = 0;
                    
        for(int i = 0; i<tabel.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(tabel.getValueAt(i, 4).toString());
        }
        
        txtotal.setText(Integer.toString(sum));
          
          kode.setText("");
           makananminuman.setText("");
           harga.setText("");
           subtotal.setText("");
        kode.requestFocus();
        
        
    }//GEN-LAST:event_tambahActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
        Balance();
        bill();
    }//GEN-LAST:event_bayarActionPerformed

    private void jumlahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlahStateChanged
        // TODO add your handling code here:
        int qty = Integer.parseInt(jumlah.getValue().toString());
        int price = Integer.parseInt(harga.getText());
        int tot = qty * price;

        subtotal.setText(String.valueOf(tot));
    }//GEN-LAST:event_jumlahStateChanged

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new login().show();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        hilang();
        tabel.clearSelection();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField balance;
    private javax.swing.JButton bayar;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jumlah;
    private javax.swing.JTextField kode;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JButton logout;
    private javax.swing.JTextField makananminuman;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtotal;
    // End of variables declaration//GEN-END:variables
}
