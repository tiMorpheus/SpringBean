package github.timorpheus.customer.model;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerParameterizedRowMapper implements ParameterizedRowMapper {

    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();

        customer.setCustId(resultSet.getInt("CUST_ID"));
        customer.setName(resultSet.getString("NAME"));
        customer.setAge(resultSet.getInt("AGE"));

        return customer;
    }
}
