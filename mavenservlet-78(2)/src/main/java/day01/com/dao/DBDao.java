package day01.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBDao {

    Connection connection;
    static String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
    String username = "root";
    String password = "ldy123456";
    static {
        try{
            Class.forName(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getDBConnection(){
        try{
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public void closeDBConnection(Connection connection){
        try{
            if (connection!=null){
                try{
                    connection.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void closeDBConnetion(Connection connection, PreparedStatement pst){
        try{
            if (pst!=null){
                try{
                    pst.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try{
                    connection.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
