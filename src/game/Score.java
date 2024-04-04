package game;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class Score{

    private int score;
    private int tries;


    public Score(int maxTries) {
        this.score = 0;
        this.tries = maxTries;
    }


    public void increaseScore() {
        this.score++;
    }


    public void decreaseTries() {
        this.tries--;
    }


    public int getScore() {
        return this.score;
    }


    public int getTriesLeft() {
        return this.tries;
    }


    public boolean hasTriesLeft() {
        if (this.tries > 0) {
        	return true;
        }
    	return false;
    }


    public static Text displayIncorrectGuess() {
        Text incorrectSymbol = new Text("X");
        incorrectSymbol.setFill(Color.RED);
        incorrectSymbol.setFont(Font.font("Arial", 64));
        return incorrectSymbol;
    }
    
    
    
    
    
    
    
    
    
}