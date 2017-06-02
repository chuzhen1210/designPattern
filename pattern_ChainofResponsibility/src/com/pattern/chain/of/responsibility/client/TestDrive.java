package com.pattern.chain.of.responsibility.client;

import com.pattern.chain.of.responsibility.handler.DeptHandler;
import com.pattern.chain.of.responsibility.handler.GeneralHandler;
import com.pattern.chain.of.responsibility.handler.ProjectHandler;

public class TestDrive {

	public static void main(String[] args) {
		
		GeneralHandler generalHandler = new GeneralHandler(null);
		DeptHandler deptHandler = new DeptHandler(generalHandler);
		ProjectHandler projectHandler = new ProjectHandler(deptHandler);
		
		projectHandler.doHandle("chuzhen", 1510);
	}
}
