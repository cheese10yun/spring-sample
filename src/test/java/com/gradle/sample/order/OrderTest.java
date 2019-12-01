package com.gradle.sample.order;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;

public class OrderTest {

    @Test
    public void orderTest() {
        final Order order = new Order();

        order.getId();
        order.getOrderItems();
    }
}