package com.bridgelabz.MoodAnalyzer;
/*
 * The class MoodAnalyzerException is the custom exception class which has enumerators and a constructor.
 * @param type is used to declare the enumeration ExceptionType
 * @author Sanjana Rao
 * @since 12-09-2021
 */
public class MoodAnalysisException extends Exception
{
	/*
	 * An enumeration is created which has constant values when the message entered is empty and null
	 * @NULL_MESSAGE is if the user enters null
	 * @EMPTY_MESSAGE is when the user gives an empty message
	 */
	public enum ExceptionType 
	{
        NULL_MESSAGE,
        EMPTY_MESSAGE
    }
	
	public ExceptionType type;
	
	//Parameterized constructor which takes the exception message and initializes the exception type
	public MoodAnalysisException(String message, ExceptionType type)
	{
		super(message);
		this.type = type;
	}
}
