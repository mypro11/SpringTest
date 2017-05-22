package com.brina.dao;

import com.brina.model.Product;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

    @Override
    public Product getProductByIdWithCategory(Long id) {
        String hql ="from Product p join fetch p.category where p.id =:id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Product) query.uniqueResult();
    }
}
