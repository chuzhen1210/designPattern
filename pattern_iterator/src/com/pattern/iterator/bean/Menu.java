package com.pattern.iterator.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pattern.iterator.intf.MenuComponent;
import com.pattern.iterator.iterator.CompositeIterator;

public class Menu extends MenuComponent {

	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("----------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(this.menuComponents.iterator());
	}
}
