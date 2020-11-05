package cn.bruce.springboot.dao;

import cn.bruce.springboot.domain.Account;

import java.util.List;

/**
 * @author Bruce
 * @create 2020-11-04 13:52
 */
public interface IAccountDao {
    /**
     * 根据id获取账户信息
     * @param id
     * @return
     */
    Account getAccountById(Integer id);

    /**
     * 获取全部账户
     * @return
     */
    List<Account> getAccounts();

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 根据id删除账户
     * @param id
     */
    void deleteAccountById(Integer id);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
}
