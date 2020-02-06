package com.Sapient.OMS.Controller;

import com.Sapient.OMS.CustomerOrder;
import com.Sapient.OMS.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome";
    }

    @GetMapping("/order/{orderId}")
    public Optional<CustomerOrder> searchOrder(@PathVariable int orderId)
    {
        return orderService.searchOrder(orderId);
    }

    @GetMapping("/order")
    public ArrayList<CustomerOrder> getAllProdcuts()
    {
        return orderService.getAllOrders();
    }

    @PostMapping("/order")
    public void createProduct(@RequestBody CustomerOrder customerOrder)
    {
        orderService.createOrder(customerOrder);
    }
}
