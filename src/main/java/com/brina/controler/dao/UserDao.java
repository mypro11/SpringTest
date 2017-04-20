package com.brina.controler.dao;

import com.brina.controler.model.User;

/**
 * Created by brina on 4/13/17.
 */
public interface UserDao {

    User findByName(User user);
}
