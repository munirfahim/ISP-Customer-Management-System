/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sirajum Munir Fahim
 */
public class CustomerDetails extends javax.swing.JFrame {

    /**
     * Creates new form TeacherBookingTable
     */
    
    String tid;
    public CustomerDetails() {
        initComponents();
        populateJtable();
    }
    
    public CustomerDetails(String tid) {
        initComponents();
        this.tid=tid;
        populateJtable();
    }
    String datecheck;
    
     public void populateJtable(){
        
        CustomerQuery bq= new CustomerQuery();
        ArrayList<Customer> blist = bq.CustomerList();
        String[] colNames = {"CID", "CName", "CEMAIL", "CPHONE", "CADDRESS", "BILLINGDATE", "PACKAGE", "ACCOUNTSTATUS", "BALANCE"};
        Object[][] rows= new Object[blist.size()][9];
        
        for(int i=0;i< blist.size();i++){
            //rows[i][0] =blist.get(i).getBid();
            rows[i][0] =blist.get(i).getCid();
            rows[i][1] =blist.get(i).getCname();
            rows[i][2] =blist.get(i).getCemail();
            rows[i][3] =blist.get(i).getCaddress();
            rows[i][4] =blist.get(i).getCphone();
            rows[i][5] =blist.get(i).getBillingDate();
            rows[i][6] =blist.get(i).getPkg();
            rows[i][7] =blist.get(i).getAccountstatus();
            rows[i][8] =blist.get(i).getBalance();
            
        }
        
        MyModel mmd = new MyModel(rows, colNames);
        jTable1.setModel(mmd);
        jTable1.setRowHeight(20);
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonDelRow = new javax.swing.JButton();
        jButtonReschedule = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButtonReschedule1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Booking");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer IP Info");

        jButtonBack.setBackground(new java.awt.Color(192, 57, 43));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jButtonDelRow.setBackground(new java.awt.Color(34, 167, 240));
        jButtonDelRow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDelRow.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelRow.setText("Remove Customer");
        jButtonDelRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelRowActionPerformed(evt);
            }
        });

        jButtonReschedule.setBackground(new java.awt.Color(51, 51, 255));
        jButtonReschedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonReschedule.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReschedule.setText("Add Balance");
        jButtonReschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRescheduleActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(108, 122, 137));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(228, 241, 254));
        jTextField1.setCaretColor(new java.awt.Color(228, 241, 254));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReschedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButtonReschedule, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtonDelRow, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextAreaDesc.setEditable(false);
        jTextAreaDesc.setBackground(new java.awt.Color(108, 122, 137));
        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setForeground(new java.awt.Color(228, 241, 254));
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonLogOut.setBackground(new java.awt.Color(192, 57, 43));
        jButtonLogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("Log Out");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISP Customer Management System");

        jTextField2.setBackground(new java.awt.Color(108, 122, 137));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(228, 241, 254));
        jTextField2.setCaretColor(new java.awt.Color(228, 241, 254));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButtonReschedule1.setBackground(new java.awt.Color(51, 51, 255));
        jButtonReschedule1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonReschedule1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReschedule1.setText("Search by Name");
        jButtonReschedule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReschedule1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButtonReschedule1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(921, Short.MAX_VALUE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReschedule1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(633, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(153, 0, 51));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Details");

        jLabelMin1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(984, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addGap(29, 29, 29)
                .addComponent(jLabelClose1)
                .addGap(25, 25, 25))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel4)
                    .addContainerGap(718, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose1)
                    .addComponent(jLabelMin1))
                .addGap(333, 333, 333))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel4)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        AdminPanel sdb = new AdminPanel(tid);
        sdb.setVisible(true);
        sdb.pack();
        sdb.setLocationRelativeTo(null);
        sdb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed
    String date;
    private void jButtonDelRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelRowActionPerformed

        Connection con= ConnectionDB.getConnection();

        //Bookings book= new Bookings(null, t, desc, d, stdid, "kamruddin", s);
        PreparedStatement ps;
        try {
            ps= con.prepareStatement("DELETE FROM customer WHERE AND cemail= ?");
            ps.setString(1, stid);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Customer Deleted");
                }else{
                JOptionPane.showMessageDialog(null, "Error! Something went wrong");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        populateJtable(); 
    }//GEN-LAST:event_jButtonDelRowActionPerformed

    private void jButtonRescheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRescheduleActionPerformed

        String a= jTextField1.getText().toString();
        System.out.println(a);
        int amount=Integer.parseInt(a);
        System.out.println(amount);
        Connection con= ConnectionDB.getConnection();
        String reason= "";
        //Bookings book= new Bookings(null, t, desc, d, stdid, "kamruddin", s);
        //BookingQuery bq= new BookingQuery();
        
        
        //bq.RescheduleBooking(d, date);
        
        PreparedStatement ps;
        try {
            
            CallableStatement cStmt = con.prepareCall("{call addBal(?, ?)}");
            cStmt.setString(1, stid);
            cStmt.setInt(2, amount);
            
            if(cStmt.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Balance Updated");
                }else{
                JOptionPane.showMessageDialog(null, "Error!");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error! Valid amount (>500)");
            
            
        }
        
        
        // bq.addBooking(book);
        

        populateJtable();
    }//GEN-LAST:event_jButtonRescheduleActionPerformed
    ResultSet rs;
    String stid;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex = jTable1.getSelectedRow();
        //date=(jTable1.getValueAt(rowIndex, 2).toString());
        stid=(jTable1.getValueAt(rowIndex, 2).toString());
        System.out.print(stid);
        try {
            
            
            PreparedStatement ps;
            Connection con= ConnectionDB.getConnection();
            ps= con.prepareStatement("SELECT * FROM customer WHERE Cemail = ?");
            ps.setString(1, stid );
            rs=ps.executeQuery();
        } catch (SQLException ex) {
           Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if(rs.next())
            {
                
                jTextAreaDesc.setText("IP: "+ rs.getString("IP")+"\n"+
                        "Subnet Mask: "+ rs.getString("subnetmask")+ "\n"+
                "Address: "+ rs.getString("default_gateway")+ "\n"+
                "Email ID: "+ rs.getString("dns")+ "\n"+
                "Contact No: "+ rs.getString("alt_dns"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();

        this.setLocation(kordinatX, kordinatY);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonReschedule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReschedule1ActionPerformed
        CustomerQuery bq= new CustomerQuery();
        
        ArrayList<Customer> blist = bq.SearchCustomer(jTextField2.getText().toString());
        String[] colNames = {"CID", "CName", "CEMAIL", "CPHONE", "CADDRESS", "BILLINGDATE", "PACKAGE", "ACCOUNTSTATUS", "BALANCE"};
        Object[][] rows= new Object[blist.size()][9];
        
        for(int i=0;i< blist.size();i++){
            //rows[i][0] =blist.get(i).getBid();
            rows[i][0] =blist.get(i).getCid();
            rows[i][1] =blist.get(i).getCname();
            rows[i][2] =blist.get(i).getCemail();
            rows[i][3] =blist.get(i).getCaddress();
            rows[i][4] =blist.get(i).getCphone();
            rows[i][5] =blist.get(i).getBillingDate();
            rows[i][6] =blist.get(i).getPkg();
            rows[i][7] =blist.get(i).getAccountstatus();
            rows[i][8] =blist.get(i).getBalance();
            
        }
        
        MyModel mmd = new MyModel(rows, colNames);
        jTable1.setModel(mmd);
        jTable1.setRowHeight(20);
    }//GEN-LAST:event_jButtonReschedule1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelRow;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonReschedule;
    private javax.swing.JButton jButtonReschedule1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
