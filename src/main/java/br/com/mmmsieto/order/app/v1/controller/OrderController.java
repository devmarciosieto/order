package br.com.mmmsieto.order.app.v1.controller;

import br.com.mmmsieto.order.domain.entity.OrderEntity;
import br.com.mmmsieto.order.infrastructure.feign.SearchZipCodeClient;

import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@RequestMapping("/order")
@RestController
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private SearchZipCodeClient zipCode;

    @GetMapping
    public ResponseEntity<?> index() {

        log.info("create new order");

        return ResponseEntity.ok(zipCode.buscaCep("15910000"));


//        return ResponseEntity.ok(new OrderEntity.Builder()
//                .id(UUID.randomUUID())
//                .customerId(UUID.randomUUID())
//                .productId(UUID.randomUUID())
//                .quantity(2)
//                .amount(BigDecimal.TEN)
//                .date(LocalDateTime.now().plusDays(1))
//                .build());

    }
}
