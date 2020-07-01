package com.banyuan.shengtang.jdbcTest.dao;

import com.banyuan.shengtang.jdbcTest.domain.*;

import java.sql.SQLException;
import java.util.List;

public interface IOrderDetailDao {

    //通过产品查询订单详情
    public List<OrderDetail> selectOrderDetailByPids(List<Product> products) throws Exception;
    //通过产品分别查询订单购买数量和总金额
    public List<ShoppingCart> selectCostByPids(List<Integer> productIds) throws SQLException;
    //通过订单号查询订单详情的方法
    public List<OrderDetail> selectOrderDetail(Integer orderId) throws Exception;
}
