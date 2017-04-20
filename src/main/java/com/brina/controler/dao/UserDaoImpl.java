package com.brina.controler.dao;

import com.brina.controler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.activation.DataSource;
import java.net.ConnectException;
import java.sql.*;

/**
 * Created by brina on 4/13/17.
 */

@Repository
@Qualifier("first")
public class UserDaoImpl implements UserDao {

    private final DataSource dataSource;

    @Autowired
    public UserDaoImpl(DataSource dataSource){
        this.dataSource=dataSource;
    }



    @Override
    public User findByName(User user) {
        Connection connection=null;
        User userFromDB=null;
        String query="select * from users where name = ?";

        try{
            connection=dataSource.getConnection();
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, user.getName());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return userFromDB;
    }
}
