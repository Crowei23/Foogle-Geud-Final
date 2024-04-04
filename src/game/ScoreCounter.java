package game;
import javafx.scene.text.Text;
public interface ScoreCounter {
	    void increaseScore();

	    void decreaseTries();

	    int getScore();

	    int getTriesLeft();

	    boolean hasTriesLeft();

	    Text displayIncorrectGuess();
	}

