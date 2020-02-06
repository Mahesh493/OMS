package com.Sapient.OMS.Service;

import com.Sapient.OMS.CustomerOrder;
import com.Sapient.OMS.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void createOrder(CustomerOrder customerOrder) {
        orderRepository.save(customerOrder);
    }

    public Optional<CustomerOrder> searchOrder(int orderId) {
        return orderRepository.findById(orderId);
    }

    public ArrayList<CustomerOrder> getAllOrders()
    {
        ArrayList<CustomerOrder> ordersList = (ArrayList<CustomerOrder>) orderRepository.findAll();
        return ordersList;
    }
}
