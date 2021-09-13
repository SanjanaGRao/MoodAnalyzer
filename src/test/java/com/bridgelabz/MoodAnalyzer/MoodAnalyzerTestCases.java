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
	  @Test
	    public void WhenMoodIsSadDisplaysSAD() 
	    {
		  MoodAnalyzer  moodAnalyzer = new MoodAnalyzer("I'm feeling sad.");
		  String mood = moodAnalyzer.analyseMood();
		  Assert.assertEquals(mood, "SAD");
	    }
	    
	    @Test
	    public void WhenMoodIsHappyDisplaysHAPPY() 
	    {
	    	MoodAnalyzer  moodAnalyzer = new MoodAnalyzer("I'm feeling happy. ");
	    	String mood = moodAnalyzer.analyseMood();
	    	Assert.assertEquals(mood, "HAPPY");
		}
	    
	    @Test
	    public void WhenMoodIsAnythingElseDisplaysHAPPY() 
	    {
	    	MoodAnalyzer  moodAnalyzer = new MoodAnalyzer("I'm feeling okay.");
	    	String mood = moodAnalyzer.analyseMood();
	    	Assert.assertEquals(mood, "HAPPY");
		}	 
}
