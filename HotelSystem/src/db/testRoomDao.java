/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 28092
 */
public class testRoomDao {
    public static room testQuery() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room r = null;

        try {
            conn = DBHelper.getConnection();
            String sql = "select * from room";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = new room();
                r.setRoomNo(rs.getString("Room_No"));
                r.setRoomCharge(rs.getInt("Room_Charge"));
                r.setRoomType(rs.getString("Room_Type"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public static boolean testUpdate(room r) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into room(Room_Type, Room_Charge, Room_No)" + " values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, r.getRoomType());
            ps.setInt(2, r.getRoomCharge());
            ps.setString(3, r.getRoomNo());
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
        */
        /*
        room r = new room();
        roomDAO rdao=new roomDAO();
        r = rdao.query(213);
        System.out.println(r.getRoomType());
        System.out.println(r.getRoomCharge());
        
        room r = new room();
        roomDAO rdao=new roomDAO();
        rdao.deleteRoom(213);
        
        
        room r1 = new room();
        roomDAO rdao=new roomDAO();
        r1.setRoomType("双人房");
        r1.setRoomCharge(50);
        r1.setRoomNo(213);
        rdao.updateRoom(r1);
        */
    }
}
