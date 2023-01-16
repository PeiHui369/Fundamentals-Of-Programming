import java.util.Random;

public class Main{
    public static void main(String[] args){
        Game game = new Game("Ali","Bob");
        game.play(); //As play method accessed all other methods for the game, we only need to call it
    }
}

/*Define class Game*/
class Game{

    /*Instance variable*/
    //Access modifier: none
    String player1Name, player2Name;
    int player1Score, player2Score;

    //Access modifier: static
    static Random random = new Random();


    /*Constructor accept player name */
    public Game(String player1Name, String player2Name){ //without void & return type
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public void play(){
        for(int i =0; i<202; i++){
            int roll = this.rollDice();
            if(i%2 != 0){//ODD: Player1 Turns
                this.player1Score += roll;
                System.out.printf("%s rolled %d\n", this.player1Name, roll);
            }else{ //EVEN: Player2 Turns
                this.player2Score += roll;
                System.out.printf("%s rolled %d\n", this.player2Name, roll);
            }
            System.out.printf("Current Score - %s:%d %s:%d\n\n", this.player1Name, this.player1Score, this.player2Name, this.player2Score);
            if(endGame()){
                break;
            }
        }
    }
    /*Method move that roll dice*/
    private int rollDice(){ //access modifier:
        return this.random.nextInt(6) + 1; //start from 1, count up 6 until 7 exclusive
    }

    private boolean endGame(){
        boolean player1Win = this.player1Score >= 100;
        boolean player2Win = this.player2Score >= 100;

        if (player1Win) {
            System.out.printf("%s has won!", this.player1Name);
        }
        if (player2Win) {
            System.out.printf("%s has won!", this.player2Name);
        }

        return player1Win || player2Win;
    }

}

//Use this. to access methods (use methods in other method)
// Use this. to access variables (use variables in other method)
