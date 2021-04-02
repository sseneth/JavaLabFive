import java.io.PrintStream;

public class TriviaQuestion {

	//Fields!
	private int correctAnswer;
	private int points;
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private boolean posed;
	private double score;
	
	//CONSTRUCTOR WITH ARGUMENTS
	/**
	 * Takes arguments for the question, answer1, answer2, answer3,
	 * answer4, correctAnswer, and points fields. Initializes
	 * all fields. posed should be initialized to false -  
	 * It is not a parameter.
	 * @param ques The trivia question being asked
	 * @param a1 The first answer.
	 * @param a2 The second answer.
	 * @param a3 The third answer.
	 * @param a4 The fourth answer.
	 * @param correctAns The correct answer out of the four option.
	 * @param playerPoints The number of points awarded for the correct answer.
	 */
	public TriviaQuestion(String ques, String a1, String a2, String a3, String a4, int correctAns, int playerPoints) {
		question = ques;
		answer1 = a1;
		answer2 = a2;
		answer3 = a3;
		answer4 = a4;
		correctAnswer = correctAns;
		points = playerPoints;		
		
		posed = false;
	}
	
	//CONSTRUCTOR NO ARGUMENTS
	/**
	 * Instantiate the question, answer1, answer2, answer3,
	 * answer4, correctAnswer, and points fields to something bland 
	 * and suitable for testing. As with the full argument constructor,
	 * posed should be initialized to false.
	 * 
	 */
	public TriviaQuestion() {
		question = "What is the first letter of the alphabet?";
		answer1 = "J";
		answer2 = "Z";
		answer3 = "M";
		answer4 = "A";
		correctAnswer = 4;
		points = 10;
		
		posed = false;
		
	}
	
	//getScore ACCESSOR
	/**
	 * Takes an integer parameter representing an answer,
	 * compares it to the correct answer, and 
	 * will return a double score based on whether the
	 * answer is correct. If the question hasn't been posed,
	 * the getScore method should return 0.
	 * Use a simple if /else condition to write this.
	 */
	
	public double getScore(int answer) {
		if (answer == correctAnswer) {
			score = score + points; 
			}
		else {
			score = score + 0;
		}
		return score;
	}
	
	//poseQuestion ACCESSOR
	//TODO: Make sure the string return is accurate, fix formatting
	/**
	 * Sets the posed field to true and returns a String composed
	 * of the question and list of answers, formatted as in the
	 * test cases. 
	 * Use string concatenation (+) and the newline escape sequence (\n)
	 * to construct the String value that is being returned.
	 * 
	 */
	public PrintStream poseQuestion(boolean posed) {
		posed = true;
		return System.out.printf("%s\n%s\n%s\n%s\n%s\n", question, answer1, answer2, answer3, answer4);
				
	}
	//MUTATORS FOR QUESTION, ANSWER1, ANSWER2, ANSWER3, ANSWER4, AND POINTS
	
	
}
