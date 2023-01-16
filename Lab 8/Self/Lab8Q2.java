public class Lab8{
    public static void main (String[] args){
        BankAccount acc = new BankAccount("Yayoi","012345-10-9999","MALAYSIA123",100);
        System.out.println("----OPERATION----");
        System.out.println("Showing details... ");
        acc.displayBalance();
        System.out.println("After Deposit ");
        acc.toDeposit(1000);
        acc.displayBalance();
        System.out.println("After Withdraw");
        acc.toWithdraw(1);
        acc.displayBalance();
        //always use acc.displayBalance() to show the changes in balance after deposit/withdraw
    }
}

class BankAccount{
    String name, IC, passportNumber;
    int balance_inCents; //#balance in int

    /*Constructor*/ //Information for open acc: name, IC, passportNumber, balance
    public BankAccount(String name, String IC, String passportNumber, int balance_inCents){
        this.name = name;
        this.IC = IC;
        this.passportNumber = passportNumber;
        this.balance_inCents = balance_inCents;
    }

    //Display Balance: Name (IC) [PassportNumber]
    //                 Balance: $xx.xx (/100 convert before ".", %100 convert after "."
    public void displayBalance(){
        System.out.printf("%s (%s) [%s] \n Balance(cents): %d\n ", this.name,this.IC,this.passportNumber,this.balance_inCents);
    }

    public void toDeposit(int amount_inCents){
        this.balance_inCents += amount_inCents;
    }

    public void toWithdraw(int amount_inCents){
        if(amount_inCents > this.balance_inCents){
            System.out.println("Insufficient balance.");
        }else{
            this.balance_inCents -=amount_inCents;
        }
    }
}
