package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.User;

import comdao.UserDao;

public class UserDaoImpl implements UserDao {

	private Connection con;

	public UserDaoImpl(Connection con) {
		this.con = con;
	}

	public boolean userRegistration(User u) {
		boolean f = false;
		try {
			String query = "insert into user(full_name,email,password) value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, u.getFullName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
		return f;
	}

}
