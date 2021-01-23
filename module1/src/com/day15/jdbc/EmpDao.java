package com.day15.jdbc;

import com.day15.jdbc.utils.JdbcUtil;
import com.day15.jdbc.utils.Emp;

import java.math.BigDecimal;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EmpDao {
    public static void main(String[] args) throws Exception{
//        select();
        //集合的形式去遍历出来，要重写toString的方法
//        ArrayList<Emp> list=select1("小");
//        list.stream().forEach(n->{
//            System.out.println(n);
//        });

//        ArrayList<Emp> list1=select();
//        list1.stream().forEach(System.out::println);

//        innert();
//        Emp emp=new Emp(21,"晓东",new BigDecimal(151251.155));
////        Emp emp=new Emp(21,"晓东",1251.1514);----错误
//        innert2(emp);

//        update();
//        Emp emp1=new Emp("马云",new BigDecimal(15145.214));
//        update(emp1);



//        Emp emp=new Emp();
//        emp.setId(13);
        delete(18);
    }

    public static void delete(Integer id) throws Exception{
        //如果不要这段，必须抛出异常，才可以（亲测可试）
//        Connection connection=null;
//        PreparedStatement preparedStatement=null;
            Connection connection= JdbcUtil.getConnection();
            String sql="delete from student where id=?";

            //一样的道理
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,id);
            int result=ps.executeUpdate();
            if (result>0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }
            JdbcUtil.close(ps,connection);
    }

    //更新----------------------

    //活数据----------
    public static void update(Emp emp){
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection= JdbcUtil.getConnection();
            String sql="update student set menoy=? where name=?";

            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setBigDecimal(1,emp.getMenoy());
            preparedStatement.setString(2,emp.getName());

            int result=preparedStatement.executeUpdate();
            if (result>0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(preparedStatement,connection);
//            try {
//                if (preparedStatement!=null){
//                    preparedStatement.close();
//                }
//                if (connection!=null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
    }

//    插入
    public static void innert() throws ParseException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection= JdbcUtil.getConnection();
            String sql="insert into student(id,name,menoy,date) values(?,?,?,?)";

            String str="2020-02-01";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parse= sdf.parse(str);
            java.sql.Date date=new Date(parse.getTime());

            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,18);
            preparedStatement.setString(2,"东马天");
            preparedStatement.setBigDecimal(3,new BigDecimal(152.1544));
//            preparedStatement.setDate(4,date);
            int result=preparedStatement.executeUpdate();
            if (result>0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(preparedStatement,connection);
//            try {
//                if (preparedStatement!=null){
//                    preparedStatement.close();
//                }
//                if (connection!=null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
    }
//活数据，参数可变。。。。
    public static void innert2(Emp emp) throws ParseException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection= JdbcUtil.getConnection();
            String sql="insert into student(id,name,menoy,date) values(?,?,?,?)";

//            String str=emp.getDate();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            java.util.Date parse= sdf.parse(str);
//            java.sql.Date date=new Date(parse.getTime());

            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,emp.getId());
            preparedStatement.setString(2,emp.getName());
            preparedStatement.setBigDecimal(3,emp.getMenoy());

            ////此条数据不能省略
            preparedStatement.setDate(4,emp.getDate());

            int result=preparedStatement.executeUpdate();
            if (result>0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(preparedStatement,connection);
//            try {
//                if (preparedStatement!=null){
//                    preparedStatement.close();
//                }
//                if (connection!=null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
    }

//    简单的查询
public static void select(){
//    ArrayList<Emp> list=new ArrayList<>();
//        Connection connection=null;
    PreparedStatement preparedStatement=null;
    ResultSet result=null;
    Connection connection= JdbcUtil.getConnection();

    try {
        String sql="select * from student";

        preparedStatement=connection.prepareStatement(sql);
        result=preparedStatement.executeQuery();
        while(result.next()){
            int id=result.getInt("id");
            String name=result.getString("name");
            BigDecimal menoy=result.getBigDecimal("menoy");
                String date=result.getString("date");
                System.out.println("id:"+id+"  name:"+name+"  menoy:"+menoy+"  date:"+date);

//            Emp emp=new Emp();
//            emp.setId(id);
//            emp.setName(name);
//            emp.setMenoy(menoy);
////                emp.setDate(date);
//
//            list.add(emp);
        }

    } catch (Exception e){
        e.printStackTrace();
    }finally {
        JdbcUtil.close(result,preparedStatement,connection);
    }
//    return list;
}


    //放在集合里面去    查询-----
    public static ArrayList<Emp> select1(String name){
        ArrayList<Emp> list=new ArrayList<>();
//        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet result=null;
        Connection connection= JdbcUtil.getConnection();
        //通配符？
        //模糊查询
        //模糊查询-------%马%
        //模糊查询
        try {
            //死数据
//            String sql="select * from student where name like '%马%'";
            //活数据
            String sql="select * from student where name like ?";

            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+name+"%");//----模糊查询

            result=preparedStatement.executeQuery();
            while(result.next()){
                int id=result.getInt("id");
                String ename=result.getString("name");
                BigDecimal menoy=result.getBigDecimal("menoy");
//                String date=result.getString("date");
//                System.out.println("id:"+id+"  name:"+ename+"  menoy:"+menoy+"  date:"+date);

                Emp emp=new Emp();
                emp.setId(id);
                emp.setName(ename);
                emp.setMenoy(menoy);
//                emp.setDate(date);

                list.add(emp);
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(result,preparedStatement,connection);
        }
        return list;
    }

    //分页查询
    //分页查询
    //分页查询
    //分页查询
    public static ArrayList<Emp> select2(Integer page){
        ArrayList<Emp> list=new ArrayList<>();
//        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet result=null;
        Connection connection= JdbcUtil.getConnection();
        //通配符？
        //模糊查询
        //模糊查询-------%马%
        //模糊查询
        try {
            //死数据
//            String sql="select * from student where name like '%马%'";
            //活数据
            String sql="select * from student limit ?,?";

            preparedStatement=connection.prepareStatement(sql);


            result=preparedStatement.executeQuery();
            while(result.next()){
                int id=result.getInt("id");
                String ename=result.getString("name");
                BigDecimal menoy=result.getBigDecimal("menoy");
//                String date=result.getString("date");
//                System.out.println("id:"+id+"  name:"+ename+"  menoy:"+menoy+"  date:"+date);

                Emp emp=new Emp();
                emp.setId(id);
                emp.setName(ename);
                emp.setMenoy(menoy);
//                emp.setDate(date);

                list.add(emp);
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(result,preparedStatement,connection);
        }
        return list;
    }
}
