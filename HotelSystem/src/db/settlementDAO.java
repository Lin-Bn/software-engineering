/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.settlement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 28092
 */
public class settlementDAO {
    public boolean saveSettlement(settlement s) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into settlement(customerNo, roomNo, payable, payment, startDate, tenancy)" + " values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getCustomerNo());
            ps.setInt(2, s.getRoomNo());
            ps.setFloat(3, s.getPayable());
            ps.setFloat(4, s.getPayment());
            ps.setString(5, s.getStartDate());
            ps.setInt(6, s.getTenancy());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
}
