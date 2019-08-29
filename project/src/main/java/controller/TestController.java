package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class TestController {
	
	@RequestMapping("index")
	public void test(@RequestParam(defaultValue="1")int txt,ModelMap m) {
		//return "index";
		m.put("info", txt);
		
	}
	
}
