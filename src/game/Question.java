package game;
import java.util.ArrayList;
import java.util.List;

public class Question{
	static String question;
    static ArrayList<String> answers;
    Question(String question, ArrayList<String> answers) {
         this.question = question;
         this.answers = answers;
     }
     
//Culture questions
        public static ArrayList<Question> listOfCultureQuestions() {
        	final ArrayList<Question> cultureQuestions = new ArrayList<>(10);
	        cultureQuestions.add(new Question("Sparkling ____", 
	        		new ArrayList<>(List.of("water", "wine", "ice", "crossword clue", "image carwash"))));
	        cultureQuestions.add(new Question("Studio ____", 
					new ArrayList<>(List.of("one", "mcgee", "ghibli", "apartment", "space"))));
			cultureQuestions.add(new Question("The Great ____", 
					new ArrayList<>(List.of("Gatsby", "escape", "depression", "raid", "outdoors"))));
			cultureQuestions.add(new Question("Oh ____", 
					new ArrayList<>(List.of("polly", "brother", "brother, where art thou?", "my baby", "polly dress"))));
			cultureQuestions.add(new Question("Nicer way to say ____", 
					new ArrayList<>(List.of("homeless", "poor", "stupid", "dumb", "no"))));
			cultureQuestions.add(new Question("Who sells the best ____", 
					new ArrayList<>(List.of("gas", "carrot cake near me", "diesel fuel", "car batteries", "quality diesel fuel"))));
			cultureQuestions.add(new Question("How to grow ____", 
					new ArrayList<>(List.of("potaoes", "taller", "garlic", "your hair faster", "strawberries"))));
			cultureQuestions.add(new Question("Poems about ____", 
					new ArrayList<>(List.of("life", "friendship", "depression", "love", "nature"))));
			cultureQuestions.add(new Question("Public schools are ____", 
					new ArrayList<>(List.of("better than private", "funded by", "run by", "failing", "the great equalizer"))));
			cultureQuestions.add(new Question("Pumpkin spice ____", 
					new ArrayList<>(List.of("cake", "latte", "recipe", "creamer", "coffee"))));
			return cultureQuestions;
		    }

        
//People questions
        public static ArrayList<Question> listOfPeopleQuestions() {
        	final ArrayList<Question> peopleQuestions = new ArrayList<>(10);
			peopleQuestions.add(new Question("Does Santa have a ____?", 
					new ArrayList<>(List.of("brother", "dog", "birthday", "phone number", "wife"))));
			peopleQuestions.add(new Question("Who is married to ____?", 
					new ArrayList<>(List.of("Barbara Streisand", "Ben Shapiro", "Nicole Kidman", "Justin Timberlake", "Keith Urban"))));
			peopleQuestions.add(new Question("DWhy do people____?", 
					new ArrayList<>(List.of("snore", "snore", "cheat", "say bless you", "get hiccups"))));
			peopleQuestions.add(new Question("My mom is my ____", 
					new ArrayList<>(List.of("hero", "life", "rock meaning", "rock", "hero because"))));
			peopleQuestions.add(new Question("Why is my son so ____?", 
					new ArrayList<>(List.of("angry", "angry with me", "mean to me", "clingy", "hyper"))));
			peopleQuestions.add(new Question("Ben ____", 
					new ArrayList<>(List.of("Affleck", "Simmons", "Franklin", "and Jerry's", "Stiller"))));
			peopleQuestions.add(new Question("President ____", 
					new ArrayList<>(List.of("Bush", "Clinton", "Obama", "Trump", "Biden"))));
			peopleQuestions.add(new Question("I'm too ____", 
					new ArrayList<>(List.of("sexy", "sexy for my shirt", "sexy lyrics", "drunk to taste this chicken", "good at goodbyes"))));
			peopleQuestions.add(new Question("Why do women wear ____?", 
					new ArrayList<>(List.of("makeup", "bras", "dresses", "waist beads", "heels"))));
			peopleQuestions.add(new Question("I smell ____", 
					new ArrayList<>(List.of("like beef", "pennies", "burnt toast", "gas in my house","pennies meme"))));
		        return peopleQuestions;
		    }
  
//Animal Questions
        public static ArrayList<Question> listOfAnimalQuestions() {
        final ArrayList<Question> animalQuestions = new ArrayList<>(10);
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
        
//Food questions
        public static ArrayList<Question> listOfFoodQuestions() {
        	final ArrayList<Question> foodQuestions = new ArrayList<>(10);
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

     public static boolean cultureInputIsCorrect(ArrayList<Question> cultureQuestions, String userInput) {
        	if (cultureQuestions != null && cultureQuestions.size() > 0) {
                if (cultureQuestions.get(0) != null) { 
                if (userInput.matches("(?i)(water|wine|ice|crossword clue|image carwash)")) {
                    return true; 
                }
                } 
                if (cultureQuestions.get(1) != null) { 
                    if (userInput.matches("(?i)(one|mcgee|ghibli|apartment|space)")) {
                        return true; 
                    }
                }
                if (cultureQuestions.get(2) != null) { 
                    if (userInput.matches("(?i)(Gatsby|escape|depression|raid|outdoors)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(3) != null) { 
                    if (userInput.matches("(?i)(polly|brother|my baby|polly dress)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(4) != null) { 
                    if (userInput.matches("(?i)(homeless|poor|stupid|dumb|no)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(5) != null) { 
                    if (userInput.matches("(?i)(gas|carrot cake|fuel|car batteries)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(6) != null) { 
                    if (userInput.matches("(?i)(taller|potatoes|potato|tall|garlic|hair|strawberries)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(7) != null) { 
                    if (userInput.matches("(?i)(life|friendship|despression|love|nature)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(8) != null) { 
                    if (userInput.matches("(?i)(better than private|funded|failing|run|the great equalizer)")) {
                        return true; 
                    }
                    } 
                if (cultureQuestions.get(9) != null) { 
                    if (userInput.matches("(?i)(cake|latte|recipe|creamer|coffee)")) {
                        return true; 
                    }
                    } 
            }
            return false;
			} 
//People user input correct        
        public static boolean peopleInputIsCorrect(ArrayList<Question> peopleQuestions,String userInput) {
        	if (peopleQuestions != null && peopleQuestions.size() > 0) {
        		if (peopleQuestions.get(0) != null) {
        		if (userInput.matches("(?i)(brother|dog|birthday|phone number|wife)+")){
                	return true;
            	}	
        		}
        		if (peopleQuestions.get(1) != null) {
        		if (userInput.matches("(?i)(barbara streisand|Barbara Streisand|Ben Shapiro|ben shapiro|Nicole Kidman|nicole kidman|Justin Timberlake|justin timberlake|Keith Urban|keith urban)")){
                	return true;
            	}
        		}
        		if (peopleQuestions.get(2) != null) {
            	if (userInput.matches("(?i)(snore|yearn|cheat|say bless you|bless you|get hiccups|hiccup)+")){
                	return true;
            	}
        		}
        		if (peopleQuestions.get(3) != null) {
            	if (userInput.matches("(?i)(hero|life|rock)")){
                	return true;
            	}
        		}
        		if (peopleQuestions.get(4) != null) {
            	if (userInput.matches("(?i)(angry|mean|clingy|hyper)")){
                	return true;
            	}
        		}
            	if (peopleQuestions.get(5) != null) {
            	if (userInput.matches("(?i)(Simmons|simmons|Affleck|affleck|franklin|Franklin|and Jerry's|and jerrys|and jerry's|Stiller|stiller)")){
                	return true;
            	}
            	}
            	if (peopleQuestions.get(6) != null) {
            	if (userInput.matches("(?i)(bush|Bush|Clinton|clinton|Obama|obama|Trump|trump|Biden|biden)")){
                	return true;
            	}
            	}
            	if (peopleQuestions.get(7) != null) {
            	if (userInput.matches("(?i)(sexy|drunk to taste this chicken|good at goodbyes)")){
                	return true;
            	}
            	}
            	if (peopleQuestions.get(8) != null) {
            	if (userInput.matches("(?i)(makeup|make up|bras|dresses|waistbeads|waist beads| heels)")){
                	return true;
            	}
            	}
            	if (peopleQuestions.get(9) != null) {
            	if (userInput.matches("(?i)(like beef|pennies|burnt toast|gas|toast)")){
                	return true;
            	}
        	}
        	}
            	return false;
        }
//Animal user input correct
        public static boolean animalInputIsCorrect(ArrayList<Question> animalQuestions,String userInput) {
        	if (animalQuestions != null && animalQuestions.size() > 0) {
        		if (animalQuestions.get(0) != null) {
        		if (userInput.matches("(?i)(fart|dream|see color|see colors|have night vision|cry)+")){
            	return true;
        	}
        		}
        		if (animalQuestions.get(1) != null) {
        		if (userInput.matches("(?i)(sleep|get thirsty|drink water|stop swimming|have feelings)")){
            	return true;
        	}
        		}
        		if (animalQuestions.get(2) != null) {
        	if (userInput.matches("(?i)(depressed|hungry|bored|overweight|happy)+")){
            	return true;
        	}
        		}
        	if (animalQuestions.get(3) != null) {
        	if (userInput.matches("(?i)(service dog|fox|badge|deer|bird)")){
            	return true;
        	}
        	}
        	if (animalQuestions.get(4) != null) {
        	if (userInput.matches("(?i)(shoes|homework|clothes|edible|medicine)")){
            	return true;
        	}
        	}
        	if (animalQuestions.get(5) != null) {
        	if (userInput.matches("(?i)(noses wet|loyal|scared of fireworks|better than cats|so cute)")){
            	return true;
        	}
        	}
        	if (animalQuestions.get(6) != null) {
        	if (userInput.matches("(?i)(sick|pregnant|happy|molting|choking)")){
            	return true;
        	}
        	}
        	if (animalQuestions.get(7) != null) {
        	if (userInput.matches("(?i)(lions|anacondas|monkeys|stray cats|bears)")){
            	return true;
        	}
        	}
        	if (animalQuestions.get(8) != null) {
        	if (userInput.matches("(?i)(hunt|bark|howl|eat plants|live near me)")){
            	return true;
        	}
        	}
        	if (animalQuestions.get(9) != null) {
        	if (userInput.matches("(?i)(slither|breathe|bones|eat rabbits)")){
            	return true;
        	}
                	}	
            }
            	return false;
        }
//Food user input correct
       public static boolean foodInputIsCorrect(ArrayList<Question> foodQuestions,String userInput) {
        if (foodQuestions != null && foodQuestions.size() > 0) {
        	if (foodQuestions.get(0) != null) {
        	if (userInput.matches("(?i)(chip|cookie|milk|cookie recipe|ice cream)+")){
            	return true;
        	}
        	}	
        	if (foodQuestions.get(1) != null) {
        	if (userInput.matches("(?i)(food|mayo|ramen|noodles|chicken)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(2) != null) {
        	if (userInput.matches("(?i)(wear hats|say all day|shallots|have tattoos|like cooking)+")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(3) != null) {
        	if (userInput.matches("(?i)(salt|throw up|sugar|today|garlic)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(4) != null) {
        	if (userInput.matches("(?i)(cilantro|dragon fruit|dragonfruit|beer|water|vegetables)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(5) != null) {
        	if (userInput.matches("(?i)(spoiled milk|expired milk|antibiotics|too much water|blood)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(6) != null) {
        	if (userInput.matches("(?i)(chicken|turkey|pig|garlic|potato)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(7) != null) {
        	if (userInput.matches("(?i)(egg|meat|salmon|mushroom|beef)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(8) != null) {
        	if (userInput.matches("(?i)(asparagus|meatloaf|pork|cake|cookies)")){
            	return true;
        	}
        	}
        	if (foodQuestions.get(9) != null) {
        	if (userInput.matches("(?i)(watermelon|cantaloupe|mango|peach|avacado)")){
            	return true;
        	}
        	}
            }
            	return false;
        }        
}


