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
		TriviaQuestion one = new TriviaQuestion("\nWhich 2016 release starred Gal Gadot?", "1) The Last Yoda", "2) Batgirl", "3) Running Man 2049", "4) Ender's Game", 2, 5);
				
		//Mutate all fields
		one.setQuestion("\nWhich 2017 release starred Gal Gadot?");
		one.setAnswerOne("1) The Last Jedi");
		one.setAnswerTwo("2) Wonder Woman");
		one.setAnswerThree("3) Blade Runner 2049");
		one.setAnswerFour("4) Molly's Game");
		one.setPoints(10);
		
		//Print the question, get a correct answer, report the results
		Scanner keyboard = new Scanner(System.in);
		System.out.println(one.poseQuestion());
		System.out.println("\nPlease enter the correct answer (2): ");
		int correctAnswer = keyboard.nextInt();
		one.getScore(correctAnswer);
				
		//Print the question, get an incorrect answer, report the results
		System.out.println(one.poseQuestion());
		System.out.println("\nPlease enter an incorrect answer (anything except 2): ");
		int incorrectAnswer = keyboard.nextInt();
		one.getScore(incorrectAnswer);
					
		//Place a line of code with a break point to check object in the debugger
			
		}
	}
