public class Main{
    public static void main(String[] args)throws Exception{
        money money1 = new money(10,11);
        money money2 = new money(10,13);
        money money3 = new money(10,18);

        System.out.println(money1);
        System.out.println(money2);
        System.out.println(money3);

        money n1 = new money (10,80);
        money n2 = new money (14,11);
        n1.addition(n2);
        System.out.println(n1);
        n1.subtraction(n2);
        System.out.println(n1);
    }
}

class money{

    /* instance variable, access modifier = none */
    int cents;

    public money(int cents){
        this.cents = cents;
        this.round();
    }

    //Convert ringgit to cents
    public money(int ringgit, int cents){
        this.cents = ringgit * 100 + cents;
        this.round();
    }

    private void round(){
        int base = (this.cents/5)*5;
        int remainder = this.cents % 5;
        this.cents = base;
        if(remainder >= 3){
            this.cents += 5;
        }
    }
    @Override
    public String toString(){
        return String.format("RM%d.%02d", this.cents/100, this.cents%100);
    }

    public void subtraction(money other) {
        this.cents = this.cents - other.cents;
    }

    public void addition(money other) {
        this.cents = this.cents + other.cents;
    }
}
