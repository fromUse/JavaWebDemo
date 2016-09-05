package com.cqg.dao.impl;

import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.cqg.bean.Book;
import com.cqg.bean.Books;
import com.cqg.bean.User;
import com.cqg.dao.BookDao;

public class BookDaoImpl implements BookDao {

	@Override
	public List<Book> getAllBookByUser(User user) {
		// TODO Auto-generated method stub


		try {

			JAXBContext context = JAXBContext.newInstance(Books.class);
			InputStream inputStream = getClass().getResourceAsStream(
					"/book.xml");

			Unmarshaller unmarshaller = context.createUnmarshaller();

			Books books = (Books) unmarshaller.unmarshal(inputStream);

			List<Book> bookList = books.getBooks();
		
			return bookList;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Book getBookByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ModifyBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AddBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void test(){
		
		
		getAllBookByUser(null);
	}
}
