package example.codeclan.com.rockpaperscissors.model;

/**
 * Created by admin on 24/01/2018.
 */

public enum Move {
    ROCK("Rock") {
        @Override
        public boolean beats(Move other){
            return other ==  Move.SCISSORS;

        }
    },
    PAPER("Paper") {
        @Override
        public boolean beats(Move other){
            return other ==  Move.ROCK;

        }
    },
    SCISSORS("Scissors") {
        @Override
        public boolean beats(Move other){
            return other ==  Move.PAPER;

        }
    };

    private final String pretty_print;

    Move(String result){
        this.pretty_print = result;
    }

    public String toString() {
        return this.pretty_print;
    }

    public boolean beats(Move other){
        return false;
    }


}
