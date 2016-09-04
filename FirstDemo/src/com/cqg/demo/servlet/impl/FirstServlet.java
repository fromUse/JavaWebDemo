package com.cqg.demo.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqg.demo.servlet.base.BaseServlet;

public class FirstServlet extends BaseServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
		Date date = new Date();
		
		if(print!=null){
			print = response.getWriter();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
			
			print.print("日期 :" + format.format(date) + "\n");
			print.print("你的ip : " + request.getRemoteAddr() + "\n");
			print.print("主机名 :"+request.getLocalName());
			print.close();
		}
	
	
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doPost(request, response);
	}


}
