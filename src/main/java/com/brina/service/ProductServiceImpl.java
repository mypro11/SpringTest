package com.brina.service;

import com.brina.dao.ProductDao;
import com.brina.model.Product;
import com.brina.service.validation.ProductValidator;
import com.brina.service.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    @Qualifier("productValidator")
    private Validator validator;

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Long id) {
        return productDao.read(Product.class, id);
    }

    @Override
    public Product getProductByIdWithCategory(Long id) {
        return productDao.getProductByIdWithCategory(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productDao.create(product);
    }


}
