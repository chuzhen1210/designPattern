package com.pattern.template.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.pattern.template.intf.CaffeineBeverageWithHook;

public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	protected void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
	@Override
	protected boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		
		System.out.print("Would you like lemon with you tea (y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.err.println("IO error trying to read your answer");
		}
		
		if(answer == null) {
			return "no";
		}
		
		return answer;
	}

}
