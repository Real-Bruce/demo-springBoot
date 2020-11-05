package cn.bruce.springboot.controller;

import cn.bruce.springboot.dao.IAccountDao;
import cn.bruce.springboot.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bruce
 * @create 2020-11-04 16:38
 */
@RestController
public class AccountController {

    @Autowired
    IAccountDao accountDao;

    @GetMapping("/getAccountById/{id}")
    public Account getAccountById(@PathVariable("id") Integer id) {
        return accountDao.getAccountById(id);
    }

    @GetMapping("/getAccounts")
    public List<Account> getAccounts() {
        return accountDao.getAccounts();
    }

    @GetMapping("/saveAccount")
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @GetMapping("/deleteAccountById/{id}")
    public void deleteAccountById(@PathVariable("id") Integer id) {
        accountDao.deleteAccountById(id);
    }

    @GetMapping("/updateAccount")
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }
}
