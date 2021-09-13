package com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
/*
 * class MoodAnalyzerTestCases is the class is used to test the working of the code.
 * The main logic of the code is in MoodAnalyzer.java
 * @author Sanjana Rao
 * @since 12-09-2021
 */
public class MoodAnalyzerTestCases 
{
	  //Test Case 1- returns sad when the message has sad.
		@Test
	    public void WhenMoodIsSadDisplaysSAD() 
	    {
		  MoodAnalyzer  moodAnalyzer = new MoodAnalyzer("I'm feeling sad.");
		  String mood;
		  try
		  {
			  mood= moodAnalyzer.analyseMood();
			  Assert.assertEquals(mood, "SAD");
		  }
		  catch(MoodAnalysisException e)
		  {
			  e.printStackTrace();
		  }
	    }
	    
		//Test Case 2 - returns happy when the message has happy.
	    @Test
	    public void WhenMoodIsHappyDisplaysHAPPY() 
	    {
	    	MoodAnalyzer  moodAnalyzer = new MoodAnalyzer("I'm feeling happy. ");
	    	String mood;
	    	try
	    	{
	    		mood= moodAnalyzer.analyseMood();
		    	Assert.assertEquals(mood, "HAPPY");
	    	}
	    	catch(MoodAnalysisException e)
			 {
				  e.printStackTrace();
			 }
		}
	    
	   //Test Case 3 - returns happy when the message has no occurance of the word 'sad'.
	    @Test
	    public void WhenMoodIsAnythingElseDisplaysHAPPY() 
	    {
	    	MoodAnalyzer  moodAnalyzer = new MoodAnalyzer("I'm feeling okay.");
	    	String mood;
	    	try
	    	{
	    		mood = moodAnalyzer.analyseMood();
		    	Assert.assertEquals(mood, "HAPPY");
	    	}
	    	catch(MoodAnalysisException e)
			 {
				  e.printStackTrace();
			 }
		}
	    
	  //Test Case 4 -when mood entered is Null, displays exception message.
	    @Test
	    public void WhenMoodIsNullDisplaysExceptionMessage() 
	    {
	    	MoodAnalyzer  moodAnalyzer = new MoodAnalyzer(null);
	    	String mood;
	    	try
	    	{
	    		mood = moodAnalyzer.analyseMood();
	    	}
	    	catch(MoodAnalysisException e)
	    	{
	    		Assert.assertEquals("Please Enter a Valid message.",e.getMessage());
	    	}
		}
	    
	  //Test Case 5 -when mood entered is empty, displays exception message.
	    @Test
	    public void WhenMoodIsEmptyDisplaysExceptionMessage() 
	    {
	    	MoodAnalyzer  moodAnalyzer = new MoodAnalyzer(" ");
	    	try
	    	{
	    		moodAnalyzer.analyseMood();
	    	}
	    	catch(MoodAnalysisException e)
	    	{
	    		Assert.assertEquals("Please Enter a Valid message.",e.getMessage());
	    	}
		} 
}
