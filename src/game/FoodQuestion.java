package game;

import java.util.ArrayList;
import java.util.List;

public class FoodQuestion extends ArrayList<Question>{
	  public FoodQuestion(String question, ArrayList<String> answers) {
	        add(new Question(question, answers));
	    }
	    public static FoodQuestion defineFoodQuestions() {
	        FoodQuestion foodQuestions = new FoodQuestion("", new ArrayList<>());
	        foodQuestions.add(new Question("Chocolate ____", 
					new ArrayList<>(List.of("chip cookies", "chip cookies recipe", "cake", "ice cream near me", "milk"))));
			foodQuestions.add(new Question("Spicy ____", 
					new ArrayList<>(List.of("food", "mayo", "ramen", "noodles", "chicken"))));
			foodQuestions.add(new Question("Why do chefs ____?", 
					new ArrayList<>(List.of("wear hats", "say all day", "use shallots instead of onions", "have tattoos", "like cooking"))));
			foodQuestions.add(new Question("I ate too much ____", 
					new ArrayList<>(List.of("salt", "and I need to throw up", "sugar", "today", "garlic"))));
			foodQuestions.add(new Question("Taste of ____", 
					new ArrayList<>(List.of("cilantro", "dragon fruit", "beef", "water", "vegetables"))));
			foodQuestions.add(new Question("What happens if I drink ____?", 
					new ArrayList<>(List.of("spoiled milk", "antibiotics", "blood", "expired milk", "too much water"))));
			foodQuestions.add(new Question("How to roast a ____", 
					new ArrayList<>(List.of("chicken", "turkey", "pig", "potato", "head of garlic"))));
			foodQuestions.add(new Question("Is it safe to eat raw ____?", 
					new ArrayList<>(List.of("egg", "meat", "mushrooms", "salmon", "beef"))));
			foodQuestions.add(new Question("Best recipe for ____", 
					new ArrayList<>(List.of("asparagus", "meatloaf", "pork chops", "birthday cake", "cookies"))));
			foodQuestions.add(new Question("How to choose a ripe ____", 
					new ArrayList<>(List.of("watermelon", "cantaloupe", "mango", "peach", "avocado"))));
			return foodQuestions;
	    }
}