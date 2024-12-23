package org.example.order;

import java.util.UUID;

public class Order {
    private final UUID id = UUID.randomUUID();

    public UUID getId() {
        return id;
    }
}
