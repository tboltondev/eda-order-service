package dev.tombolton.edaorderservice.httpadapter.controller;

import dev.tombolton.edaorderservice.httpadapter.dto.OrderRequestDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateOrderController {
    @PostMapping("/order")
    public static void createOrder(@Valid @RequestBody OrderRequestDTO orderRequest) {
        System.out.println(orderRequest);
    }
}