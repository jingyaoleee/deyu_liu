package day01.com.test;

import day01.com.service.UserService;
import day01.com.dao.DBDao;

import java.sql.Connection;

public class Test {

    public static void main(String[] arg) {
//        DBDao dbDao = new DBDao();
//       Connection connection = dbDao.getDBConnection();
//       System.out.println(connection);
//       dbDao.closeDBConnection(connection);
        UserService userService = new UserService();
        userService.selectAccount();
    }
}
