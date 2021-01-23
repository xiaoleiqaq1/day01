package com.day15.jdbc;

import com.day15.jdbc.utils.Emp;
import com.day15.jdbc.utils.JdbcUtil;
import com.day15.jdbc.utils.Page;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;

public class EmpDao1 {
    public static void main(String[] args) {
        Page page=new Page();
        page.setPage(1);
//        System.out.println(page.getPage());
//        System.out.println(page.getPageSize());
//        select2(page.getPage(),page.getPageSize());

        ArrayList<Emp> list1=select2(page.getPage(),page.getPageSize());
        list1.stream().forEach(System.out::println);

        ArrayList<Emp> list=new ArrayList<>();

    }
    //分页查询
    //分页查询
    //分页查询
    //分页查询
    public static void innert2(ArrayList<Emp> list) throws ParseException {
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection= JdbcUtil.getConnection();
//            String sql="insert into student(id,name,menoy,date) values(?,?,?,?),(?,?,?.?)";
            String sql1="insert into student(id,name,menoy)";

            for (int i = 0; i < list.size()-1; i++) {
                sql1+="values("+list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getMenoy()+"),";
            }
            String sql=sql1+"values("+list.get(list.size()).getId()+","+list.get(list.size()).getName()+","+list.get(list.size()).getMenoy()+")";

//            String str=emp.getDate();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            java.util.Date parse= sdf.parse(str);
//            java.sql.Date date=new Date(parse.getTime());
//
//            preparedStatement=connection.prepareStatement(sql);
//            preparedStatement.setInt(1,emp.getId());
//            preparedStatement.setString(2,emp.getName());
//            preparedStatement.setBigDecimal(3,emp.getMenoy());
//
//            ////此条数据不能省略
//            preparedStatement.setDate(4,emp.getDate());

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
    //分页查询
    //分页查询
    //分页查询
    //分页查询
    public static ArrayList<Emp> select2(Integer page,Integer pageSize){
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
            preparedStatement.setInt(1,page);
            preparedStatement.setInt(2,pageSize);

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
