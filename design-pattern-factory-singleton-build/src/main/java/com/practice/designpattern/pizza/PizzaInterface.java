package com.practice.designpattern.pizza;

public interface PizzaInterface {

	public String getNom();
	
	public int getPrix();
	
	public String getSauce();
	
	public String getGarniture();
	
	public String getPate();

	public void prepare();

	public void cuire();
}
