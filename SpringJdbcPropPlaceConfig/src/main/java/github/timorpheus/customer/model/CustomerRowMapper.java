package github.timorpheus.customer.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements org.springframework.jdbc.core.RowMapper {

    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        System.out.print("");
        customer.setCustId(rs.getInt("CUST_ID"));
        customer.setName(rs.getString("NAME"));
        customer.setAge(rs.getInt("AGE"));

        return customer;
    }
}
