package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Book;
import service.BookService;
import service.TypeService;

@Controller

public class TestController {
	
	@Autowired
	BookService service;
	
	@Autowired
	TypeService tservice;
	
	@RequestMapping("index")
	public String test(String txt,ModelMap m) {
		if(txt==null||txt.length()==0) txt="";
		txt=" where book.name like '%"+txt+"%'";
		m.put("list", service.select(txt));
		return "index";
	}
	
	@RequestMapping("insert")
	public String insert(Book b,ModelMap m) {
		service.insert(b);
		return test(null,m);
	}
	@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("sexs", Book.sexs);
		m.put("typelist", tservice.select(""));
		return "edit";
	}
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		service.delete(id);
		return test(null,m);
	}
	
	@RequestMapping("edit")
	public String edit(int id,ModelMap m) {
		m.put("sexs", Book.sexs);
		m.put("typelist", tservice.select(""));
		m.put("info",service.selectById(id));
		return "edit";
	}
	@RequestMapping("update")
	public String update(Book b,ModelMap m) {
		service.update(b);
		return test(null,m);
	}
	
}
