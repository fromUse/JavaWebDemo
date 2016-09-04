package com.cqg.demo.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqg.dao.UserDao;
import com.cqg.dao.impl.UserDaoImpl;
import com.cqg.demo.servlet.base.BaseServlet;

public class LoginServlet extends BaseServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doPost(request, response);
		if (print != null) {
			String user = request.getParameter("userName");
			String pwd = request.getParameter("userPassword");
			/*print.println("账户: " + user + " \n密码:" + pwd);
			
			String [] interest = request.getParameterValues("interest");
			print.println("兴趣 :");
			for (String str : interest) {
				print.print(str + " ");
			}*/
			UserDao userDao = new UserDaoImpl();
			
			if(userDao.Login(user, pwd)){
				print.print("登陆成功,欢迎:" + user);
			}else{
				print.print("账户或密码错误");
			}
			print.close();
		}
	}

}
