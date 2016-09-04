package com.cqg.dao.impl;

import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.cqg.bean.User;
import com.cqg.bean.Users;
import com.cqg.dao.UserDao;

public class UserDaoImpl implements UserDao{

	@Override
	@Test
	public boolean Login(String name, String pass) {
		
		try {
			InputStream input = getClass().getResourceAsStream("/user.xml");
			JAXBContext context = JAXBContext.newInstance(Users.class);
			Users users = (Users)context.createUnmarshaller().unmarshal(input);
			List<User> userList = users.getUsers();
			
			
			for (User user : userList) {
				boolean nameExist = user.getName().equals(name);
				boolean passwdExist = user.getPassword().equals(pass);
				if(nameExist && passwdExist){
					return true;
				}
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Logout(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUserByName(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ModifyUserByName(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AddUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}



}
