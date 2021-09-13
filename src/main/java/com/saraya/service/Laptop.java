package com.saraya.service;

public class Laptop {
	
	private String user;
	private int id;
	private String mark;
	private String model;
	private String description;
	private int price;
	private String picture;
	
	
	
   public Laptop() {
	   super();
   }



	public Laptop(String user,int id, String mark, String model, String description, int price,String picture) {
		super();
		this.user = user;
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.description = description;
		this.price = price;
		this.picture = picture;
	}

	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMark() {
		return mark;
	}



	public void setMark(String mark) {
		this.mark = mark;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}
	
	

	public String getPicture() {
		return picture;
	}




	public void setPicture(String picture) {
		this.picture = picture;
	}


	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (id != other.id)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Laptop [user=" + user + ", id=" + id + ", mark=" + mark + ", model=" + model + ", description="
				+ description + ", price=" + price + ", picture=" + picture + "]";
	}



	
	
	
	
	
	

}
