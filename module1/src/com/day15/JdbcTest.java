package com.day15;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        try {
            //第一步：加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //第二步：获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2?useSSL=false", "root", "root");
            String sql = "select * from class1";

            //第三步：获取PreparedStatement
            preparedStatement = connection.prepareStatement(sql);

            //第四步：获取结果集
            //第四步:执行SQL语句
            rs = preparedStatement.executeQuery();

            while(rs.next()){
                int id=rs.getInt("id");
                int school_id=rs.getInt("school_id");
                String cname=rs.getString("cname");
                System.out.println("id:"+id+"  school_id:"+school_id+"  cname:"+cname);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (rs !=null){
                    rs.close();
                }
                if (preparedStatement !=null){
                    preparedStatement.close();
                }
                if (connection !=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
