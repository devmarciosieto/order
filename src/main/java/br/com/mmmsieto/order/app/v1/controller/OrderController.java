package br.com.mmmsieto.order.app.v1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return "Hello World!";
    }
}
