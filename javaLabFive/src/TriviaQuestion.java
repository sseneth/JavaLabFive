import java.io.PrintStream;

public class TriviaQuestion {
/**
*This class creates a TriviaQuestion to be used with the TriviaQuiz class
* @author Kendra
* @date 4/10/2021
*/
	
	
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
         */
        public double getScore(int answer) {
	
            if (posed == false){
		score = 0;
	    } else if (posed && answer == correctAnswer){
                score = points;
	    } else {
                score = 0;
            }
	
	    System.out.printf("You scored %.02f points!\n", score);
            return score;
        }

        //poseQuestion ACCESSOR

        /**
         * Sets the posed field to true and returns a String composed
         * of the question and list of answers, formatted as in the
         * test cases.
         */
        public String poseQuestion() {
            posed = true;

            return question + "\n" + answer1 + "\n" + answer2 + "\n" + answer3 + "\n" + answer4;
        }
	
	//MUTATORS FOR QUESTION, ANSWER1, ANSWER2, ANSWER3, ANSWER4, AND POINTS
	
        /**
	* A mutator for the Question object.
	* @param ques The question being asked.
	*/
	public void setQuestion(String ques) {
		if (posed == true) {
			question = ques;
		}
	}
	
        /**
	* A mutator for the First Answer object.
	* @param a1 The first answer.
	*/
	public void setAnswerOne (String a1) {
		if (posed != true) {
			answer1 = a1;
		}
	}
	/**
	* A mutator for the Second Answer object.
	* @param a2 The second answer.
	*/
	public void setAnswerTwo (String a2) {
		if (posed != true) {
			answer2 = a2;
		}
	}
	    /**
	* A mutator for the Third Answer object.
	* @param a3 The third answer.
	*/
	public void setAnswerThree (String a3) {
		if (posed != true) {
			answer3 = a3;
		}
	}
	/**
	* A mutator for the Fourth Answer object.
	* @param a4 The fourth answer.
	*/
	public void setAnswerFour (String a4) {
		if (posed != true) {
			answer4 = a4;
		}
	}
	/**
	* A mutator for the points object.
	* @param playerPoints The points awarded for a correct answer.
	*/
	public void setPoints (int playerPoints) {
		if (posed != true) {
			points = playerPoints;
		}
	}
}
