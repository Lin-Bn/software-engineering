/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import CheckType.Check;
import db.DBHelper;
import db.customerDAO;
import db.roomDAO;
import entity.customer;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mints
 */
public class CustomerCheckIn extends javax.swing.JDialog {

    /**
     * Creates new form customerCheckIn
     */
    public CustomerCheckIn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        JTextFieldRoom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldPrice = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTextFieldCustomerName = new javax.swing.JTextField();
        JTextFieldCustomerID = new javax.swing.JTextField();
        JTextFieldDiscount = new javax.swing.JTextField();
        JTextFieldTenancy = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        JTextFieldDeposit = new javax.swing.JTextField();
        jButtonConfirm = new javax.swing.JButton();
        JTextFieldTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JButtonQuery = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("顾客入住手续办理");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("入住房间:");

        JTextFieldRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldRoomActionPerformed(evt);
            }
        });

        jLabel3.setText("单价/天:");

        JTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldPriceActionPerformed(evt);
            }
        });

        jLabel4.setText("姓名");

        jLabel5.setText("身份证号");

        jLabel6.setText("性别");

        jLabel8.setText("租住天数");

        jLabel9.setText("折扣");

        JTextFieldDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldDiscountActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("男");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("女");

        jLabel10.setText("押金");

        jButtonConfirm.setText("确定");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jLabel7.setText("顾客电话号码:");

        JButtonQuery.setText("查询");
        JButtonQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonQueryActionPerformed(evt);
            }
        });

        jLabel11.setText("顾客预约信息查询");

        jLabel12.setText("顾客详细信息录入");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(72, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(JButtonQuery))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldRoom)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFieldDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFieldTenancy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFieldDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFieldCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButtonConfirm)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonQuery))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextFieldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTextFieldCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFieldDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(JTextFieldTenancy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTextFieldDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButtonConfirm)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldRoomActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JTextFieldRoomActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        // TODO add your handling code here:
        Check check = new Check();
        String customerName = JTextFieldCustomerName.getText();
        String customerID = JTextFieldCustomerID.getText();
        String gender = "";
        if (jRadioButton1.isSelected()) {
            gender = "男";
        } else if (jRadioButton2.isSelected()) {
            gender = "女";
        }
        String tele = JTextFieldTel.getText();
        int opt = JOptionPane.showConfirmDialog(this, "确认提交当前顾客信息？", "确认", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            if (customerName.equals("") || customerID.equals("") || gender.equals("") || tele.equals("") || JTextFieldTenancy.getText().equals("") || JTextFieldDiscount.getText().equals("") || JTextFieldDeposit.getText().equals("")) {
                JOptionPane.showConfirmDialog(this, "请将信息填写完整！", "确认", JOptionPane.YES_NO_OPTION);
            } else {
                int tenancy = Integer.parseInt(JTextFieldTenancy.getText());
                float discount = Float.parseFloat(JTextFieldDiscount.getText());
                int deposit = Integer.parseInt(JTextFieldDeposit.getText());
                boolean checkName = check.checkChineseAndEnglich(customerName);
                if (checkName && customerName.length() < 21) {
                    boolean checkCustomerID = check.checkId(customerID);
                    if (checkCustomerID) {
                        boolean checkDiscount = check.checkFloat(JTextFieldDiscount.getText());
                        if (checkDiscount && (Float.parseFloat(JTextFieldDiscount.getText()) - 1 <= 0)) {
                            boolean checkTenancy = check.checkNumber(JTextFieldTenancy.getText());
                            if (checkTenancy && tenancy > 0) {
                                boolean checkDeposit = check.checkNumber(JTextFieldDeposit.getText());
                                if (checkDeposit) {
                                    customer c = new customer();
                                    c.setCustomerName(customerName);
                                    c.setCustomerID(customerID);
                                    c.setGender(gender);
                                    c.setTelephoneNo(tele);
                                    c.setTenancy(tenancy);
                                    c.setDiscount(discount);
                                    c.setDeposit(deposit);
                                    customerDAO cdao = new customerDAO();
                                    cdao.updateCustomer(c);
                                    this.setVisible(false);
                                    Main main = new Main();
                                    main.setVisible(true);
                                } else {
                                    JOptionPane.showMessageDialog(this, "押金只能由整数数字组成!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "租期大于0且只能由整数数字组成!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "折扣只能由小于等于1的小数组成!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "身份证号只能由17位数字和数字或xX组成!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "姓名只能由中文和英文组成且长度不超过20!");
                }
            }
        }

        /*
        if (customerName.equals("") || customerID.equals("") || gender.equals("") || tele.equals("") || JTextFieldTenancy.getText().equals("") || JTextFieldDiscount.getText().equals("") || JTextFieldDeposit.getText().equals("")) {
                    JOptionPane.showConfirmDialog(this, "请将信息填写完整！", "确认", JOptionPane.YES_NO_OPTION);
                } else {
                    int tenancy = Integer.parseInt(JTextFieldTenancy.getText());
                    float discount = Float.parseFloat(JTextFieldDiscount.getText());
                    int deposit = Integer.parseInt(JTextFieldDeposit.getText());
                    customer c = new customer();
                    c.setCustomerName(customerName);
                    c.setCustomerID(customerID);
                    c.setGender(gender);
                    c.setTelephoneNo(tele);
                    c.setTenancy(tenancy);
                    c.setDiscount(discount);
                    c.setDeposit(deposit);
                    customerDAO cdao = new customerDAO();
                    cdao.updateCustomer(c);

                }
         */
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void JTextFieldDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldDiscountActionPerformed

    private void JTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldPriceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JTextFieldPriceActionPerformed

    private void JButtonQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonQueryActionPerformed
        // TODO add your handling code here:
        String tele = null;
        String roomNo = null;
        customerDAO cdao = new customerDAO();
        if (JTextFieldTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "请输入手机号!");
        } else {
            tele = JTextFieldTel.getText();
            Check check = new Check();
            boolean checkTel = check.checkNumber(tele);
            if (checkTel && tele.length() > 7 && tele.length() < 12) {
                roomNo = cdao.getRoomNo(tele);
                JTextFieldRoom.setText(roomNo);
                int no = Integer.parseInt(roomNo);
                int p = cdao.getRoomPrice(no);
                JTextFieldPrice.setText(String.valueOf(p));
            } else {
                JOptionPane.showMessageDialog(null, "输入错误,手机号由8-11位数字组成");
            }
        }


    }//GEN-LAST:event_JButtonQueryActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void exit() throws HeadlessException {
        int opt = JOptionPane.showConfirmDialog(this, "确认关闭当前窗口？", "确认", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            System.exit(0);
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
            java.util.logging.Logger.getLogger(CustomerCheckIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerCheckIn dialog = new CustomerCheckIn(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JButtonQuery;
    private javax.swing.JTextField JTextFieldCustomerID;
    private javax.swing.JTextField JTextFieldCustomerName;
    private javax.swing.JTextField JTextFieldDeposit;
    private javax.swing.JTextField JTextFieldDiscount;
    private javax.swing.JTextField JTextFieldPrice;
    private javax.swing.JTextField JTextFieldRoom;
    private javax.swing.JTextField JTextFieldTel;
    private javax.swing.JTextField JTextFieldTenancy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
