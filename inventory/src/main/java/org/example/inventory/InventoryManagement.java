package org.example.inventory;

import org.example.order.OrderCompleted;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.context.event.EventListener;

@Service
public class InventoryManagement {
    private static final Logger LOG = LoggerFactory.getLogger(InventoryManagement.class);

    @EventListener
    public void onOrderCompleted(OrderCompleted event) {
        LOG.info("Order completed with ID: {}", event.orderId());
    }
}
