package cn.bruce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruce
 * @create 2020-10-09 9:47
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test springBoot fast";
    }
}
