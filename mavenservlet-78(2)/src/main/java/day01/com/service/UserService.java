package day01.com.service;

import day01.com.dao.DBDao;
import day01.com.model.AccountModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService {
    DBDao dbDao = new DBDao();

    public AccountModel selectAccount(){

        AccountModel accountModel = new AccountModel();
        Connection connection = dbDao.getDBConnection();
        String sql = "select * from account where id = ?";
        PreparedStatement pst = null;
        try{
             pst = connection.prepareStatement(sql);
             pst.setInt(1,1);
             ResultSet rst = pst.executeQuery();
             while (rst.next()){
                int id = rst.getInt(1);
                String account = rst.getString(2);
                String password = rst.getString(3);
                System.out.println("id = " + id);
                System.out.println("account = " + account);
                System.out.print("password = "+ password);
             }
        }catch (Exception e){
            e.printStackTrace();
        }

        return accountModel;

    }


}
