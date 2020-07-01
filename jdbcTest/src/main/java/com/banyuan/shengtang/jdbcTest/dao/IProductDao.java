package com.banyuan.shengtang.jdbcTest.dao;

import com.banyuan.shengtang.jdbcTest.domain.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {


    //查询商品的方法
    public List<Product> selectProduct() throws SQLException, ClassNotFoundException;
}