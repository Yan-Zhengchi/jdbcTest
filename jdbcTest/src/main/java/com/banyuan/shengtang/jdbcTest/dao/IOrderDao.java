package com.banyuan.shengtang.jdbcTest.dao;

import com.banyuan.shengtang.jdbcTest.domain.Order;
import com.banyuan.shengtang.jdbcTest.domain.OrderDetail;
import com.banyuan.shengtang.jdbcTest.domain.User;

import java.util.List;

public interface IOrderDao {


    //查询用户订单方法
    public List<Order> selectOrder(User user) throws Exception;
}
