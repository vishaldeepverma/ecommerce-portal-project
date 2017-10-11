package com.katykart.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katykart.model.Orders;

@Service("mailControl1")
public class MailControl1 implements OrderService {
	
	
	@Autowired
	MailControl mailControl;

	
	@Override
	public void sendOrderConfirmation1(Orders Order) {
		mailControl.sendEmail(Order);
		
	}
	

}
