package game;

public class Score implements ScoreCounter{

package game;


import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Score {
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
        return this.tries > 0;
    }


    public Text displayIncorrectGuess() {
        Text incorrectSymbol = new Text("X");
        incorrectSymbol.setFill(Color.RED);
        incorrectSymbol.setFont(Font.font("Arial", 24));
        return incorrectSymbol;
    }
}