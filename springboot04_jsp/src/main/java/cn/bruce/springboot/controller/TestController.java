package cn.bruce.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Bruce
 * @create 2020-11-02 14:19
 */
@Controller
public class TestController {

    @GetMapping("/main")
    public String test() {
        return "main";
    }

    @GetMapping("/success")
    public String hello(Model model) {
        model.addAttribute("msg", "你好");
        return "success";
    }
}
