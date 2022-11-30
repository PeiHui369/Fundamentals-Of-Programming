import java.util.ArrayList;

public class L5Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNum = new ArrayList<Integer>(10);

        for( int i = 0; i < 10; i++ ){
            int integer = (int) (Math.random()*21);

            while(randomNum.contains(integer)){
                integer = (int) (Math.random() * 21);
            }

            System.out.print(integer);
            System.out.print(i==9? "":",");
            randomNum.add(integer);
        }
    }
}

//Better not to use libraries e.g. randomNum.contains(integer)
