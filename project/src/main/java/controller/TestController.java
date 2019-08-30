package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.BookService;

@Controller

public class TestController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("index")
	public String test(String txt,ModelMap m) {
		//return "index";
		//m.put("info", txt);
		if(txt==null) txt="";
		txt=" where book.name like '%"+txt+"%'";
		m.put("list", service.select(txt));
		return "index";
	}
	
	
}
