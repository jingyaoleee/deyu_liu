package class78.com.service;

import class78.com.dao.UserDao;
import class78.com.model.UserModel;

import java.util.List;

public class UserService {

    // 判断账号或密码是否正确
    // 0-成功；1-账号不存在；2-密码错误;3-账号或密码错误
    public int sureAccountPassword(String account,String password){
        //从数据库（dao层）获取用户
        List<UserModel> userModelList = UserDao.createSystemAccount();
        for (int i = 0; i < userModelList.size();i++){
            // 获取UserModel对象
            UserModel userModel = userModelList.get(i);
            if(userModel.getAccount().equals(account)
                    && userModel.getPassword().equals(password)){
                return 0;
            }else{
                return 3;
            }
        }
        return 0;
    }
}
