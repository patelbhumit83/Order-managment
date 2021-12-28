package com.egen.service;

import com.egen.model.Order;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findOne(String id);
    List<Order> findWithInterval(Timestamp start, Timestamp end);
    List<Order> findTop10OrderWithHighestDollarInZip(String zip);
    Order cancelOrder(Order order, String id);
    Order updateOrder(String id);
}
