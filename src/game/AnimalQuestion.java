package game;

import java.util.ArrayList;
import java.util.List;

public class AnimalQuestion extends ArrayList<Question>{
	 
	public AnimalQuestion(String question, ArrayList<String> answers) {
	        add(new Question(question, answers));
	    }
    public static AnimalQuestion defineAnimalQuestions() {
        AnimalQuestion animalQuestions = new AnimalQuestion("", new ArrayList<>());
        animalQuestions.add(new Question("Do cats ____?", 
				new ArrayList<>(List.of("fart", "dream", "cry", "have night vision", "see colors"))));
		animalQuestions.add(new Question("Do fish ever ____?", 
				new ArrayList<>(List.of("sleep", "get thirsty", "drink water", "stop swimming", "have feelings"))));
		animalQuestions.add(new Question("Is my cat ____?", 
				new ArrayList<>(List.of("depressed", "hungry", "bored", "overweight", "happy"))));
		animalQuestions.add(new Question("Can you pet a ____?", 
				new ArrayList<>(List.of("service dog", "fox", "badger", "baby deer", "bird"))));
		animalQuestions.add(new Question("My dog ate my ____", 
				new ArrayList<>(List.of("shoes", "homework", "clothes", "edible", "medicine"))));
		animalQuestions.add(new Question("Why are dogs ____?", 
				new ArrayList<>(List.of("noses wet", "loyal", "scared of fireworks", "better than cats", "so cute"))));
		animalQuestions.add(new Question("Is my bird ____?", 
				new ArrayList<>(List.of("sick", "pregnant", "happy", "molting", "choking"))));
		animalQuestions.add(new Question("Where do ____ live?", 
				new ArrayList<>(List.of("lions", "anacondas", "mokeys", "stray cats", "bears"))));
		animalQuestions.add(new Question("Do wolves ____?", 
				new ArrayList<>(List.of("hunt in packs", "bark", "howl", "eat plants", "live near me"))));
		animalQuestions.add(new Question("Do snakes ____?", 
				new ArrayList<>(List.of("slither", "breathe through their nose", "have bones", "have ears", "eat rabbits"))));
	return animalQuestions;
    }
}
