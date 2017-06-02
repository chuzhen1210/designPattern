package com.pattern.proxy.impl;

import com.pattern.proxy.intf.PersonBean;

public class PersonBeanImpl implements PersonBean {

	private String name;
	private String gender;
	private String interests;
	private int rating;
	private int ratingCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	@Override
	public int getHotOrNotRating() {
		if(ratingCount == 0)
			return 0;
		
		return (rating/ratingCount);
	}
	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount ++;
	}
	
}
