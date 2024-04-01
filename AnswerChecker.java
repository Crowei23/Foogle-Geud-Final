package stellaPackage;
import java.util.ArrayList;
import java.util.Scanner;
public class AnswerChecker {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your answer: ");
	        String userInput = scanner.nextLine();
	        scanner.close();
	        Score score = new Score();
	       
	        ArrayList<Question> cultureQuestions = Question.listOfCultureQuestions();
	        ArrayList<Question> peopleQuestions = Question.listOfPeopleQuestions();
	        ArrayList<Question> animalQuestions = Question.listOfAnimalQuestions();
	        ArrayList<Question> foodQuestions = Question.listOfFoodQuestions();
	    
	        if (Question.cultureInputIsCorrect(cultureQuestions, userInput)) {
	            System.out.println("Culture - Right answer");
	            score.increaseScore(); 
	            System.out.println("Score: " + score.getScore());
	        }
	       if (Question.peopleInputIsCorrect(peopleQuestions, userInput)) {
	            System.out.println("People - Right answer");
	            score.increaseScore();    
	            System.out.println("Score: " + score.getScore());
	        }
	       if (Question.animalInputIsCorrect(animalQuestions, userInput)) {
	            System.out.println("Animal - Right answer");
	            score.increaseScore(); 
	            System.out.println("Score: " + score.getScore());
	        }
	       if (Question.foodInputIsCorrect(foodQuestions, userInput)) {
	            System.out.println("Food - Right answer");
	            score.increaseScore(); 
	            System.out.println("Score: " + score.getScore());
	        }
	       ArrayList<Question> cultureQuestions1 = Question.listOfCultureQuestions();
	        if (Question.cultureInputIsCorrect(cultureQuestions1, userInput.toLowerCase())) {
	            System.out.println("Yes");
	            score.increaseScore();    
	            System.out.println("Score: " + score.getScore());
	            return;
	        } else {
	            System.out.println("No");
	            
	        }
	        
	        ArrayList<Question> foodQuestions1 = Question.listOfFoodQuestions();
	        if (Question.foodInputIsCorrect(foodQuestions1, userInput.toLowerCase())) {
	            System.out.println("Yes");
	            score.increaseScore();    
	            System.out.println("Score: " + score.getScore());
	            return;
	        } else {
	            System.out.println("No");
	        }
	    }
	}
