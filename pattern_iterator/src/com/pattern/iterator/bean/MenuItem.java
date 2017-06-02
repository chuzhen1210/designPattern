package com.pattern.iterator.bean;

import java.util.Iterator;

import com.pattern.iterator.intf.MenuComponent;
import com.pattern.iterator.iterator.NullIterator;

/**
 * 对象村餐厅、煎饼屋的菜单项
 * @author chuzhen
 *
 */
public class MenuItem extends MenuComponent {

	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print() {
		System.out.print("   " + getName());
		
		if(isVegetarian()) {
			System.out.print("(v)");
		}
		
		System.out.println(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
	
}
