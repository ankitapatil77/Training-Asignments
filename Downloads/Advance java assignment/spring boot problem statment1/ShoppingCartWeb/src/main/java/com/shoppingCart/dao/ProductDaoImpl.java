package com.shoppingCart.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingCart.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	

    @Autowired
    private SessionFactory sessionFactory;

    public List < Product > getProduct() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Product > cq = cb.createQuery(Product.class);
        Root < Product > root = cq.from(Product.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product book = session.byId(Product.class).load(id);
        session.delete(book);
    }

    @Override
    public void saveProduct(Product theProduct) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theProduct);
    }

    @Override
    public Product getProduct(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Product theProduct = currentSession.get(Product.class, theId);
        return theProduct;
    }

}
