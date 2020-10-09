package cn.bruce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Bruce
 * @create 2020-09-29 15:51
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot";
    }

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "Test SpringBoot";
    }
}
