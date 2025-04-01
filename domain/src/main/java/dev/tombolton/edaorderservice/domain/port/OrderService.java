package dev.tombolton.edaorderservice.domain.port;

import dev.tombolton.edaorderservice.domain.aggregate.Order;

public interface OrderService {
    void createOrder(Order order);
}
