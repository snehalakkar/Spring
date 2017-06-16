package com.bridgeLabz.SpringJdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bridgeLabz.SpringJdbc.Dto.Customer;

public class CustomerMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		Customer cust = new Customer();
		cust.setId(rs.getInt(1));
		cust.setName(rs.getString(2));
		cust.setCountry(rs.getString(3));
		return cust;
	}

}
