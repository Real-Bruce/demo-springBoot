package cn.bruce.springboot.controller;

import cn.bruce.starter.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruce
 * @create 2020-11-10 15:55
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String Test() {
        return testService.testPrintString("cat");
    }
}
