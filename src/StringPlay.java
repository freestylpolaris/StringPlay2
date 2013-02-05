/*
 * Modified on 1/31/2013
 * 
 * ULID: Rkhickm
 * Course: IT 168
 * Lecture Section: 4
 * Instructor: Professor Matsuda
 * Lab section: 5
 * Instructor: Professor Erickson
 */

/**
 * Asks the user for their favorite quote and then displays on the user's screen: the original string they entered, the amount of characters in the string they entered, the first word of their string in all upper case,
 * the last word of their string in all camel case, the first middle and last characters of the string labeled, and all the vowels in the user's string converted to a #. 
 * 
 * &author Ryan Hickman
 * 
 */

import java.util.Scanner;						

public class StringPlay 
{
	public static void main (String [] args)
	{
		//Declares the variable "quote"
		String quote;							
		
		//Creates a scanner input to read input
		Scanner keyboard = new Scanner(System.in);
		
		//*************************************************************************************
		//Asks the user for their favorite quote and then displays it on the user's screen
		//*************************************************************************************
		
		//Asks the user what their favorite quote is and allows them to input it into the program
		System.out.println("What is your favorite quote?");
		quote = keyboard.nextLine();
		
		//Displays the user's favorite quote on the screen
		System.out.println("You entered: " + quote);
		
		//**************************************************************************************
		//Calculates and displays the character length of the user's quote
		//**************************************************************************************
		
		//Declares an int variable named "stringSize" and calculates the character length of the user's quote
		int stringSize = quote.length();
		
		//Prints out on the user's screen the character length of their quote
		System.out.println("The character length of the phrase you entered is: " + stringSize + " characters" );
		
		//***************************************************************************************
		//Extracts the first word of the user's quote and capitalizes it
		//***************************************************************************************
		
		//Declares an int variable named "i" and takes the index of the user's quote
		int i = quote.indexOf(' ');
		
		//Declares a string variable named "word" based on the "quote" substring and extracts the first word
		//of the user's quote
		String word = quote.substring(0, i);
		
		//Makes the user's first word in their quote upper case
		word = word.toUpperCase();
		
		//Prints out on the user's screen the first word of their quote in upper case
		System.out.println("This is the first word of your quote in upper case: " + word);
		
		//****************************************************************************************
		//Extracts the last word of the user's quote and camel cases it
		//****************************************************************************************
		
		//Declares a string variable named "lastWord" based on the "quote" substring. Then extracts the last word
		//of the user's quote
		String lastWord = quote.substring(quote.lastIndexOf(' '));
		
		//Declares a string variable named "s2", extracts the first character of the last word of the user's quote, 
		//and then upper cases it
		String s2 = lastWord.substring(1,2).toUpperCase();
		
		//Declares a string variable named s3 and assigns the remaining characters of the user's last word in their
		//quote to it
		String s3 = lastWord.substring(2);
		
		//Prints out on the user's screen the capital first character of the last word of their quote as well as 
		//the remaining characters of the user's last word in their quote all in one word. 
		System.out.println("This is the last word of your quote camel cased:" + s2 + s3);
		
				
	    //***************************************************************************************
		//Prints out the first, middle, and last characters of the string
		//***************************************************************************************
		
		//Declares an int variable named "len" and calculates the length of the user's quote once again
		int len = quote.length();
		
		//Declares a char variable named "lastChar" and calculates the last character of the user's quote
		char lastChar = quote.charAt(len - 1);
		
		//Prints out the last character of the user's quote on the user's screen
		System.out.println("This is the last character of your quote: " + lastChar);
		
		//Declares a char variable named "firstChar" and calculates the first character of the user's quote
		char firstChar = quote.charAt(0);
		
		//Prints out the first character of the user's quote on the user's screen
		System.out.println("This is the first character of your quote: " + firstChar);
		
		//Declares an int variable named "midCharacter" and calculates the middle digit of the user's quote
		int midCharacter = quote.length()/2;
		
		//Declares a char variable named "middleCharacter" and converts the "midCharacter" variable's digit into 
		//a character
		char middleCharacter = quote.charAt(midCharacter);
		
		//Prints out on the user's screen the middle character of their quote
		System.out.println("Here is the middle character of your quote: " + middleCharacter);		
		
		//********************************************************************************
		//Replaces all vowels in the user's quote with a "#" and displays it on the screen
		//********************************************************************************
		
		//Replaces all vowels in the user's quote with a "#"
		String quote1 = quote.replaceAll("[aeiouAEIOU]", "#");
		
		//Prints the user's quote on the screen replacing all vowels with a # symbol
		System.out.println("Here is your quote without vowels: " + quote1);
		
		//Closers scanner object since it is no longer needed
		keyboard.close();
		
		}

}
