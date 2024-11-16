package org.netology.ru.jdbc_demo.repository;
import org.netology.ru.jdbc_demo.dto.OrdersInfo;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper <OrdersInfo>  {

    @Override
    public OrdersInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrdersInfo product = new OrdersInfo();
        product.setProductName(rs.getString("product_name"));
        product.setName(rs.getString("name"));
        product.setSecondName(rs.getString("surname"));
        return product;
    }
}