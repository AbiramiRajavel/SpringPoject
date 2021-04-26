package com.example.demoprojectfin;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demopro {
    @RequestMapping(value="/pagereg",method=RequestMethod.GET)
    public String dis() {
    	return "pagereg";
    }
    
    @RequestMapping(value="/completed",method=RequestMethod.POST)
    public ModelAndView dispaly(Helperdemo help)
    {
    	ModelAndView mav=new ModelAndView("completed");
    	System.out.println(help.getName());
       // mav.addObject(help);
        mav.addObject(help);
    	//mav.addObject("msg","welcome");
    	return mav;
    
    }
}
