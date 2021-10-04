
/* 1. Write different methods for each module (add, subtract, multiply, and divide).

2. Use switch/case to call the particular method.

3. Take input inside the methods to perform the related operation.

4. Return the answer and display it inside the main method.

5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user

*/

package theDeliverable;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		
		System.out.printf("Hello ,Jeff it is nice to see you\n"); //testing purposes using C's printf function
		
		System.out.printf("Enter following to perform the mathematical operations\n");
		
		System.out.println("1.)Addition\n2.)Subtraction\n3.)Multiply\n4.)Division\n");
		
		System.out.printf("Enter your choice\n");
		
		Scanner userInput = new Scanner(System.in);
		
		int product, sum, remainder, difference;
		
		int choice = userInput.nextInt(); // will be using this to determined the operations that will be performed
		
		System.out.printf("Enter the first interger\n");
		
		int integer_one = userInput.nextInt();
		
		System.out.printf("Enter the second interger\n");
		
		int integer_two = userInput.nextInt();
		
		

		
		// Instead of cascading if else statements practicing with the switch case for better readability and efficiency 
		switch (choice){
			case 1:
				System.out.printf("You chose adddition\n");
				sum =addInt(integer_one, integer_two );
				System.out.printf("Sum: %d",sum);
				break;
				
			case 2:
				System.out.printf("You chose multiplication\n");
				break;
				
				
			default: System.out.printf("Error");
				
	
		}
		
		
		
		
	}
	
	//Will create the function(or method  because we are dealing with Java) to perform addition
	
	public static int addInt( int a, int b){
		
		int sum = a + b;
		
		return sum;
	} 
	
	

}
