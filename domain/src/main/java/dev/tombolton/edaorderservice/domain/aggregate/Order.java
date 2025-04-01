package dev.tombolton.edaorderservice.domain.aggregate;

import dev.tombolton.edaorderservice.domain.entity.OrderItem;
import dev.tombolton.edaorderservice.domain.valueobject.Address;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class Order {
    @Getter
    private String id;
    @NonNull
    private String customerId;
    @NonNull
    private String restaurantId;
    @NonNull
    private List<OrderItem> items;
    private Double totalPrice;
    @NonNull
    private String paymentMethod;
    @NonNull
    private Address deliveryAddress;
    @NonNull
    private String status;
    @NonNull
    private Instant orderTime;
}
