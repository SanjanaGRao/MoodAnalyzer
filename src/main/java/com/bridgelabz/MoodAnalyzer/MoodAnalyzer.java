package com.bridgelabz.MoodAnalyzer;
/*
 * The class MoodAnalyzer is the class which tells the mood as HAPPY or SAD based on the message passed.
 * @param message is the mood message passed in Junit Test Case
 * @author Sanjana Rao
 * @since 12-09-2021
 */
public class MoodAnalyzer 
{
	String message;
	
	public MoodAnalyzer(String string) 
	{
		this.message = message;
	}

	//Constructor to initialize the @param message
	public String MoodAnalyzer(String message) throws MoodAnalysisException
	{
		this.message = message;
		return analyseMood();
	}
	
	// This method returns SAD or HAPPY mood
	public String analyseMood() throws MoodAnalysisException
	{
		try
		{
			if(message.length() == 0)
			{
				throw new MoodAnalysisException("Please Enter a Valid message.",MoodAnalysisException.ExceptionType.EMPTY_MESSAGE);
			}
			else if (message.contains("sad")) 
			{
				return "SAD";
			} 
			else 
			{
				return "HAPPY";
			}
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalysisException("Please Enter a Valid message.",MoodAnalysisException.ExceptionType.NULL_MESSAGE);
		}
	}
}
