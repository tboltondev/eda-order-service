package dev.tombolton.edaorderservice.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
@Builder
public class OrderItem {
    @Getter
    private String id;
    @NonNull
    private String itemId;
    @NonNull
    private String name;
    @NonNull
    private Integer quantity;
    @NonNull
    private Double price;
}
