package club.banyuan.shoppingstreet.dao;


import club.banyuan.shoppingstreet.domain.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {


    //查询商品的方法
    public List<Product> selectProduct() throws SQLException, ClassNotFoundException;
}