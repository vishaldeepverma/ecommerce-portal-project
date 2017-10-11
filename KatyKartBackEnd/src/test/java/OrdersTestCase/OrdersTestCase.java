package OrdersTestCase;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.katykart.dao.OrdersDAO;
import com.katykart.model.Orders;

public class OrdersTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
		
		context1.scan("com.katykart");
		
		context1.refresh();
		
		// Inserting a Orders Object.
		OrdersDAO ordersDAO=(OrdersDAO)context1.getBean("ordersDAO");
		
		//Insertion TestCase
		
		/*Orders orders=new Orders();
		
		orders.setUsername("vishal");
		orders.setPaymode("bus");
		orders.setStatus("N");
		ordersDAO.insertUpdateOrders(orders);		
		System.out.println("Orders Inserted");*/
		
		//Retrieval TestCase
		
		/*Orders orders=ordersDAO.getOrders(1);
		System.out.println("Orders Name:"+orders.getUsername());
		System.out.println("Orders Description:"+orders.getPaymode());*/
		
		//Deletion TestCase
		/*Orders orders=ordersDAO.getOrders(1);
		ordersDAO.deleteOrders(orders);
		System.out.println("The Orders Deleted");*/
		
		//Retrieving the Data
		
		//List<Orders> list=ordersDAO.getOrdersDetails("shiva");
		
		/*for(Orders orders:list)
		{
			System.out.println(orders.getOrderid()+":"+orders.getUsername());
		}*/
		
		//Update the Orders
		/*Orders orders=ordersDAO.getUserOrders("Vishal");
		orders.setUsername("vishaldeep");
		ordersDAO.insertUpdateOrders(orders);
		System.out.println("The Orders Updated");*/
		
		
		
			}
}


