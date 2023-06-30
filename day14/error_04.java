package day14;

public class error_04 {
    public static void main(String[] args) {
        // 自定义异常
        String account = "zhangsan";
        String password = "12333";

        try {
            login(account, password);
        } catch (AccountException accountException) {
            System.out.println("账号不正确,需要重新修正");
        } catch (PasswordException passwordException) {
            System.out.println("密码不正确,需要重新修正");
        } catch (LoginException loginException) {
            System.out.println("其他登录错误,需要修正");
        }
    }

    public static void login(String account, String password) {
        if (!"admin".equals(account)) {
            throw new AccountException("账号不正确");
        }
        if (!"admin".equals(password)) {
            throw new PasswordException("密码不正确");
        }
    }

}

class AccountException extends LoginException {
    public AccountException(String message) {
        super(message);
    }
}

class PasswordException extends LoginException {
    public PasswordException(String message) {
        super(message);
    }
}

class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}