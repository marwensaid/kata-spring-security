package com.howtodoinjava;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.userdetails.memory.InMemoryDaoImpl;

public class TestDemoService {
	
	static ApplicationContext applicationContext = null;
	static InMemoryDaoImpl userDetailsService = null;
	
	/**
	 * Initialize the application context to re-use in all test cases
	 * */
	@BeforeClass
	public static void setup()
	{
		//Create application context instance
		applicationContext = new ClassPathXmlApplicationContext("application-security.xml");
		//Get user details service configured in configuration 
		userDetailsService = applicationContext.getBean(InMemoryDaoImpl.class);
	}
	
	/**
	 * Test the valid user with valid role
	 * */
	@Test 
	public void testValidRole()
	{
	}
	
	/**
	 * Test the valid user with INVALID role
	 * */
	@Test
	public void testInvalidRole()
	{
	}
	
	/**
	 * Test the INVALID user 
	 * */
	@Test
	public void testInvalidUser()
	{
	}
	
}
