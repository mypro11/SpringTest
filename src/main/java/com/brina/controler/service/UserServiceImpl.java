package com.brina.controler.service;

import com.brina.controler.dao.UserDao;
import com.brina.controler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by brina on 4/13/17.
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(@Qualifier("first") UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findByName(User user) {
        return null;
    }
}
