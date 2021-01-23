package com.day15.jdbc.utils;

import java.sql.*;

public class JdbcUtil {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/test2?useSSL=false";
    private static final String USER="root";
    private static final String PASSWORD="root";
    //封装-----------
    //获取连接------------
    public static Connection getConnection(){
        Connection connection=null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName(DRIVER);
            connection= DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }



    //释放资源111——————————————————

    public static void close(ResultSet result, PreparedStatement preparedStatement, Connection connection){
        try {
            if (result!=null){
                result.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //释放资源2222——————————————————

    public static void close(PreparedStatement preparedStatement,Connection connection){
        try {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
