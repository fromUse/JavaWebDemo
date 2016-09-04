package com.cqg.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="users")
public class Users {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	@XmlElement(name="user")
	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}
	
	
}
