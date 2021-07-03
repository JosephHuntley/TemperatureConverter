/**
 * 
 */
package com.joe.tempertureConverter;

import java.util.Scanner;

/**
 * @author joe
 *
 */
public class Converter {
	/**
	 * @param args
	 */
	  public static void main(String[] args){
		
		  boolean quit = false;
		  
		  do {
			  //*Instantiates a scanner object to allow for user input
			  Scanner sc = new Scanner(System.in);
			  
			  //*Asks the user to choose either celsius of fahrenheit.
			  System.out.print("Would you like to covert to Celsius or Fahrenheit? ");
			  String input = sc.nextLine().toLowerCase();
		  
			  if(input.equals("fahrenheit")) {
				  System.out.print("What is the degrees in celsius? ");
				  double c = sc.nextDouble();
				  double f = Convert.toFahrenheit(c);
				  System.out.printf("Celsius: %.1f\nFahrenheit: %.1f\n", c,f );
			  }

			  else if (input.equals("celsius")) {
				 System.out.print("What is the degrees in Fahrenheit? ");
				 double f = sc.nextDouble();
				 double c = Convert.toCelsius(f);
				 System.out.printf("Fahrenheit: %.1f\nCelsius: %.1f\n", f,c);
			  }

			  else if (input.equals("quit")) {
				  /*Prints out a message that the program is quitting and sets
				  the value of quit to true so that the while loop will know
				  to end*/
				  System.out.println("System is quiting.........");
				  quit = true;
				  /*Closes the scanner instance so that is doesn't continue 
				  using resources*/
				  sc.close();
			  }

			  else {
				  System.out.println("That is not a valid option!");
			  }

		  
		  }
		  while(quit == false);
		  
		  
	 
	  }
	 
	}