/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mints
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonRoomQuery = new javax.swing.JButton();
        jButtonCustomer = new javax.swing.JButton();
        jButtonAdministrator = new javax.swing.JButton();
        jButtonAdministrator1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("宾馆管理系统");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButtonRoomQuery.setText("房间查询");
        jButtonRoomQuery.setFocusable(false);
        jButtonRoomQuery.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRoomQuery.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRoomQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRoomQueryActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonRoomQuery);

        jButtonCustomer.setText("顾客入住手续办理");
        jButtonCustomer.setFocusable(false);
        jButtonCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCustomer);

        jButtonAdministrator.setText("管理员系统");
        jButtonAdministrator.setFocusable(false);
        jButtonAdministrator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdministrator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministratorActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAdministrator);

        jButtonAdministrator1.setText("结算系统");
        jButtonAdministrator1.setFocusable(false);
        jButtonAdministrator1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdministrator1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAdministrator1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrator1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAdministrator1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerActionPerformed
        // TODO add your handling code here:
        CustomerCheckIn c = new CustomerCheckIn(this, true);
        c.setVisible(true);
    }//GEN-LAST:event_jButtonCustomerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministratorActionPerformed
        // TODO add your handling code here:
        AdminSignIn c = new AdminSignIn(this, true);
        c.setVisible(true);
    }//GEN-LAST:event_jButtonAdministratorActionPerformed

    private void jButtonRoomQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRoomQueryActionPerformed
        // TODO add your handling code here:
        RoomQuery c = new RoomQuery();
        c.setVisible(true);
    }//GEN-LAST:event_jButtonRoomQueryActionPerformed

    private void jButtonAdministrator1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrator1ActionPerformed
        // TODO add your handling code here:
        Settlement c = new Settlement(this, true);
        c.setVisible(true);
    }//GEN-LAST:event_jButtonAdministrator1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void exit() throws HeadlessException {
        int opt = JOptionPane.showConfirmDialog(this, "确认退出宾馆管理系统？", "确认", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdministrator;
    private javax.swing.JButton jButtonAdministrator1;
    private javax.swing.JButton jButtonCustomer;
    private javax.swing.JButton jButtonRoomQuery;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
