package com.codewithdulan.thejobs.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithdulan.thejobs.dao.userDao;
import com.codewithdulan.thejobs.model.User;

public class userService {
	public  User getSpecifiUserByUserId(int userID) throws ClassNotFoundException, SQLException {

		return userDao.getTheUserByUserId(userID);
	}

	public  List<User> getAllUsers() throws ClassNotFoundException, SQLException{

		return userDao.getAllUsers();
	}

	public  boolean addUser(User user) throws ClassNotFoundException, SQLException {

		return userDao.addUser(user);
	}

	public  boolean updateUser(int id, int role_id) throws ClassNotFoundException, SQLException {

		return userDao.updateUser(id,role_id);
	}

	public  boolean deleteUser(int userID) throws ClassNotFoundException, SQLException {

		return userDao.deleteUser(userID);
	}

	public static List<User> getAllConsultants() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return userDao.getAllConsultants();
	}

	public boolean userExists(String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return userDao.checkUserExist(email);
	}
}
