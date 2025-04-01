package dev.tombolton.edaorderservice.usecase;

import dev.tombolton.edaorderservice.domain.aggregate.Order;
import dev.tombolton.edaorderservice.domain.port.OrderService;
import org.springframework.stereotype.Component;

@Component
public class ApplicationOrderService implements OrderService {

    @Override
    public void createOrder(Order order) {
        System.out.println(order);
    }
}
