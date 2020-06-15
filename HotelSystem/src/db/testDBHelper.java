/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mints
 */
public class testDBHelper {

    static String sql = null;
    static DBHelper db1 = null;
    static ResultSet ret = null;

    public static void main(String[] args) {
        sql = "select * from customer";//SQL语句  
        db1 = new DBHelper(sql);//创建DBHelper对象

        try {
            ret = db1.pst.executeQuery();//执行语句，得到结果集  
            while (ret.next()) {
                String customerNo = ret.getString(1);
                String customerName = ret.getString(2);
                String customerID = ret.getString(3);
                String gender = ret.getString(4);
                String roomType = ret.getString(5);
                String startDate = ret.getString(6);
                String tenancy = ret.getString(7);
                String roomNo = ret.getString(8);
                System.out.println(customerNo + "\t" + customerName + "\t" + customerID + "\t" + gender + "\t" + roomType + "\t" + startDate + "\t" + tenancy + "\t" + roomNo);
            }//显示数据  
            ret.close();
            db1.close();//关闭连接  
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
