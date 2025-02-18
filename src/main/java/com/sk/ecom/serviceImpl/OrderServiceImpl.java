package com.sk.ecom.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sk.ecom.model.Cart;
import com.sk.ecom.model.OrderAddress;
import com.sk.ecom.model.OrderRequest;
import com.sk.ecom.model.ProductOrder;
import com.sk.ecom.repository.CartRepository;
import com.sk.ecom.repository.ProductOrderRepository;
import com.sk.ecom.service.OrderService;
import com.sk.ecom.util.OrderStatus;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private ProductOrderRepository orderRepository;
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception {
		List<Cart> carts = cartRepository.findByUserId(userid);
		
		for(Cart cart : carts) {
			ProductOrder order = new ProductOrder();
			order.setOrderId(UUID.randomUUID().toString());
			order.setOrderDate(LocalDate.now());
			
			order.setProduct(cart.getProduct());
			order.setPrice(cart.getProduct().getDiscountPrice());
			
			order.setStatus(OrderStatus.IN_PROGRESS.getName());
			order.setPaymentType(orderRequest.getPaymentType());
			
			OrderAddress address = new OrderAddress();
			address.setFirstName(orderRequest.getFirstName());
			address.setLastName(orderRequest.getLastName());
			address.setEmail(orderRequest.getEmail());
			address.setMobileNo(orderRequest.getMobileNo());
			address.setAddress(orderRequest.getAddress());
			address.setCity(orderRequest.getCity());
			address.setState(orderRequest.getState());
			address.setPincode(orderRequest.getPincode());
			
			order.setOrderAddress(address);
			
			ProductOrder saveOrder = orderRepository.save(order);
			//sendMailForProductOrder(saveOrder, "success");

		}
		
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
