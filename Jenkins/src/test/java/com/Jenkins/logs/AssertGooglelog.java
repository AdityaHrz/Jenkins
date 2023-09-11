package com.Jenkins.logs;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class AssertGooglelog {
	
	public static void main(String[]args){
		
		Logger logger = LogManager.getLogger(AssertGooglelog.class);
		
		System.out.println("Hello world");
		logger.error("This is error");
		logger.warn("This is warning");
		logger.fatal("This is fatal");
		
	}
}