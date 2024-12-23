package org.example.app.controller;

import org.example.order.Order;
import org.example.order.OrderManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderManagement orderManagement;

    public OrderController(OrderManagement orderManagement) {
        this.orderManagement = orderManagement;
    }

    @PostMapping("/complete")
    public String completeOrder() {
        Order order = new Order();
        orderManagement.completeOrder(order);
        return "Order completed successfully";
    }
}
