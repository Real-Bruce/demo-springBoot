package cn.bruce.springboot.controller;

import cn.bruce.springboot.dao.IUserDao;
import cn.bruce.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bruce
 * @create 2020-11-04 13:54
 */
@RestController
public class UserController {

    @Autowired
    IUserDao userDao;

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userDao.getUserById(id);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @GetMapping("/saveUser")
    public User saveUser(User user) {
        userDao.saveUser(user);
        return user;
    }

    @GetMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable("id") Integer id) {
        userDao.deleteUserById(id);
        return id;
    }
}
