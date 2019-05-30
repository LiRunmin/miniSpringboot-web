package com.newmedia.stockpredict.service;

import com.newmedia.stockpredict.model.User;
import com.newmedia.stockpredict.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Slf4j
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;


    /**
     * 根据名字查找用户
     */
    public User selectUserByName(String name) {
        logger.info("插入用户logger测试");
        logger.error("controller error级别出错");
        return userRepository.findUserByName(name);
    }

    /**
     * 查找所有用户
     */
    public List<User> selectAllUser() {
        return userRepository.findAllUser();
    }

    /**
     * 插入两个用户
     */
    public void insertService() {
        logger.info("插入用户logger测试");
        logger.error("controller error级别出错");
        userRepository.insertUser("SnailClimb", 22, 3000.0);
        userRepository.insertUser("Daisy", 19, 3000.0);
    }

    /**
     * 根据id 删除用户
     */

    public void deleteService(int id) {
        userRepository.deleteUser(id);
    }

    /**
     * 模拟事务。由于加上了 @Transactional注解，如果转账中途出了意外 SnailClimb 和 Daisy 的钱都不会改变。
     */
    @Transactional
    public void changemoney() {
        userRepository.updateUser("SnailClimb", 22, 2000.0, 3);
        // 模拟转账过程中可能遇到的意外状况
        int temp = 1 / 0;
        userRepository.updateUser("Daisy", 19, 4000.0, 4);
    }
}