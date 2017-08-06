package com.dh1.service;

import com.dh1.model.User;
import org.springframework.stereotype.Repository;


public interface IUserService {
    public User selectUser(long userId);
}
