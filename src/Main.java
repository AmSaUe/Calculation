
/*7. Now also create methods for subtraction, multiplication and division in the Calculation class.


8. Try the methods 

9. Now change the main method and ask the user after reading in the numbers what

kind of calculation she wants to perform and then make a call to the right method

with the numbers and present the results.

Hint: You can here use a if else statement or a switch statement.
*/
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {

		/* Declare and creates a Scanner object with a reference name keyboard
		  System.in is used to say that we want a Scanner that reads from the keyboard/console. */
		Scanner keyboard = new Scanner(System.in); //Starts Scanner 
		boolean loop = true;
		
		while (loop){
				System.out.print("Write a number:");// ask the user to type a number on the console screen
				int numb1 = keyboard.nextInt();//
		
				System.out.print("Write one more number:");// ask the user to type a number on the console screen													
				int numb2 = keyboard.nextInt();
		
				System.out.println(
						"Choose how you want me to calculate the numbers. Press 1 = addition, 2 = subtraction, 3 = multiplication and  4 = division.");
				int calculationType = keyboard.nextInt();// Defines the switch method parameter calculationType
															
		
		Calculation myCalculation = new Calculation();// Creates an object of a class named Calculation (it's on file "Calulation.java"
					
	
			switch (calculationType) {
				case 1:
					System.out.println("The sum of those two numbers is:" + myCalculation.add(numb1, numb2));// Returns  the sum of the two numbers on the screen															//
					break;		
				case 2:
					System.out.println("The subtraction of those two numbers is:" + myCalculation.sub(numb1, numb2));// Returns  the subtraction of the two numbers on the screen	
					break;		
				case 3:
					System.out.println("The multiplication of those two numbers is:" + myCalculation.mult(numb1, numb2));// Returns  the multiplication of the two numbers on the screen	
					break;		
				case 4:
					System.out.println("The division of those two numbers is:" + myCalculation.div(numb1, numb2));// Returns  the division of the two numbers on the screen	
					break;		
			}
		
			keyboard.nextLine();// Enables the program to print a String (in this case a "y" after writing a Integer 
			System.out.println("Would you like to preform another calculation? Press y = Yes or n = No");// ask the user to type a number on the console screen
			System.out.println("Would you like to preform another calculation? Press y = Yes or n = No");
			System.out.println("Would you like to preform another calculation? Press y = Yes or n = No");
			String userAnswer = keyboard.nextLine();	// Prints the users choice on the screen;
			
			if (userAnswer.equals("y")){// if the user chooses Yes "y" then the program runs again from the start "How many stars do you want to print? "
			
			}
			
			else {// if the users chooses No "n" than the program is over
				
				loop = false;//When the condition becomes false, execution continues with the statements that appear after the loop.
				System.out.println("Hope you had fun with this program! See you soon!");// prints as many stars as asked for user
			}
		}
		
		keyboard.close();// keyboard Scanner closes
	}
}
