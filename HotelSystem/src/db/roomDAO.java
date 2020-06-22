/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import db.DBHelper;
import entity.room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class roomDAO {

    //增加√
    public boolean saveRoom(room c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into room(room_type,room_number,room_price,room_free,room_square)" + " values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getRoom_type());
            ps.setInt(2, c.getRoom_number());
            ps.setInt(3, c.getRoom_price());
            ps.setBoolean(4, c.getRoom_free());
            ps.setInt(5, c.getRoom_square());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //查询根据number输出房间√
    public room queryRoom(int room_number) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        try {
            conn = DBHelper.getConnection();
            String sql = "select * from room where room_number=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                c = new room();
                c.setRoom_free(rs.getBoolean("room_free"));
                c.setRoom_number(rs.getInt("room_number"));
                c.setRoom_price(rs.getInt("room_price"));
                c.setRoom_square(rs.getInt("room_square"));
                c.setRoom_type(rs.getString("room_type"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }

    /*public boolean updateRoom(room c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update room set customerName=?,customerId=?,gender=?,tenancy=?,discount=?,deposit=? where telephoneNo=?";
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
    }*/

 /*public boolean updateCustomerAll(room c) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update customer set customerName=?,customerId=?,gender=?,telephoneNo=?,roomType=?,startDate=?,tenancy=?,discount=?,deposit=? where customerNo=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getCustomerID());
            ps.setString(3, c.getGender());
            ps.setString(4, c.getTelephoneNo());
            ps.setString(5, c.getRoomType());
            ps.setString(6, c.getStartDate());
            ps.setInt(7, c.getTenancy());
            ps.setFloat(8, c.getDiscount());
            ps.setInt(9, c.getDeposit());
            ps.setInt(10, c.getCustomerNo());
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }*/
    //删除房间√
    public boolean deleteRoom(int room_number) {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from room where room_number=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, room_number);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    //查询1/7 已知type求number√
    public int getRoomNumber1(String room_type) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        int r = 0;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_number from room where room_type=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, room_type);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getInt("room_number");
            }

            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    //查询2/7 已知number求price√
    public int getRoomPrice1(int room_number) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        int r = 0;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_price from room where room_number=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
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

    //查询3/7 已知number求free√
    public boolean getRoomFree(int room_number) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        boolean r = true;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_free from room where room_number=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getBoolean("room_free");
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    //查询4/7 已知number求square√
    public int getRoomSquare1(int room_number) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        int r = 0;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_square from room where room_number=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getInt("room_square");
            }

            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    //查询5/7 已知type、num求price√
    public int getRoomPrice2(int room_number, String room_type) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        int r = 0;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_price from room where room_number=? and room_type=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
            pstmt.setString(2, room_type);
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
    
    //查询6/7 已知type、num求free
    public boolean getRoomFree2(int room_number, String room_type) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        boolean r=true;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_free from room where room_number=? and room_type=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
            pstmt.setString(2, room_type);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getBoolean("room_free");
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }
    
    //查询7/7 已知number、type求square
    public int getRoomsquare2(int room_number, String room_type) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        room c = null;
        int r = 0;
        try {
            conn = DBHelper.getConnection();
            String sql = "select room_square from room where room_number=? and room_type=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, room_number);
            pstmt.setString(2, room_type);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                r = rs.getInt("room_square");
            }
            rs.close();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }
    
    public boolean changeRoomFree(int roomNo){
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update room set room_Free=0 where room_number=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, roomNo);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public String queryRoomType(int roomNo){
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select room_type from room where room_number=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, roomNo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String RoomType = rs.getString(1);
            rs.close();;
            ps.close();
            return RoomType;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}