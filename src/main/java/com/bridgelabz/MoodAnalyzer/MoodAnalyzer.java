package com.bridgelabz.MoodAnalyzer;
/*
 * class MoodAnalyzer is the class which tells the mood as HAPPY or SAD based on the message passed.
 * @param message is the mood message passed in Junit Test Case
 * @author Sanjana Rao
 * @since 12-09-2021
 */
public class MoodAnalyzer 
{
	String message;
	
	//Constructor to initialize the @param message
	public MoodAnalyzer(String message) 
	{
		this.message = message;
	}
	
	// This method returns SAD or HAPPY mood
	public String analyseMood() 
	{
		if (message.contains("sad")) 
		{
			return "SAD";
		} 
		else 
		{
			return "HAPPY";
		}
	}
}
