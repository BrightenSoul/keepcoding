package com.mnn.keepcoding.service.impl;

import com.mnn.keepcoding.domain.User;
import com.mnn.keepcoding.repository.userDao.UserDao;
import com.mnn.keepcoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户类服务层的实现类
 *
 * @author MaNing on 2022/2/9
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao = null;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
