public class Main{
    public static void main(String[] args) throws Exception {
        Fraction fraction = new Fraction(100,400); //Create object from another class, Give parameters according to constructors
        System.out.println(fraction.getNumerator()+"/"+fraction.getDenominator());
        System.out.println(fraction);
        fraction.setDenominator(200);
        System.out.println(fraction);
        fraction.lowest_term();

    }
}

/*Define class Fraction*/
class Fraction{

    //Instance variable; access modifier of var: private [QTA]
    private int numerator,denominator;

    /*Input method that accepts value from user*/
    public Fraction (int numerator, int denominator) throws Exception {
        if(denominator == 0){
            throw new Exception("Denominator cannot be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /*Accessor(Get) & Mutator(Set) Method*/
    public int getNumerator(){ //remember return type: int
        return this.numerator;
    }

    public int getDenominator(){    //with parameters or not: method(){}
        return this.denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    /*Display Fraction reduced to lowest term*/
    private int gcd(int a, int b){
        if(b==0){return a;}
        else{return gcd(b,a%b);}
    }

    public void lowest_term(){
        int common_gcd = gcd(this.numerator, this.denominator);
        System.out.printf("%d/%d",(this.numerator/common_gcd),(this.denominator/common_gcd));
    }

    @Override
    public String toString(){ //For the get method
        return String.format("%d/%d",this.numerator, this.denominator);
    }
}
