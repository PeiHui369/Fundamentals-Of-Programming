import java.util.Random;

public class Lab8{
    public static void main (String[] args){
        Number case1 = new Number();
        Number case2 = new Number(5);
        Number case3 = new Number(4,50);
        case1.displayNumbers();
        case2.displayNumbers();
        case3.displayNumbers();

        System.out.println("----RESULT---- ");
        System.out.println("EVEN: ");
        case1.displayEven();
        System.out.println("");
        System.out.println("PRIME: ");
        case1.displayPrime();
        System.out.println("");
        System.out.println("MAX: ");
        case1.displayMax();
        System.out.println("MIN: ");
        case1.displayMin();
        System.out.println("AVERAGE: ");
        case1.displayAvg();
        System.out.println("SQUARES: ");
        case1.displaySquares();
    }
}
class Number{
    int length;
    int[] numbers;                          //#Initialize array without knowing size
    static Random random = new Random();    //static --> Share at all classes

    public Number(){
        generateNumbers(10,100);
    }

    public Number(int length){
        generateNumbers(length,100);
    }

    public Number(int length, int maxInclusive) {
        generateNumbers(length, maxInclusive);
    }

    public void generateNumbers(int length, int maxInclusive){
        this.length = length;
        this.numbers = new int [length];                               //this. refers to current object (instance variable)

        for(int i = 0; i<length; i++){
            this.numbers[i] = random.nextInt(maxInclusive+1);   //UpperBound: maxInclusive + 1
        }
    }

    public void displayNumbers(){
        for(int i = 0; i<this.length; i++){
            System.out.println(this.numbers[i] + " ");
        }
        System.out.println(" ");
    }

    /*Condition + Display*/

    public void displayEven(){
        for(int i = 0; i<this.length; i++){
            if(this.numbers[i]%2 ==0){                          //Even: n%2 == 0
                System.out.print(this.numbers[i] + " ");
            }
        }
    }

    //To check Prime
    public static boolean isPrime(int n){
        if(n<2){return false;}
        for(int i = 2; i<n/2; i++) {                        //Prime: i=2 >> (n%i == 0) false >> i<n/2
            if (n % i == 0) {                               //Prime
                return false;
            }
        }
        return true;
    }

    public void displayPrime(){
        for(int i = 0; i<this.length; i++){
            if(isPrime(this.numbers[i])){
                System.out.print(this.numbers[i] + " ");
            }
        }
    }


    public void displayMax(){
        int max = -1;                                           //MAX = -1
        for(int i = 0; i<this.length; i++){
            if(this.numbers[i]>max){                            //if num > max, max = num
                max = this.numbers[i];
            }
        }
        System.out.println(max);
    }

    public void displayMin(){
        int min = Integer.MAX_VALUE;                            //min = Integer.MAX_VALUE
        for(int i = 0; i < this.length; i++){
            if(this.numbers[i] < min){                          //num<min, min = num
                min = this.numbers[i];            }
        }
        System.out.println(min);
    }

    public void displayAvg(){
        int sum = 0;
        for (int i = 0; i < this.length; i++){
            sum += this.numbers[i];                                //Average: sum+=number >> sum/length
        }
        System.out.println((double)sum/(double)this.length);
    }

    //Check square
    public static boolean isSquare(int n){                         // n<1 false; Math.pow(n, 0.5) * Math.pow(n, 0.5) == n
        if(n<1){return false;}
        double dn = (double)n;
        double dsqrt_n = Math.pow(dn, 0.5);

        int sqrt_n = (int) dsqrt_n;
        return sqrt_n * sqrt_n == n;
    }

    public void displaySquares(){
        for(int i = 0; i < this.length; i++){
            if(isSquare(this.numbers[i])){
                System.out.print(this.numbers[i] + " ");
            }
        }
        System.out.println("");
    }


}
