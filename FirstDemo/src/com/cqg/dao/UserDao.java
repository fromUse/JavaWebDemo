package com.cqg.dao;

import com.cqg.bean.User;

public interface UserDao {
	/**
	 * 进行用户登陆操作
	 * @param name 账户名
	 * @param pass 密码
	 * @return 成功返回true,错误返回false
	 */
	boolean Login(String name,String pass);
	
	/**
	 * 用户退出登陆操作
	 * @param user 用户实体
	 * @return 成功退出登陆返回true,否则返回false
	 */
	boolean Logout(User user);
	/**
	 * 根据用户实体删除用户
	 * @param user 用户实体
	 * @return 成功返回true,否则返回false
	 */
	boolean DeleteUserByName(User user);
	/**
	 * 根据用户实体,修改用户信息
	 * @param user 用户实体
	 * @return 成功返回true,否则返回false
	 */
	boolean ModifyUserByName(User user);
	
	/**
	 * 根据用户实体增加用户
	 * @param user 用户实体
	 * @return 成功返回true,否则返回false
	 */
	boolean AddUser(User user);
}
