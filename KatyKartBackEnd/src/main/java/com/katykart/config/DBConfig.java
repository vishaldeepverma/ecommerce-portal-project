package com.katykart.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.katykart.dao.CartDAO;
import com.katykart.dao.CategoryDAO;
import com.katykart.dao.OfferDAO;
import com.katykart.dao.OrdersDAO;
import com.katykart.dao.ProductDAO;
import com.katykart.dao.SupplierDAO;
import com.katykart.dao.UserDAO;
import com.katykart.model.Cart;
import com.katykart.model.Category;
import com.katykart.model.Offer;
import com.katykart.model.Orders;
import com.katykart.model.Product;
import com.katykart.model.Supplier;
import com.katykart.model.UserDetails;

@Configuration
@ComponentScan("com.katykart.mail")
@EnableTransactionManagement
public class DBConfig 
{

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() 
	{
		System.out.println("Starting of the method getH2DataSource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/dtproject1");
		dataSource.setUsername("sa");
		dataSource.setPassword("vishal");
		return dataSource;
	}
	@Bean
	public JavaMailSender getMailSender()
	{
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		//Using Gmail SMTP configuration.
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("shivar.vijay.07@gmail.com");
		mailSender.setPassword("SwS-2020");
		
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		
		
		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}

	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		
		
		Properties prop=new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql", "true"); 
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(prop);
		
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(UserDetails.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(Orders.class);
		sessionBuilder.addAnnotatedClass(Offer.class);
		SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
				return sessionFactory;
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	@Autowired
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO(SessionFactory sessionFactory)
	{
		return new CategoryDAO(sessionFactory);
	}
		@Autowired
	@Bean(name="supplierDAO")
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory)
	{
		return new SupplierDAO(sessionFactory);
	}
	
		@Autowired
		@Bean(name="userDAO")
		public UserDAO getUserDAO(SessionFactory sessionFactory)
		{
			return new UserDAO(sessionFactory);
		}
		
		
		@Autowired
		@Bean(name="productDAO")
		public ProductDAO getProductDAO(SessionFactory sessionFactory)
		{
			return new ProductDAO(sessionFactory);
		}

		@Autowired
		@Bean(name="cartDAO")
		public CartDAO getCartDAO(SessionFactory sessionFactory)
		{
			return new CartDAO(sessionFactory);
		}
		@Autowired
		@Bean(name="ordersDAO")
		public OrdersDAO getOrderDAO(SessionFactory sessionFactory)
		{
			return new OrdersDAO(sessionFactory);
		}
		@Autowired
		@Bean(name="offerDAO")
		public OfferDAO getOfferDAO(SessionFactory sessionFactory)
		{
			return new OfferDAO(sessionFactory);
		}
}


