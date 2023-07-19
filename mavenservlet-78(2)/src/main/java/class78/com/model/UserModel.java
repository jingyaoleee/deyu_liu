package class78.com.model;

public class UserModel {

    // 账号
    private String account;
    // 密码
    private String password;

    public UserModel(){}

    public UserModel(String account,String password) {
        this.account = account;
        this.password = password;
    }

    // Getter 方法
    public String getAccount(){
        return account;
    }
    public String getPassword(){
        return password;
    }

    // setter方法
    public void setAccount(String account){
        this.account = account;
    }
    public void setPassword(String password){
        this.password = password;
    }

}
