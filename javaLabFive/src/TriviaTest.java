/**
* This is my program made to test out the class I just made to ensure it functions properly.
* Part of the assignment includes being able to show the TriviaQuestion object in the debugger with the proper
* values in each object ( see Java Lab Five Instructions, page One, section Two ). 
* When she says "mutate", I think she means that she wants to change the values of each object to a different question /
* set of answers than my original parameters in the first part. The different question / answers are as follows:
* ( "Which 2017 release starred Gal Gadot?", "The Last Jedi", "Wonder Woman", "Blade Runner 2049", "Molly's Game", 2, 10 )
* 
*/



import java.util.Scanner;

public class TriviaTest {

	public static void main(String[] args) {
		//Create an object of the TriviaQuestion class with arguments.
		TriviaQuestion one = new TriviaQuestion("Which 2016 release starred Gal Gadot?", "The Last Yoda", "Batgirl", "Running Man 2049", "Ender's Game", 2, 5);
		
		//Line of code with a break point to check the object in the debugger
				
		//Mutate all fields
		
		//Pose the question
		
		//Print the question, get a correct answer, report the results
		Scanner keyboard = new Scanner(System.in);
		System.out.println(one);
		System.out.println("Please enter the correct answer (2): ");
		int answer = keyboard.nextInt();
		System.out.printf("You scored %d points!", points); 	//Not sure how to get the points to show up in this formatted statement
		
		//Print the question, get an incorrect answer, report the results
		System.out.println(one);
		System.out.println("Please enter an incorrect answer (anything except 2): ");
		int answer = keyboard.nextInt();
		System.out.printf("You scored %d points!", points);
		
		//Attempt to mutate all fields
		
		//Place a line of code with a break point to check object in the debugger
			
		}
	}
