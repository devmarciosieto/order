package br.com.mmmsieto.order.app.v1.controller.domain.entity;

import br.com.mmmsieto.order.app.v1.controller.domain.exceptions.DomainException;
import br.com.mmmsieto.order.app.v1.controller.domain.exceptions.Error;

import lombok.Getter;
import org.apache.commons.lang3.Validate;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class OrderEntity {

    private UUID id;
    private UUID customerId;
    private UUID productId;
    private Integer quantity;
    private BigDecimal amount;
    private LocalDateTime date;

    public OrderEntity(UUID id,
                       UUID customerId,
                       UUID productId,
                       Integer quantity,
                       BigDecimal amount,
                       LocalDateTime date) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
        validate();
    }

    private void validate() {
        List<Error> errors = new ArrayList<>();

        try {
            Validate.notNull(id, "id cannot be null");
        } catch (IllegalArgumentException e) {
            errors.add(new Error(e.getMessage()));
        }

        try {
            Validate.notNull(customerId, "customerId cannot be null");
        } catch (IllegalArgumentException e) {
            errors.add(new Error(e.getMessage()));
        }

        try {
            Validate.notNull(productId, "productId cannot be null");
        } catch (IllegalArgumentException e) {
            errors.add(new Error(e.getMessage()));
        }

        try {
            Validate.notNull(quantity, "quantity cannot be null");
            Validate.isTrue(quantity > 0, "quantity must be greater than zero");
        } catch (IllegalArgumentException e) {
            errors.add(new Error(e.getMessage()));
        }

        try {
            Validate.notNull(amount, "amount cannot be null");
            Validate.isTrue(amount.compareTo(BigDecimal.ZERO) > 0, "amount must be greater than zero");
        } catch (IllegalArgumentException e) {
            errors.add(new Error(e.getMessage()));
        }

        try {
            Validate.notNull(date, "date cannot be null");
            Validate.isTrue(date.isAfter(LocalDateTime.now()), "date cannot be in the past");
        } catch (IllegalArgumentException e) {
            errors.add(new Error(e.getMessage()));
        }

        if (!errors.isEmpty()) {
            throw DomainException.with(errors);
        }
    }

}
