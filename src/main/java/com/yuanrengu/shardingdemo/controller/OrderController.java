package com.yuanrengu.shardingdemo.controller;

import com.yuanrengu.shardingdemo.model.Order;
import com.yuanrengu.shardingdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/demo")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/add")
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
}
