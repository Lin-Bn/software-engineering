/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mints
 */
public class customerDAO {

    public boolean saveCustomer(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into customer(customerName,customerID,gender,telephoneNo,roomType,startDate,tenancy,roomNo,discount,deposit)" + " values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setString(4, c.getTelephoneNo());
            ps.setString(5, c.getRoomType());
            ps.setString(6, c.getStartDate());
            ps.setInt(7, c.getTenancy());
            ps.setString(8, c.getRoomNo());
            ps.setFloat(9, c.getDiscount());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public customer query(String ID) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        customer c = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "select * from customer where customerId=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ID);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                c = new customer();
                c.setCustomerNo(rs.getInt("customerNo"));
                c.setCustomerID(rs.getString("customerId"));
                c.setCustomerName(rs.getString("customerName"));
                c.setGender(rs.getString("gender"));
                c.setRoomType(rs.getString("roomType"));
                c.setStartDate(rs.getString("startDate"));
                c.setTenancy(rs.getInt("tenancy"));
                c.setRoomNo(rs.getString("roomNo"));
                c.setDeposit(rs.getInt("deposit"));
                c.setDiscount(rs.getFloat("discount"));
                c.setTelephoneNo(rs.getString("telephoneNo"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }

    public boolean updateCustomer(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update customer set customerName=?,customerId=?,gender=?,telephoneNo=?,roomType=?,startDate=?,tenancy=?,roomNo=?,discount=?,deposit=? where customerNo=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setString(4, c.getTelephoneNo());
            ps.setString(5, c.getRoomType());
            ps.setString(6, c.getStartDate());
            ps.setInt(7, c.getTenancy());
            ps.setString(8, c.getRoomNo());
            ps.setFloat(9, c.getDiscount());
            ps.setInt(10, c.getDeposit());
            ps.setInt(11, c.getCustomerNo());
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteCustomer(int customerNo) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from customer where customerNo=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, customerNo);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
