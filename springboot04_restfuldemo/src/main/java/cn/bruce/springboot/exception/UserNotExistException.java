package cn.bruce.springboot.exception;

/**
 * @author Bruce
 * @create 2020-10-23 14:38
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
