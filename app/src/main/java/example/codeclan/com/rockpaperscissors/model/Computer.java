package example.codeclan.com.rockpaperscissors.model;

import java.util.Random;


/**
 * Created by amymorrison on 24/01/2018.
 */

public class Computer {

    public Move getRandomMove(){
        return Move.values()[new Random().nextInt(Move.values().length)];
    }
}
