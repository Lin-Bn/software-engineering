/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.DBHelper;
import db.roomDAO;
import db.settlementDAO;
import entity.customer;
import entity.settlement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 28092
 */
public class Settlement extends javax.swing.JDialog {

    /**
     * Creates new form Settlement
     */
    public Settlement(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldRoomNo = new javax.swing.JTextField();
        jButtonQuery = new javax.swing.JButton();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jTextFieldCustomerDiscount = new javax.swing.JTextField();
        jTextFieldPayable = new javax.swing.JTextField();
        jTextFieldPayment = new javax.swing.JTextField();
        jButtonSettlement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonQuery.setText("查询");
        jButtonQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQueryActionPerformed(evt);
            }
        });

        jTextFieldCustomerName.setEditable(false);

        jTextFieldPayable.setEditable(false);

        jTextFieldPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaymentActionPerformed(evt);
            }
        });

        jButtonSettlement.setText("结算");
        jButtonSettlement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettlementActionPerformed(evt);
            }
        });

        jLabel1.setText("房 间 号：");

        jLabel2.setText("姓    名：");

        jLabel3.setText("身 份 证：");

        jLabel4.setText("折    扣：");

        jLabel5.setText("应缴金额：");

        jLabel6.setText("实缴金额：");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSettlement)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPayment)
                            .addComponent(jTextFieldPayable)
                            .addComponent(jTextFieldCustomerDiscount)
                            .addComponent(jTextFieldCustomerId)
                            .addComponent(jTextFieldCustomerName)
                            .addComponent(jTextFieldRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButtonQuery)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jButtonQuery))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCustomerDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPayable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonSettlement)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaymentActionPerformed

    private void jButtonSettlementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettlementActionPerformed
        // TODO add your handling code here:
        float count = 0;
        count = Float.valueOf(jTextFieldPayment.getText());
        settlement s = new settlement();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        settlementDAO sDAO = new settlementDAO();
        roomDAO rDAO = new roomDAO();
        String roomNo = jTextFieldRoomNo.getText();
        try {
            conn = DBHelper.getConnection();
            String sql = "SELECT c.customerNo, c.startDate, c.tenancy FROM customer c, room r WHERE r.roomFree=1 AND r.roomNo=c.roomNo AND c.roomNo=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, roomNo);
            rs = pstmt.executeQuery();
            rs.last();
            count = Float.valueOf(jTextFieldPayable.getText()) * Float.valueOf(jTextFieldCustomerDiscount.getText());
            s.setCustomerNo(rs.getInt(1));
            s.setRoomNo(roomNo);
            s.setStartDate(rs.getString(2));
            s.setTenancy(rs.getInt(3));
            s.setPayable(Float.valueOf(jTextFieldPayable.getText()));
            s.setPayment(count);
            if(rDAO.changeRoomFree(roomNo)){
                sDAO.saveSettlement(s);
                JOptionPane.showMessageDialog(null, "结算成功");
            }    
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonSettlementActionPerformed

    private void jButtonQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQueryActionPerformed
        // TODO add your handling code here:
        String roomNo;
        roomNo = jTextFieldRoomNo.getText();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "SELECT c.customerName, c.customerId, c.discount, r.roomPrice FROM customer c, room r WHERE r.roomFree=1 AND r.roomNo=c.roomNo AND c.roomNo=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, roomNo);
            rs = pstmt.executeQuery();
            if(rs.next() != false){
                rs.last();
                float count = 0;
                jTextFieldCustomerName.setText(rs.getString(1));
                jTextFieldCustomerId.setText(rs.getString(2));
                jTextFieldCustomerDiscount.setText(Float.toString(rs.getFloat(3)));
                count = rs.getFloat(3) * rs.getFloat(4);
                jTextFieldPayable.setText(Float.toString(count));
                jTextFieldPayment.setText(Float.toString(count));
            }else{
                JOptionPane.showMessageDialog(null, "该房间无人住");
            }
            
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonQueryActionPerformed

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
            java.util.logging.Logger.getLogger(Settlement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settlement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settlement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settlement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Settlement dialog = new Settlement(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuery;
    private javax.swing.JButton jButtonSettlement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldCustomerDiscount;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldPayable;
    private javax.swing.JTextField jTextFieldPayment;
    private javax.swing.JTextField jTextFieldRoomNo;
    // End of variables declaration//GEN-END:variables
}
