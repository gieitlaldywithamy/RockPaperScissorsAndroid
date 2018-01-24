package example.codeclan.com.rockpaperscissors.model;


/**
 * Created by admin on 24/01/2018.
 */

public class RockPaperScissors{

    private Computer computer;
    private Move playerMove;
    private int playerWinCount;


    public RockPaperScissors() {
        this.computer = new Computer();
        this.playerWinCount = 0;
    }


    public String playRound(Move userMove){
        Move computerMove = computer.getRandomMove();
        this.playerMove = userMove;
        GameState round = compare(userMove, computerMove);
        String userResult = "You played: " + userMove.toString() + ".\nComputer played " + computerMove.toString()+ "\n" + round.toString();
        return userResult;
    }

    private GameState compare(Move userMove, Move computerMove) {


        if (userMove.equals(computerMove)){
            return GameState.DRAW;
        }
        else if (userMove.beats(computerMove)){
            this.playerWinCount++;
            return GameState.WIN;

        } else {
            return GameState.LOSE;
        }

    }


    public String getWinCount() {
        return Integer.toString(this.playerWinCount);
    }
}
