package br.com.mmmsieto.order.app.v1.controller;

import br.com.mmmsieto.order.domain.entity.OrderEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@RequestMapping("/order")
@RestController
public class OrderController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public OrderEntity index() {

        return new OrderEntity(
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                1202,
                BigDecimal.TEN,
                LocalDateTime.now().plusDays(1));

    }
}
