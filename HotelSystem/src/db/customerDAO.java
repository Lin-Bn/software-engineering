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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mints
 */
public class customerDAO {
    
    public boolean saveCustomer2(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into customer(telephoneNo,startDate,roomNo)" + " values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getTelephoneNo());
            ps.setString(2, c.getStartDate());   
            ps.setInt(3, c.getRoomNo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveCustomer1(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into customer(customerName,telephoneNo,startDate,roomNo)" + " values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getTelephoneNo());
            ps.setString(3, c.getStartDate());   
            ps.setInt(4, c.getRoomNo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveCustomer(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into customer(customerName,customerID,gender,telephoneNo,startDate,tenancy,roomNo,discount,deposit)" + " values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setString(4, c.getTelephoneNo());
            ps.setString(5, c.getStartDate());
            ps.setInt(6, c.getTenancy());
            ps.setInt(7, c.getRoomNo());
            ps.setFloat(8, c.getDiscount());
            ps.setFloat(9, c.getDeposit());
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
                c.setStartDate(rs.getString("startDate"));
                c.setTenancy(rs.getInt("tenancy"));
                c.setRoomNo(rs.getInt("roomNo"));
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
            String sql = "update customer set customerName=?,customerId=?,gender=?,tenancy=?,discount=?,deposit=? where telephoneNo=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setInt(4, c.getTenancy());
            ps.setFloat(5, c.getDiscount());
            ps.setInt(6, c.getDeposit());
            ps.setString(7, c.getTelephoneNo());
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean updateCustomerAll(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update customer set customerName=?,customerId=?,gender=?,telephoneNo=?,startDate=?,tenancy=?,roomNo=?,discount=?,deposit=? where customerNo=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setString(4, c.getTelephoneNo());
            ps.setString(5, c.getStartDate());
            ps.setInt(6, c.getTenancy());
            ps.setInt(7, c.getRoomNo());
            ps.setFloat(8, c.getDiscount());
            ps.setInt(9, c.getDeposit());
            ps.setInt(10, c.getCustomerNo());
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

    public String getRoomNo(String tel) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        customer c = null;
        String r = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "select roomNo from customer where telephoneNo=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tel);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getString("roomNo");
            }

            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public String getRoomTypeFromTel(String tel) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        customer c = null;
        String r = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "SELECT r.room_type FROM customer c, room r WHERE c.telephoneNo=? AND r.room_number=c.roomNo";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tel);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getString("room_type");
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }
    
    public String getRoomTypeFromRoomNo(int roomNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        customer c = null;
        String r = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "SELECT r.room_type FROM customer c, room r WHERE c.roomNo=? AND r.room_number=c.roomNo";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, roomNo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getString("room_type");
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public int getRoomPrice(int roomNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        customer c = null;
        int r=0;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_price from room where room_number=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, roomNo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getInt("room_price");
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }
}
