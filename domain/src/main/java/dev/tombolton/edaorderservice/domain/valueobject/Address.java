package dev.tombolton.edaorderservice.domain.valueobject;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Address {
    @NonNull
    private String streetAddress;
    @NonNull
    private String city;
    @NonNull
    private String postCode;
    @NonNull
    private Double latitude;
    @NonNull
    private Double longitude;
}
