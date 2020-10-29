package cn.bruce.springboot.controller;

import cn.bruce.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruce
 * @create 2020-10-27 13:19
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        // 传入自定义的错误状态码   4xx  5xx
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code", "user.notexist");
        map.put("message", "用户出错啦");

        request.setAttribute("ext", map);
        // 转发到/error页面，此时浏览器和其他客户端响应的内容不同，由BasicErrorController处理
        return "forward:/error";
    }
}
