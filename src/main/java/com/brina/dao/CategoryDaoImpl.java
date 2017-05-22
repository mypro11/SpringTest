package com.brina.dao;

import com.brina.model.Category;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryDaoImpl extends AbstractDao<Category> implements CategoryDao {

    @Override
    public Category getCategoryByIdWithProducts(Long id){
        String hql ="from Category c join fetch c.products s where c.id =:id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Category) query.uniqueResult();
    }
}
