package com.fancv.shardingdemo.controller;

import com.fancv.shardingdemo.model.Order;
import com.fancv.shardingdemo.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/demo")
@RestController
@Api(value = "/user", description = "Operations about user")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/add")
    public String add() {
        for (int i = 10; i < 20; i++) {
            Order order = new Order();
            long userId = i;
            long orderId = i;
            order.setUserId(userId);
            order.setOrderId(orderId);
            order.setRemark("remark:" + i);

            orderService.addOrder(order);

        }

        return "success";
    }

    @GetMapping("/get")
    public Order getOrderInfo(@RequestParam Long id) {
        return orderService.getOrderByOrderId(id).get(0);
    }
}
