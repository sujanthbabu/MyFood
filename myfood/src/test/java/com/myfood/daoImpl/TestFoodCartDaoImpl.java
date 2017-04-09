package com.myfood.daoImpl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myfood.dao.FoodCartDao;
import com.myfood.model.CartItem;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-beans.xml","classpath:datasource.xml" })
public class TestFoodCartDaoImpl {
	
	@Autowired
	private FoodCartDao foodCartDao;
	
	@Test
	public void testGetRecentCartId(){
		System.out.println(foodCartDao.getRecentCartId());
	}
	
	@Test
	public void testGetActiveCartByCustomerId(){
		int customerId = 106;
		List<CartItem> cartList = foodCartDao.getActiveCustomerCartByCustomerId(customerId);
		for (CartItem cartItem : cartList) {
			System.out.println(cartItem);
		}
	}

}
