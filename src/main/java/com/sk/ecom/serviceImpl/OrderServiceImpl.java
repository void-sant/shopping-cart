package com.sk.ecom.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sk.ecom.model.OrderRequest;
import com.sk.ecom.model.ProductOrder;
import com.sk.ecom.repository.ProductOrderRepository;
import com.sk.ecom.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private ProductOrderRepository orderRepository;

	@Override
	public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductOrder> getOrdersByUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductOrder updateOrderStatus(Integer id, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductOrder> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductOrder getOrdersByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
