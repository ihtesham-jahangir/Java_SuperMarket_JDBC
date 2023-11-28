/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author haris
 */
public class Catagory extends javax.swing.JFrame {

    /**
     * Creates new form Catagory
     */
    public Catagory() {
        initComponents();
        SelectSeller();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void SelectSeller()
    {
    try
    {
    Con =DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1","user");
    St = (Statement) Con.createStatement();
    Rs = St.executeQuery("Select * from User1.CATAGORYTBL");
    CatagoryTbl.setModel(DbUtils.resultSetToTableModel(Rs));
   
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CatId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CatagoryTbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CatDesc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.red);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Manage Catagory");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Catagory id ");

        AddBtn.setBackground(java.awt.Color.red);
        AddBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(java.awt.Color.red);
        EditBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(java.awt.Color.red);
        DeleteBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.red);
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(java.awt.Color.white);
        jScrollPane2.setForeground(java.awt.Color.red);
        jScrollPane2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        CatagoryTbl.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CatagoryTbl.setForeground(java.awt.Color.red);
        CatagoryTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Catagory Id", "Name ", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CatagoryTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatagoryTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CatagoryTbl);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Catagory List");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Description");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(83, 83, 83)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CatName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel7)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jLabel10.setBackground(java.awt.Color.red);
        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Logout");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel9.setBackground(java.awt.Color.red);
        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Products");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel11.setBackground(java.awt.Color.red);
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Seller");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(java.awt.Color.red);
        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Change Password");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
if(CatId.getText().isEmpty())
       {
       JOptionPane.showMessageDialog(this, "Enter the Category to be Deleted");
       }
       else
    {
       try
       {
           Con =DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1","user");
           String cid =CatId.getText();
           String Query = "Delete  from User1.CATAGORYTBL where CATID = "+cid;
           Statement Add = Con.createStatement();
           Add.executeUpdate(Query);
           SelectSeller();
           JOptionPane.showMessageDialog(this, "Catagory Deleted Successfully");
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if(CatId.getText().isEmpty()||CatName.getText().isEmpty()||CatDesc.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Incorrect Information");
        }
        else{
        try {
            Con =DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1","user");
            PreparedStatement add= Con.prepareStatement("insert into CATAGORYTBL values(?,?,?)");
            add.setInt(1, Integer.valueOf(CatId.getText()));
            add.setString(2, CatName.getText());
            add.setString(3, CatDesc.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Catagory Added Successfully");
             Con.close();
             SelectSeller();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       CatId.setText("");
       CatName.setText("");
       CatDesc.setText("");
    }//GEN-LAST:event_jButton4MouseClicked

    private void CatagoryTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatagoryTblMouseClicked
         DefaultTableModel model= (DefaultTableModel)CatagoryTbl.getModel();
        int myindex = CatagoryTbl.getSelectedRow();
        CatId.setText(model.getValueAt(myindex, 0 ).toString());
        CatName.setText(model.getValueAt(myindex, 1 ).toString());
        CatDesc.setText(model.getValueAt(myindex, 2 ).toString());
        
    }//GEN-LAST:event_CatagoryTblMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
                if(CatId.getText().isEmpty() || CatName.getText().isEmpty()||CatDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Entities are not found?");
        }
        else{
        try
        {
         Con =DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1","user");
         String Query = "Update User1.CATAGORYTBL set CATNAME = '"+CatName.getText()+"'"+",CATDESC = '"+CatDesc.getText()+"'"+"where CATID = "+CatId.getText();
         Statement Add = Con.createStatement();
         Add.executeUpdate(Query);
         JOptionPane.showMessageDialog(this, "Catagory Updated");
         SelectSeller();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
                                              
 
   ImageIcon icon = new ImageIcon("src/Logo 80x80.jpg");
   setIconImage(icon.getImage());

    
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catagory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CatDesc;
    private javax.swing.JTextField CatId;
    private javax.swing.JTextField CatName;
    private javax.swing.JTable CatagoryTbl;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}