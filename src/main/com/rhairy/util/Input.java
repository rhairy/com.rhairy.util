package com.rhairy.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input
{
	/**
	 *
	 * Prompts for an integer until a valid one is given and returns an integer primitive to the caller.
	 * @ param	String 	promptMsg 	Message to prompt the user with - "Enter an integer: "
	 * @ param	String 	errorMsg	Message to prompt the use with on error condition - "Invalid Input."
	 * @ returns 	int
	 *
	 */
	 
	public static int getIntRepeat( String promptMsg, String errorMsg )
	{	
		Scanner inputScanner = new Scanner(System.in);
		int result = 0;
		boolean valid = true;
			
		do {
			
			try {
				
			System.out.printf( "%s", promptMsg );
			result = inputScanner.nextInt();
			valid = true;
			
			} catch ( InputMismatchException e ) {
				
				valid = false;
				System.out.printf( "%s\n", errorMsg );
				inputScanner.next();			
			}
			
		} while ( !valid );
		
		return result;
	}
}