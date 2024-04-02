package game;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class AnswerChecker implements ScoreCounter {

		public static void main(String[] args)  {
			Scanner scanner = new Scanner(System.in);
		        ArrayList<Question> cultureQuestions = Question.listOfCultureQuestions();
		        ArrayList<Question> peopleQuestions = Question.listOfPeopleQuestions();
		        ArrayList<Question> animalQuestions = Question.listOfAnimalQuestions();
		        ArrayList<Question> foodQuestions = Question.listOfFoodQuestions();
			Score score = new Score(3);
			
			while (score.hasTriesLeft()) {
				System.out.print("Enter your answer: ");
		        String userInput = scanner.nextLine();
		        
		        if (Question.cultureInputIsCorrect(cultureQuestions, userInput)) {
		            System.out.println("Culture - Right answer");
		            score.increaseScore(); 
		            System.out.println("Score: " + score.getScore());
		            System.out.println("Tries left: " + score.getTriesLeft());
		        } else if (Question.peopleInputIsCorrect(peopleQuestions, userInput)) {
		            System.out.println("People - Right answer");
		            score.increaseScore();    
		            System.out.println("Score: " + score.getScore());
		            System.out.println("Tries left: " + score.getTriesLeft());
		        }else if (Question.animalInputIsCorrect(animalQuestions, userInput)) {
		            System.out.println("Animal - Right answer");
		            score.increaseScore(); 
		            System.out.println("Score: " + score.getScore());
		            System.out.println("Tries left: " + score.getTriesLeft());
		        }else if (Question.foodInputIsCorrect(foodQuestions, userInput)) {
		            System.out.println("Food - Right answer");
		            score.increaseScore(); 
		            System.out.println("Score: " + score.getScore());
		            System.out.println("Tries left: " + score.getTriesLeft());
		        }else {
		            System.out.println("No");
		            System.out.print(Score.displayIncorrectGuess());
		            score.decreaseTries();
		            System.out.println("Tries left: " + score.getTriesLeft());
		            
		        } 
		        if (!score.hasTriesLeft()) {
		    	   System.out.println("Game Over!");
		       }
		        
		    }
	} }
