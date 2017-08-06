package com.dh1.dao;

import com.dh1.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    User selectUser(long id);
}
