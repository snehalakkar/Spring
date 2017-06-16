package com.bridgeLabz.SpringJdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgeLabz.SpringJdbc.Dto.Customer;

public class CustomerImpl implements CustomerDaoInterface {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer cust) {

		String qry = "insert into snel_db.Customer values (?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(qry, new Object[] { cust.getId(), cust.getName(), cust.getCountry() });
	}

	public List<Customer> displayAll() {
		String qry = "select * from snel_db.Customer ";
		List<Customer> cust = jdbcTemplate.queryForList(qry);
		return cust;
	}

	public String getcustomerNameById(int id) {
		String qry = "select name from snel_db.Customer where id=? ";
		Object[] o1 = new Object[] { id };
		String cu = (String) jdbcTemplate.queryForObject(qry, (Object[]) o1, String.class);
		return cu;
	}

	public Customer getCustomer(Integer id) {
		String SQL = "select * from snel_db.Customer where id = ?";
		Customer cust = (Customer) jdbcTemplate.queryForObject(SQL, new Object[] { id }, new CustomerMapper());
		return cust;
	}

}
