package cn.bruce.springboot05_jpa.repostory;

import cn.bruce.springboot05_jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bruce
 * @create 2020-11-05 16:04
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
