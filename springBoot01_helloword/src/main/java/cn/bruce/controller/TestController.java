package cn.bruce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Bruce
 * @create 2020-09-29 17:13
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/testSpringBoot")
    public String test() {
        return "Test SpringBoot......";
    }
}
