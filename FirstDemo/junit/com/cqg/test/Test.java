package com.cqg.test;

import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.cqg.bean.User;
import com.cqg.bean.Users;

public class Test{

	
	@org.junit.Test
	public void test(){
		try {
		
			InputStream input = getClass().getResourceAsStream("/user.xml");
			JAXBContext context = JAXBContext.newInstance(Users.class);
			Users users = (Users)context.createUnmarshaller().unmarshal(input);
			List<User> userList = users.getUsers();
			
			System.out.println(userList);
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
