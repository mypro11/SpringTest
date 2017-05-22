package com.brina.service.validation;

import com.brina.model.Category;
import com.brina.model.User;

import java.util.List;

public class UserValidate implements Validator<User> {

    @Override
    public void validate(final User user) {
        /*List<Category> categoryList = categoryDao.readAll(Category.class);
        String s1 = category.getCategoryName();
        boolean result = categoryList.stream().map(Category::getCategoryName).anyMatch(s -> s.equals(s1));

        if (result) {
            throw new IllegalArgumentException("Product name already exist");
        }*/
    }
}
