//package cn.wolfcode.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class database{
//    public static Connection conn(){
//        String url="${jdbc.url}";//填写你的数据库名
//        String userName="${jdbc.username}";//填写你的用户名，我的是sa
//        String userPwd="${jdbc.password}";//填写你的密码tzk19991029
//        Connection connection=null;
//
//        try{
//            Class.forName("${jdbc.driverClassName}");
//            System.out.println("加载驱动成功！");
//
//        }catch(Exception e){
//
//            e.printStackTrace();
//
//            System.out.println("加载驱动失败！");
//        }
//        try{
//            connection=DriverManager.getConnection(url,userName,userPwd);
//            System.out.println("连接数据库成功！");
//        }catch(Exception e){
//            e.printStackTrace();
//            System.out.print("SQL Server连接失败！");
//        }
//        return connection;
//    }
//    public static void close (Statement state, Connection conn) {//关闭
//        if (state != null) {
//            try {
//                state.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void close (ResultSet rs, Statement state, Connection conn) {//关闭
//        if (rs != null) {
//            try {
//                rs.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (state != null) {
//            try {
//                state.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
