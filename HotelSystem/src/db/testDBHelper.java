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
import java.sql.SQLException;

/**
 *
 * @author mints
 */
public class testDBHelper {

    public static customer testQuery() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        customer c = null;

        try {
            conn = DBHelper.getConnection();
            String sql = "select * from customer";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                c = new customer();
                c.setCustomerNo(rs.getInt("customerNo"));
                c.setCustomerName(rs.getString("customerName"));
                c.setCustomerID(rs.getString("customerID"));
                c.setGender(rs.getString("gender"));
                c.setRoomType(rs.getString("roomType"));
                c.setStartDate(rs.getString("startDate"));
                c.setTenancy(rs.getInt("tenancy"));
                c.setRoomNo(rs.getInt("roomNo"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }

    public static boolean testUpdate(customer c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into customer(customerName,customerID,gender,roomType,startDate,tenancy,roomNo)" + " values (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setString(4, c.getRoomType());
            ps.setString(5, c.getStartDate());
            ps.setInt(6, c.getTenancy());
            ps.setInt(7, c.getRoomNo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static void main(String[] args) {
        /*
        customer c = new customer();
        c = testQuery();
        System.out.println(c.getCustomerNo());
        System.out.println(c.getCustomerName());
        System.out.println(c.getCustomerID());
        System.out.println(c.getGender());
        System.out.println(c.getRoomType());
        System.out.println(c.getStartDate());
        System.out.println(c.getTenancy());
        System.out.println(c.getRoomNo());
        
        
        customer c1 = new customer();
        c1.setCustomerID("371223200209134627");
        c1.setCustomerName("李四");
        c1.setGender("男");
        c1.setRoomType("双人间");
        c1.setStartDate("2019.6.19");
        c1.setTenancy(7);
        c1.setRoomNo("26");
        if (testUpdate(c1)) {
            System.out.println("update success!");
        } else {
            System.out.println("update fail!");
        }
        
        customer c = new customer();
        customerDAO cdao=new customerDAO();
        c=cdao.query("370213200005184396");
        System.out.println(c.getCustomerNo());
        System.out.println(c.getCustomerName());
        System.out.println(c.getCustomerID());
        System.out.println(c.getGender());
        System.out.println(c.getTelephoneNo());
        System.out.println(c.getRoomType());
        System.out.println(c.getStartDate());
        System.out.println(c.getTenancy());
        System.out.println(c.getRoomNo());
        System.out.println(c.getDiscount());
        System.out.println(c.getDeposit());
        
        customer c = new customer();
        customerDAO cdao=new customerDAO();
        cdao.deleteCustomer(3);
        
        customer c1 = new customer();
        customerDAO cdao=new customerDAO();
        c1.setCustomerNo(2);
        c1.setCustomerID("371223200209134627");
        c1.setCustomerName("李五");
        c1.setGender("男");
        c1.setRoomType("双人间");
        c1.setStartDate("2019.6.19");
        c1.setTenancy(7);
        c1.setRoomNo(26);
        c1.setTelephoneNo("13156455");
        c1.setDiscount(1);
        c1.setDeposit(400);
        cdao.updateCustomer(c1);
        */
        customer c1 = new customer();
        c1.setRoomNo(5);
        System.out.println(c1.getRoomNo());
    }
}
