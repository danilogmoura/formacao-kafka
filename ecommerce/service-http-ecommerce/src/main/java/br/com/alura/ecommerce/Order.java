package br.com.alura.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String userId;
    private final BigDecimal amount;
    private final String email;

    public Order(String userId, BigDecimal amount, String email) {
        this.userId = userId;
        this.amount = amount;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }
}
