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
public class roomDAO {
    
    public boolean saveRoom(room r) {
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

    public room query(String roomNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room r = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "select * from room where Room_No=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, roomNo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = new room();
                r.setRoomType(rs.getString("Room_Type"));
                r.setRoomCharge(rs.getInt("Room_Charge"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public boolean updateRoom(room r) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update room set Room_Type=?,Room_Charge=? where Room_No=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, r.getRoomType());
            ps.setInt(2, r.getRoomCharge());
            ps.setString(3, r.getRoomNo());
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean updateRoomAll(room r) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update room set Room_Type=?,Room_Charge=? where Room_No=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, r.getRoomType());
            ps.setString(2, r.getRoomNo());
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteRoom(String roomNo) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from room where Room_No=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, roomNo);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean changeRoomFree(String roomNo){
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update room set roomFree=0 where roomNo=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, roomNo);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
