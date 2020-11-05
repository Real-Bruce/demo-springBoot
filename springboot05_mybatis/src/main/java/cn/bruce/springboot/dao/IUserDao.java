package cn.bruce.springboot.dao;

import cn.bruce.springboot.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Bruce
 * @create 2020-11-04 13:34
 */
public interface IUserDao {

    /**
     * 查询全部用户
     * @return
     */
    @Select("select * from user")
    List<User> getUsers();

    /**
     * 查询单个用户
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    User getUserById(Integer id);

    /**
     * 删除单个用户
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    Integer deleteUserById(Integer id);

    /**
     * 插入一个用户
     * @param user
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user (username, birthday, sex, address) values (#{username}, #{birthday}, #{sex}, #{address})")
    Integer saveUser(User user);


}
