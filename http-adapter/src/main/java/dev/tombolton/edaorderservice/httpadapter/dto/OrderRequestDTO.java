package dev.tombolton.edaorderservice.httpadapter.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.List;

public record OrderRequestDTO(
        @NotNull
        String customerId,
        @NotNull
        String restaurantId,
        @NotNull
        @NotEmpty
        List<@Valid OrderItemDTO> items,
        @NotNull
        Double totalPrice,
        @NotNull
        String paymentMethod,
        @Valid
        @NotNull
        AddressDTO deliveryAddress,
        @NotNull
        String status,
        @NotNull
        Instant orderTime
) {
}
