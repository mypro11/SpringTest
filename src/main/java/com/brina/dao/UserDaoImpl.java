package com.brina.dao;

import com.brina.model.User;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    @Override
    public User findUser(User user) {
        String hql = "from User where username = :name and password = :password";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString("name", user.getUsername());
        query.setString("password", user.getPassword());
        return (User) query.uniqueResult();
    }
}


