package org.example.order;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderManagement {
    private final ApplicationEventPublisher events;

    public OrderManagement(ApplicationEventPublisher events) {
        this.events = events;
    }

    public void completeOrder(Order order) {
        events.publishEvent(new OrderCompleted(order.getId()));
    }
}
