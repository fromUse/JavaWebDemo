package com.cqg.demo.servlet.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqg.bean.Book;
import com.cqg.dao.BookDao;
import com.cqg.dao.UserDao;
import com.cqg.dao.impl.BookDaoImpl;
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
			UserDao userDao = new UserDaoImpl();
			
			if(userDao.Login(user, pwd)){
				
				BookDao bookDao = new BookDaoImpl();
				
				List<Book> books = bookDao.getAllBookByUser(null);
				
				print.print("<html> <body>");
				print.print("登陆成功,欢迎:" + user );
				print.print("<table border='1'>");
				print.print("<tr>");
				
				print.print("<th>");
					print.print("图片");
				print.print("</th>");
				
				print.print("<th>");
					print.print("书名");
				print.print("</th>");
				
				print.print("<th>");
					print.print("作者");
				print.print("</th>");
				
				print.print("<th>");
					print.print("价格");
				print.print("</th>");
		
				print.print("</tr>");
			
				for (Book book : books) {
					
					print.print("</tr>");
						print.print("<td>");
							print.print("<img src='"+getServletContext().getContextPath() + "/public/" + book.getImage() + "' alt='没图片'>");
						print.print("</td>");
						
						print.print("<td>");
							print.print(book.getName());
						print.print("</td>");
						
						
						print.print("<td>");
							print.print(book.getAuthor());
						print.print("</td>");
						
						print.print("<td>");
							print.print(book.getPrice());
						print.print("</td>");
						
					print.print("</tr>");
				
				}
				
				print.print(" </tale>");
				print.print(" </body> </html>");
				
			}else{
				print.print("账户或密码错误");
			}
			print.close();
		}
	}

}
