package com.katykart;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.katykart.dao.CartDAO;
import com.katykart.dao.CategoryDAO;
import com.katykart.dao.ProductDAO;
import com.katykart.model.Cart;
import com.katykart.model.Product;


@Controller
public class PageController {
	
	@Autowired
		CategoryDAO categoryDAO;
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CartDAO cartDAO;
	
	
	@RequestMapping("/Login")
	public String Login()
	{
		
		
		return "Login";
}
	
	@RequestMapping("/AboutUs")
	public String AboutUs()
	{
		
		
		return "AboutUs";
}
	@RequestMapping("/ContactUs")
	public String ContactUs()
	{
		
		
		return "ContactUs";
}
	
	
	
	@RequestMapping("/LoginError")
	public String LoginError()
	{
		
		
		return "LoginError";
}
	@RequestMapping("/signup")
	public String signup()
	{
		
		
		return "signuppage";
	}
	
	
	@RequestMapping("/Warning")
	public String warning()
	{
		
		
		return "Warning";
}
	
	
	@RequestMapping("/Rings")
	public String Rings(Model m,HttpSession session)
	{
		String username=(String) session.getAttribute("username");
		List<Cart> cartlist=cartDAO.getCartDetails(username);
		
		int grandtotal=0;
		
	for(Cart cart:cartlist)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
		
		
		
		m.addAttribute("grandtotal",grandtotal);
	

		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Rings";
	}
	
	@RequestMapping("/Earrings")
	public String category(Model m,HttpSession session)
	{
		String username=(String) session.getAttribute("username");
		List<Cart> cartlist=cartDAO.getCartDetails(username);
		
		int grandtotal=0;
		
	for(Cart cart:cartlist)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
		
		
		
		m.addAttribute("grandtotal",grandtotal);
	
		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Earrings";
	}
	
	
	@RequestMapping("/Necklaces")
	public String Necklaces(Model m,HttpSession session)
	{
		
		
		String username=(String) session.getAttribute("username");
		List<Cart> cartlist=cartDAO.getCartDetails(username);
		
		int grandtotal=0;
		
	for(Cart cart:cartlist)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
		
		
		
		m.addAttribute("grandtotal",grandtotal);
	
	
		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Necklaces";
	}
	
	
	@RequestMapping("/Pendants")
	public String Pendants(Model m,HttpSession session)
	{
		
		String username=(String) session.getAttribute("username");
		List<Cart> cartlist=cartDAO.getCartDetails(username);
		
		int grandtotal=0;
		
	for(Cart cart:cartlist)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
		
		
		
		m.addAttribute("grandtotal",grandtotal);
	
		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Pendants";
	}
	
	
	
	@RequestMapping("/Bracelets")
	public String Bracelets(Model m,HttpSession session)
	{
		
		String username=(String) session.getAttribute("username");
		List<Cart> cartlist=cartDAO.getCartDetails(username);
		
		int grandtotal=0;
		
	for(Cart cart:cartlist)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
		
		
		
		m.addAttribute("grandtotal",grandtotal);
	
		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "Bracelets";
	}
	
	
	
	
	
	
    }


