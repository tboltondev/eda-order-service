package dev.tombolton.edaorderservice.httpadapter.dto;

import jakarta.validation.constraints.NotNull;

public record AddressDTO(
        @NotNull
        String streetAddress,
        @NotNull
        String city,
        @NotNull
        String postCode,
        @NotNull
        Double latitude,
        @NotNull
        Double longitude
) {
}
