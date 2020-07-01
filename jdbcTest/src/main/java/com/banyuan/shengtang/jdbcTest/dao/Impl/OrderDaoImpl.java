package com.banyuan.shengtang.jdbcTest.dao.Impl;

import com.banyuan.shengtang.jdbcTest.dao.IOrderDao;
import com.banyuan.shengtang.jdbcTest.domain.Order;
import com.banyuan.shengtang.jdbcTest.domain.OrderDetail;
import com.banyuan.shengtang.jdbcTest.domain.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl extends BaseDaoImpl implements IOrderDao {
    public OrderDaoImpl(Connection connection) {
        super(connection);
    }


    @Override
    public List<Order> selectOrder(User user) throws Exception {
        String sql = "select * from `order` where userId = ?;";
        Object[] objects = {user.getId()};
        ResultSet resultSet = executeQuery(sql, objects);
        List<Order> order = tableToClass(resultSet);
        return order;
    }

    @Override
    public List<Order> tableToClass(ResultSet rs) throws Exception {
        ArrayList<Order> orders = new ArrayList<>();
        while(rs.next()){
            Order order = new Order();
            order.setId(rs.getInt(1));
            order.setUserId(rs.getInt(2));
            order.setLoginName(rs.getString(3));
            order.setUserAddress(rs.getString(4));
            order.setCreateTime(rs.getTime(5));
            order.setCost(rs.getDouble(6));
            order.setSerialNumber(rs.getString(7));
            orders.add(order);
        }
        return orders;
    }
}
