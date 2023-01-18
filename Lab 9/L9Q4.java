import java.util.Random;

/*Create a dice game*/
class DiceGame{
    private Player player1, player2;
    private int round;

    public DiceGame(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.round = 1;
    }

    public void start(){
        this.round = 1;
        while(!isWin(player1) && !isWin(player2)){
            System.out.println("Round " + round);
            player1.roll();
            if(isWin(player1)){
                System.out.println(player1.getName() + " wins ");
                break;
            }
            player2.roll();
            if(isWin(player2)){
                System.out.println(player2.getName() + " wins ");
                break;
            }
            System.out.println();
            round++;
        }
    }

    private boolean isWin (Player player){
        return player.getScore() >= 100;
    }
}

/*2 Dice Game*/
abstract class Player{
    protected int score = 0;
    protected String name;

    public Player(){
        name = "NO NAME";
    }

    public Player(String a){
        name = a;
    }

    public void display(){
        System.out.println("The score for "+ name + " is " + score);
    }

    public int getScore(){
        return score;
    }

    public void setScore (int score){
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void roll();

}

//First dice game
class PlayerGame1 extends Player {
    private int dice1, dice2;
    private Random rnd = new Random();

    public PlayerGame1(String a) {
        super(a);
    }

    public void roll() {
        this.dice1 = 0;
        this.dice2 = 0;

        //Allows player roll 2 dices each time
        do {
            this.dice1 = this.rnd.nextInt(6) + 1;
            //player score each time they roll dices
            this.score += this.dice1;
            this.dice2 = this.rnd.nextInt(6) + 1;
            this.score += this.dice2;
            System.out.println(this.getName() + " rolls " + this.dice1 + " and " + this.dice2);
            this.display();
            //if both dice equal, roll again
        } while (this.dice1 == this.dice2);
    }
}//player reaches 100points or more wins

//Second dice game
class PlayerGame2 extends Player {
    private int dice1;
    private Random rnd = new Random();

    public PlayerGame2(String a) {
        super(a);
    }

    public void roll() {
            //Roll 1 dice each time
            this.dice1 = rnd.nextInt(6) + 1;
            this.score += this.dice1;

            /*
            Current Score = 98
            dice1 = 3
            score + 3 = 101
             */
            System.out.println(this.getName() + " rolls " + this.dice1);

            //Score more than 100 not  count
            if (this.score > 100) {
                this.score -= this.dice1;
            }

            /*Current score = 98 */
            this.display();

            //When dice is 6, can roll one more time
            if (this.dice1 == 6) {
                this.dice1 = rnd.nextInt(6) + 1;
                System.out.println(this.getName() + " rolls " + this.dice1);

                if (this.dice1 != 6) {
                    this.score += this.dice1;
                    //score more than 100 not count
                    if (this.score > 100) {
                        this.score -= this.dice1;
                    }
                    this.display();
                } else {
                    //roll 6 again not count
                }
            }
        }
    }

    public class Lab9{
        public static void main (String[] args){
            PlayerGame1 player1 = new PlayerGame1("p1");
            PlayerGame1 player2 = new PlayerGame1("p2");

            System.out.println("Dice Game 1");
            DiceGame game1 = new DiceGame(player1,player2);
            game1.start();
            System.out.println("\n\n");

            PlayerGame2 player3 = new PlayerGame2("p3");
            PlayerGame2 player4 = new PlayerGame2("p4");
            DiceGame game2 = new DiceGame(player3,player4);
            game2.start();
        }
    }

