package com.mnn.keepcoding.service;

import com.mnn.keepcoding.domain.User;

/**
 * 用户类的服务层接口
 *
 * @author MaNing on 2022/2/9
 */
public interface UserService {
    public User getUser(Long id);

    public int insertUser(User user);
}
