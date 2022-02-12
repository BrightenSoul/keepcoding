package com.mnn.keepcoding.repository.userdao;

import com.mnn.keepcoding.domain.User;
import org.springframework.stereotype.Repository;

/**
 * User类的Dao接口
 *
 * @author MaNing on 2022/2/9
 */
//标记在 MyBatis 的 DAO 层的操作接口上，用于在扫描 MyBatis 的接口时起标识作用。可以使用 @Mapper 接口代替。
@Repository
public interface UserDao {
    public User getUser(Long id);

    public int insertUser(User user);
}
