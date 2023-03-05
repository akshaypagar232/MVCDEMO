package com.demomvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demo {
	
		@GetMapping("/demo12")
		public ModelAndView name(){
			
			
			String st1="Welcome MVCDEMO project page";
			
			ModelAndView n=new ModelAndView();
			n.addObject("s", st1);
			n.setViewName("page2");
			
			return n;
	}
}
