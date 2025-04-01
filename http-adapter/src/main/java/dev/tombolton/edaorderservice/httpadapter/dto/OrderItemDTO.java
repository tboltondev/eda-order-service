package dev.tombolton.edaorderservice.httpadapter.dto;

import jakarta.validation.constraints.NotNull;

public record OrderItemDTO(
        @NotNull
        String itemId,
        @NotNull
        String name,
        @NotNull
        Integer quantity,
        @NotNull
        Double price
) {
}
