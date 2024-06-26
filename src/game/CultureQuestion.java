package game;
import java.util.ArrayList;
import java.util.List;

public class CultureQuestion extends ArrayList<Question> {
    // Constructor
    public CultureQuestion(String question, ArrayList<String> answers) {
        add(new Question(question, answers));
    }
    
    // Define culture questions
    public static CultureQuestion defineCultureQuestions() {
        CultureQuestion cultureQuestions = new CultureQuestion("", new ArrayList<>());
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
                new ArrayList<>(List.of("potatoes", "taller", "garlic", "your hair faster", "strawberries"))));
        cultureQuestions.add(new Question("Poems about ____",
                new ArrayList<>(List.of("life", "friendship", "depression", "love", "nature"))));
        cultureQuestions.add(new Question("Public schools are ____",
                new ArrayList<>(List.of("better than private", "funded by", "run by", "failing", "the great equalizer"))));
        cultureQuestions.add(new Question("Pumpkin spice ____",
                new ArrayList<>(List.of("cake", "latte", "recipe", "creamer", "coffee"))));
        return cultureQuestions;
    }
}