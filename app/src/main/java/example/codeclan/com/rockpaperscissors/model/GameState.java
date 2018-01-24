package example.codeclan.com.rockpaperscissors.model;

/**
 * Created by amymorrison on 24/01/2018.
 */

public enum GameState {
    WIN ("You won!"),
    LOSE("You lost!"),
    DRAW ("It was a draw!");

    private final String pretty_print;

    GameState(String result){
        this.pretty_print = result;
    }

    public String toString() {
        return this.pretty_print;
    }
}
