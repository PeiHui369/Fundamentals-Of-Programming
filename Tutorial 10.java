public abstract class DiscountPolicy{   //abstract class
  public abstract double computeDiscount(int a, double b);    //abstract method
}

//Derived a class BulkDiscount from DiscountPolicy
public class BulkDiscount extends DiscountPolicy{
  private int mininmum;
  private double rate;
  
  public BulkDiscount(int m, double r){                       //Constructor
    rate = r;
    minimum = m;
  }
  
  public double computeDiscount(int a, double b){           //method computeDiscount
    if(a>minimum)
      return b*rate/100;
    else
      return 0;
  }
}
    
// Derived a class OtherDiscount from DiscountPolicy
public class OtherDiscount extends DiscountPolicy{            //a = quantity of products; b = discount Rate
  public double computeDiscount(int a, double b){
    if(a>8)
      return 0.3 * b;
    else if(a>5)
      return 0.2 * b;
    else if(a>2)
      return 0.1*b;
    else
      return 0;
  }
}

// Derived a class combineDiscount from DiscountPolicy
public class CombineDiscount extends DiscountPolicy{
  private DiscountPolicy policy1;
  private DiscountPolicy policy2;
  
  public combineDiscount(DiscountPolicy a, DiscountPolicy b){ //constructor
    policy1 = a;
    policy2 = b;
  }
  
  public double computeDiscount(int a, double b){             //method
    if(policy1.computeDiscount(a,b) > policy2.computeDiscount(a,b))
      return policy1.computeDiscount(a,b);
    else
      return policy2.computeDiscount(a,b);
  }
}

//Tester
public static void main(String[] args){
  double cost = 34.5;
  int cnt = 4;
  BulkDiscount a = new BulkDiscount(3,20);
  OtherDiscount b = new OtherDiscount();
  System.out.println("Item Cost: " + cost);
  System.out.println("Quantity: "+ cnt);
  System.out.println("Bulk Discount: " + a.computeDiscount(cnt, cost));
  System.out.println("Other Discount: " + b.computeDiscount(cnt,cost));
  CombineDiscount c = new CombineDiscount(a,b);
  System.out.println("Combine Discount: " + c.computeDiscount(cnt,cost));
}

2.
public interface Internet{
  public double computeInternet();
}

public class SavingAccount implements Internet{
  private double balance;
  public SavingAccount(double a){balance = a;}
  private 
  
  
