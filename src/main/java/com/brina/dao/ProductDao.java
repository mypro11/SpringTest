package com.brina.dao;

import com.brina.model.Product;

public interface ProductDao extends GenericDao<Product> {

    Product getProductByIdWithCategory(Long id);
}