package com.fancv.shardingdemo.service.impl;

import com.fancv.shardingdemo.service.OrderService;
import com.fancv.shardingdemo.mapper.OrderMapper;
import com.fancv.shardingdemo.model.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;



    @Override
    public List<Order> getOrderByUserId(Long userId) {
        return orderMapper.getOrderByUserId(userId);
    }

    @Override
    public List<Order> getOrderByOrderId(Long orderId) {
        return orderMapper.getOrderByOrderId(orderId);
    }

    @Override
    public List<Order> getOrderByRemark(String remark) {
        return orderMapper.getOrderByRemark(remark);
    }

    @Override
    public List<Order> getOrderByUserIdAndOrderId(Long userId, Long orderId) {
        return orderMapper.getOrderByUserIdAndOrderId(userId, orderId);
    }

    @Override
    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public int addOrderEncryptor(Order order) {
        return orderMapper.addOrderEncryptor(order);
    }

    @Override
    public void batchInsertOrder(List<Order> orders) {
        orderMapper.batchInsertOrder(orders);
    }
}
