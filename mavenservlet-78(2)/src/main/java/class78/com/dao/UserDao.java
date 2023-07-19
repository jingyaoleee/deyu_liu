package class78.com.dao;

import class78.com.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // 构造系统账户
    public static List<UserModel> createSystemAccount(){
        // 创建List对象，用来存放UserModel对象
        List<UserModel> userModelList = new ArrayList<>();
        for (int i=0; i < 3;i++) {
            // 创建UserModel对象
            UserModel userModel = new UserModel();
            userModel.setAccount("account"+(i+1));
            userModel.setPassword("password"+(i+1));
            userModelList.add(userModel);
        }
        return userModelList;
    }


}
