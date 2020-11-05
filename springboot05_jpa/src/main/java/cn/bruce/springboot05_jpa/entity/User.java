package cn.bruce.springboot05_jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Bruce
 * @create 2020-11-05 15:43
 */

/**
 * 使用JPA注解配置映射关系
 */
@Entity // 通知JPA此类是个实体类（和数据库映射的类）
@Table(name = "tbl_user")// 指明与那个数据库表映射，如果忽略则默认表名就是类名的缩写。数据库中可以没有此表，框架会自动创建
public class User {

    @Id //表明此属性为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 表明id自增
    private Integer id;

    @Column(name = "username", length = 50) // 指明此属性数据库表对应的列名
    private String name;

    @Column // 省略默认列名为属性名
    private Integer sex;

    @Column
    private String email;

    @Column
    private Date birthday;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
