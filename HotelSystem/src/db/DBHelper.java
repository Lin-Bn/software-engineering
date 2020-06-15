/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mints
 */
public class DBHelper {

    private static final String driver = "org.gjt.mm.mysql.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/hotelsystem?useUnicode=true&characterEncoding=UTF-8";
    private static final String username = "root";
    private static final String password = "123456";

    private static Connection connection = null;
    //静态代码块，负责加载驱动

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //单例模式，返回数据库连接对象

    public static Connection getConnection() throws Exception {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
            //return connection;
        }
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection connection = DBHelper.getConnection();
            if (connection != null) {
                System.out.println("数据库连接成功");
            } else {
                System.out.println("数据库连接失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
