package com.bridgeLabz.SpringJdbc.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.bridgeLabz.SpringJdbc.Dto.Customer;

public class CustomerImpl implements CustomerDaoInterface {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer cust) {
		Connection con = null;
		String qry = "insert into snel_db.Customer values (?,?,?)";
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1, cust.getId());
			ps.setString(2, cust.getName());
			ps.setString(3, cust.getCountry());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public Customer getCustomerById(int id) {
		Connection con = null;
		String qry = "select * from snel_db.Customer where id=?";
		Customer cust = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				cust = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return cust;
	}

}
