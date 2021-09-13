package com.saraya.AppSpringBoot;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saraya.service.Laptop;



@Controller
@SessionAttributes("username")
public class LaptopController {

	@Autowired
	LaptopService laptopService;
	UserValidation userVal;
	Laptop laptop;
	

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String acceuil() {
	
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(ModelMap model,@RequestParam String username,@RequestParam String password) {
		  
		if(userVal.isValid(username, password)) {
			
			return "redirect:/home";
			
		
		}else {
		
		return "login";
		
		}
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String welcome() {
		
		return "welcome";
		
	}
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String lists(ModelMap model) {
		
		
		model.addAttribute("laptops", laptopService.showAll());
		return "laptops";
	}
	
	@RequestMapping(value="/addlist", method=RequestMethod.GET)
	public String create(ModelMap modelmap) {
		
		return "createLaptops";
	}
	
	@RequestMapping(value="/addlist", method=RequestMethod.POST)
	public String addtoTDL(@RequestParam String mark,@RequestParam String model,@RequestParam int price,
			@RequestParam String description,@RequestParam String picture,ModelMap modelmap) {
		
		//String user=(String) modelmap.get("username");
		laptopService.addLaptop( "laye",mark, model,description, price,picture);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deletefromLp(@RequestParam int id, ModelMap model) {
		laptopService.deleteLaptop(id);
		model.clear();
		return "redirect:/list";
	}
	
   @RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(ModelMap model,@RequestParam int id) {
		model.addAttribute("laptop",laptopService.findById(id));
	
		return "updateLaptop";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updated( ModelMap model, @ModelAttribute("laptop") Laptop laptop) {
		
        
      
		
		laptop.setMark(laptop.getMark());
		laptop.setModel(laptop.getModel());
		laptop.setDescription(laptop.getDescription());
		laptop.setPrice(laptop.getPrice());
		laptop.setPicture(laptop.getPicture());
		laptopService.updateLaptop(laptop);
		model.clear();
		return "redirect:/list";
	}
	
	
}