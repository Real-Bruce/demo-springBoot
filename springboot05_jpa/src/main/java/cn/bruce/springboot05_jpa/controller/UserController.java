package cn.bruce.springboot05_jpa.controller;

import cn.bruce.springboot05_jpa.entity.User;
import cn.bruce.springboot05_jpa.repostory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bruce
 * @create 2020-11-05 16:08
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/saveUser")
    public User saveUser(User user) {
        User saveUser = userRepository.save(user);
        return saveUser;
    }

    @GetMapping("/deleteUserById/{id}")
    public String deleteUserById(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
        return "删除成功";
    }

    @GetMapping("/updateUser")
    public User updateUser(User user) {
        User updateUser = userRepository.save(user);
        return updateUser;
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = userRepository.getOne(id);
        return user;
    }

}
