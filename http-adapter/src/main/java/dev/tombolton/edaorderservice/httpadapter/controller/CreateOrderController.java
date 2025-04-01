package dev.tombolton.edaorderservice.httpadapter.controller;

import dev.tombolton.edaorderservice.domain.aggregate.Order;
import dev.tombolton.edaorderservice.domain.entity.OrderItem;
import dev.tombolton.edaorderservice.domain.port.OrderService;
import dev.tombolton.edaorderservice.domain.valueobject.Address;
import dev.tombolton.edaorderservice.httpadapter.dto.AddressDTO;
import dev.tombolton.edaorderservice.httpadapter.dto.OrderItemDTO;
import dev.tombolton.edaorderservice.httpadapter.dto.OrderRequestDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateOrderController {

    private final OrderService orderService;

    public CreateOrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/v1/order")
    public void createOrder(@Valid @RequestBody OrderRequestDTO orderRequest) {
        this.orderService.createOrder(mapOrderDtoToDomain(orderRequest));
    }

    private Order mapOrderDtoToDomain(OrderRequestDTO orderRequestDTO) {
        return Order.builder()
                .customerId(orderRequestDTO.customerId())
                .restaurantId(orderRequestDTO.restaurantId())
                .items(orderRequestDTO.items().stream().map(this::mapOrderItemDtoToDomain).toList())
                .totalPrice(orderRequestDTO.totalPrice())
                .paymentMethod(orderRequestDTO.paymentMethod())
                .deliveryAddress(mapAddressDtoToDomain(orderRequestDTO.deliveryAddress()))
                .status(orderRequestDTO.status())
                .orderTime(orderRequestDTO.orderTime())
                .build();
    }

    private OrderItem mapOrderItemDtoToDomain(OrderItemDTO orderItemDTO) {
        return OrderItem.builder()
                .itemId(orderItemDTO.itemId())
                .name(orderItemDTO.name())
                .quantity(orderItemDTO.quantity())
                .price(orderItemDTO.price())
                .build();
    }

    private Address mapAddressDtoToDomain(AddressDTO addressDTO) {
        return Address.builder()
                .streetAddress(addressDTO.streetAddress())
                .city(addressDTO.city())
                .postCode(addressDTO.postCode())
                .latitude(addressDTO.latitude())
                .longitude(addressDTO.longitude())
                .build();
    }
}
