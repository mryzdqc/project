package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.BookDao;
import entity.Book;
import service.BookService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JTest {
	
	@Autowired
	BookDao dao;
	@Autowired
	BookService service;
	
	
	@Test
	public void aa() {
//		Book b = dao.selectById(1);
//		System.out.println(b.getName());
		
//		List<Book> list = dao.select("");
//		for(Book b1:list) {
//			System.out.println(b1.getName());
//			System.out.println(b1.getSexname());
//			System.out.println(b1.getId());
//			System.out.println(b1.getTypeid());
//			System.out.println("============");
//		}
		
		Book b=new Book();
		b.setName("hellowor4");
		b.setSex(0);
		b.setId(19);
		b.setTypeid(2);
		
		
		System.out.println(service.update(b));
		
	}
}
