package com.katykart.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.katykart.model.Orders;




@Repository("ordersDAO")

public class OrdersDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	public OrdersDAO()
	{
	
	}
	public OrdersDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUpdateOrders(Orders orders)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(orders);
	}
	
	public Orders getOrders(int orderid)
	{
		Session session=sessionFactory.openSession();
		Orders orders=(Orders)session.get(Orders.class,orderid);
		session.close();
		return orders;
	}
	public Orders getUserOrders(String username)
	{
		Session session=sessionFactory.openSession();
		Orders orders=(Orders)session.get(Orders.class,username);
		session.close();
		return orders;
	}

	@Transactional
	public void deleteOrders(Orders orders)
	{
		sessionFactory.getCurrentSession().delete(orders);
	}
	
	public List<Orders> getOrdersDetails(String username)
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Orders  where username=:username and status='N'");
		query.setParameter("username", username);
		@SuppressWarnings("unchecked")
		List<Orders> list=query.list();
		session.close();
		return list;
	}

	
	
	
}
