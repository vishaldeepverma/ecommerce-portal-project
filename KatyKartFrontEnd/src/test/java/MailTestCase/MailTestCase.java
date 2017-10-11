package MailTestCase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.katykart.config.DBConfig;
import com.katykart.mail.OrderService;
import com.katykart.model.Orders;


public class MailTestCase {

	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

		OrderService orderService = (OrderService) context.getBean("mailControl1");
		orderService.sendOrderConfirmation1(getDummyOrder());
		((AbstractApplicationContext) context).close();
	}
	
	public static Orders getDummyOrder(){
		Orders order = new Orders();
		order.setOrderid(1111);
		order.setUsername("Thinkpad T510");
		order.setStatus("confirmed");
		
		order.setEmail("shivar.vijay.07@gmail.com");
		
		return order;
	}

	
	
}
