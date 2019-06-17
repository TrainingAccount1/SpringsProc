package com.pack;

public class SpellChecker 
{
 private String message;
	
	public  SpellChecker(String message)
	{
		this.message=message;
		System.out.println("Inside SpleeChecker Class");
	}
	
	public void checking()
	{
		System.out.println("Spell Checking started");
		System.out.println("message value "+message);
	}
	
}
