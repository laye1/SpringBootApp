package com.saraya.AppSpringBoot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.service.Laptop;

@Service
public class LaptopService {
	
	
	private static List<Laptop> laptopList = new ArrayList<>();
	private int count = 3;
	
	static {
		
		laptopList.add(new Laptop("laye",1,"HP","probook","informations",1000,"https://images.unsplash.com/photo-1593642702909-dec73df255d7?ixid=MnwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80"));
		laptopList.add(new Laptop("laye",2,"DELL","probook","informations",1000,"https://images.unsplash.com/photo-1496181133206-80ce9b88a853?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1051&q=80"));
		laptopList.add(new Laptop("laye",3,"MACBOOK","probook","informations",1000,"https://images.unsplash.com/photo-1525547719571-a2d4ac8945e2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=80"));
	}
	
	
	public List<Laptop> showAll() {
		
		return laptopList;
	}
	
	public void addLaptop(String user,String mark,String model,String description,int price,String picture) {
		
		laptopList.add(new Laptop(user,++count,mark,model,description,price,picture));
	}
		
	public  void deleteLaptop(int id) {
			
			Iterator<Laptop> iterate = laptopList.iterator();
			while(iterate.hasNext()) {
				Laptop laptop = iterate.next();
				if(laptop.getId()==id) {
					
					iterate.remove();
					
				    
					
				}
				}
			}
	


	public Laptop findById(int id) {
		
		for(Laptop laptop:laptopList) {
			if(laptop.getId()==id) {
				return laptop;
			}
			
		}
		return null;
	}
	
	
	public void updateLaptop(Laptop laptop) {
		laptopList.remove(laptop);
		laptopList.add(laptop);
	}

	   
	}
