package com.demomvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demo {
	
		@GetMapping("/demo")
		public ModelAndView name(){
			
			
			String aa="---------------- welcome MVCDEMO project page ---------";
			
			ModelAndView n=new ModelAndView();
			n.addObject("s1", aa);
			n.setViewName("page1");
			
			return n;
	}
}
