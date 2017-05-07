package com.brina.service.validation;

import com.brina.dao.ProductDao;
import com.brina.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductValidator implements Validator<Product> {

    @Autowired
    private ProductDao productDao;

    @Override
    public void validate(final Product product) {
        List<Product> productList = productDao.readAll(Product.class);
        String s1 = product.getProductName();
        /*boolean result = productList.stream().map(Product::getProductName).anyMatch(s -> s.equals(s1));

        if (result) {
            throw new IllegalArgumentException("Product name already exist");
        }*/

    }
}
