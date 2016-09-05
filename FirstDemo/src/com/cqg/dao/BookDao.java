package com.cqg.dao;

import java.util.List;

import com.cqg.bean.Book;
import com.cqg.bean.User;

public interface BookDao {

	List<Book> getAllBookByUser(User user);
	
	Book getBookByName(String name);
	
	boolean ModifyBook(Book book);
	
	boolean AddBook(Book book);
	
	boolean DeleteBook(Book book);
	
}
