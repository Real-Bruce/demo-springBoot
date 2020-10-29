package cn.bruce.springboot.controller;

import cn.bruce.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Bruce
 * @create 2020-10-23 14:55
 */
@Controller
public class TestController {

    /*@RequestMapping({"/","/login.html"})
    public String index() {
        return "index";
    }*/

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){

        if (("123").equals(user)) {
            throw new UserNotExistException();
        }
        return "Hello Word";
    }

}
