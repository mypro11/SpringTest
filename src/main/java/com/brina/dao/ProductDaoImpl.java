package com.brina.dao;

import com.brina.model.Product;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

    /*@Override
    public Product getProductById(Integer id) {
        Product product = (Product) sessionFactory.getCurrentSession().get(Product.class, id);
        return product;
    }*/

    @Override
    public Product getProductByIdWithCategory(Long id) {
        String hql ="from Product p join fetch p.category where p.id =:id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Product) query.uniqueResult();
    }

   /* @Override
    public Product addProduct(Product product) {
        Integer productId = (Integer) sessionFactory.getCurrentSession().save(product);
        return (Product) sessionFactory.getCurrentSession().get(Product.class, productId);
    }*/
}
