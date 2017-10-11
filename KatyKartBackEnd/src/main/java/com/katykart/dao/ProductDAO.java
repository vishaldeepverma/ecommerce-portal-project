package com.katykart.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.katykart.model.Product;

@Repository("productDAO")
public class ProductDAO {
		@Autowired
		SessionFactory sessionFactory;
		
		public ProductDAO(SessionFactory sessionFactory1)
		{
			this.sessionFactory=sessionFactory1;
		}
		
		@Transactional
		public void insertUpdateProduct(Product product)
		{
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(product);
		}
		
		public Product getProduct(int prodid)
		{
			Session session=sessionFactory.openSession();
			Product product=(Product)session.get(Product.class,prodid);
			session.close();
			return product;
		}
		
		@Transactional
		public void deleteProduct(Product product)
		{
			sessionFactory.getCurrentSession().delete(product);
		}
		
		public List<Product> getProductDetails()
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Product where quantity>0");
			List<Product> list=query.list();
			session.close();
			return list;
		}
		


	}



