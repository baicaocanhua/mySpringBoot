package com.maimai.myspringboot.until;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTools {
    /**
     * 这是连接数据库的方法，放到此工具类中
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception{
        //1.创建数据库的4个字符串

        // //2.创建Properties对象
        // Properties properties=new Properties();
        // //3.获取jdbc.pro对应的输入流
        // InputStream in=
        //         JDBCTools.class.getClassLoader().getResourceAsStream("/jdbc.properties");
        //
        //
        // System.out.println(in);
        // //4.加载输入流
        // properties.load(in);

        //driver=com.mysql.jdbc.Driver
        // jdbcUrl=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT
        // user=root
        // password=12346

        //5.具体决定4个字符串的值
        String driver="com.mysql.jdbc.Driver";//properties.getProperty("driver");
        String jdbcUrl="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";//properties.getProperty("jdbcUrl");
        String user="root";//properties.getProperty("user");
        String password="123456";//properties.getProperty("password");
        //6.加载数据库驱动程序
        Class.forName(driver);
        //7.通过DriverManager的getConnection()方法获取数据库连接
        Connection conn= DriverManager.getConnection(jdbcUrl, user, password);
        return conn;

    }

    /**
     　　*这是关闭数据库的工具方法，因为曾删改都需要用，所以写在此工具方法中
     　　*/

    public static void close(Statement statement, Connection conn){
        if(statement!=null){

            try {
                statement.close();
            } catch (Exception e2) {
                // TODO Auto-generated catch block
                e2.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (Exception e2) {
                // TODO Auto-generated catch block
                e2.printStackTrace();
            }
        }
    }

    /**
     * 创建一个insert,update,delete通用的方法
     * @param sql
     */
    public static void upDate(String sql){
        Connection conn=null;
        Statement statement=null;
        try {
            //调用工具类中的getConnection2()方法完成数据库连接
            conn=JDBCTools.getConnection();
            statement=conn.createStatement();
            //执行sql语句
            statement.executeUpdate(sql);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //调用工具类中的guanbi()方法来完成关闭statement和conn
            JDBCTools.close(statement, conn);
        }

    }

    public void testPreparedStatement(){
        Connection conn=null;
        PreparedStatement preStatement=null;//创建PreparedStatement对象
        try {
            //1、准备Connection连接数据库
            conn=JDBCTools.getConnection();
            //2、准备sql语句
            //sql语句不再采用拼接方式，应用占位符问号的方式写sql语句。
            String sql="insert into t_student(name,age,email) values(?,?,?)";
            //3、准备prepareStatement
            //对占位符设置值，占位符顺序从1开始，第一个参数是占位符的位置，第二个参数是占位符的值。
            preStatement=conn.prepareStatement(sql);
            //4、占位符设置值
            preStatement.setString(1, "klkl");
            preStatement.setInt(2, 12);
            preStatement.setString(3, "kkk@jjj");
            //5、执行sql
            preStatement.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            //6、关闭数据库等
            JDBCTools.close( preStatement, conn);
        }
    }
}
