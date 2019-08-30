package service;

import java.util.List;


import entity.Book;

public interface BookService {
	
	public List<Book> select(String txt);
	
	public Book selectById(int id);
}
