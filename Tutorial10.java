//Question 1
public abstract class DiscountPolicy{
	public abstract double computeDiscount(int count, double itemCost);
}

public class BulkDiscount extends DiscountPolicy{
	private int minimum;
	private double discountRate;
	
	public BulkDiscount(int minimum, double discountRate){
		this.minimum = minimum;
		this.discountRate = discountRate;
	}


	@Override
	public double computeDiscount(int count, double itemCost){
		if(count > minimum) 
			return itemCost *discountRate;
		
		return 0;
	}
}

public class OtherDiscount extends DiscountPolicy{
	@Override
	public double computeDiscount(int count, double itemCost){
		if(count > 8) return itemCost * 0.3;
		else if(count >=6) return itemCost * 0.2;
		else if(count >=3) return itemCost * 0.1
		
		return 0;
	}
}

public class combineDiscount extends DiscountPolicy{
	private DiscountPolicy policy1;
	private DiscountPolicy policy2;

	@Override
	public double computeDiscount(int count, double itemCost){
		if(policy1.computeDiscount(count, itemCost)>
			policy2.computeDiscount(count, itemCost))
			return policy1.computeDiscount(count, itemCost);
		else return policy2.computeDiscount(count, itemCost);
	}
}


public class Tester1{
public static void main(String[] args) {
double cost = 34.5;
int cnt = 4;
BulkDiscount a = new BulkDiscount(3,20);
OtherDiscount b = new OtherDiscount();
System.out.println("Item cost: "+cost);
System.out.println("Quantity: "+cnt);
System.out.println("Bulk Discount: "+a.computeDiscount(cnt, cost));
System.out.println("Other Discount: "+b.computeDiscount(cnt, cost));
CombineDiscount c = new CombineDiscount(a,b);
System.out.println("Combine Discount: "+c.computeDiscount(cnt, cost));
}
  }


//Question 2
public interface Interest{
	double computeInterest();
}

public class SavingAccount implements Interest{
	private double balance;
	
	public SavingAccount(double balance){
		this.balance = balance;
	}

	@Override
	public double computeInterest(){
		return balance * 0.005/12;
	}

public void display(){
System.out.println("The Account Balance: "+balance);
System.out.println("This month interest: "+computeInterest());
}

}

public class FixedAccount implements Interest{
	private double balance;

	public FixedAccount(double balance){
		this.balance = balance;
	}

	@Override
	public double computeInterest(){
		return balance * 0.03/12;
	}

	public void display(){
System.out.println("The Account Balance: "+balance);
System.out.println("This month interest: "+computeInterest());
}
}

public class Tester2{
	public static void main(String[] args) {
SavingAccount a = new SavingAccount(1200);
FixedAccount b = new FixedAccount(5000);
a.display();
b.display();
}
}

//Question 3
public class Person implements Comparable {
	private String name;

	public Person(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String toString(){
		return “Name : ” + name;
	}
 
	@Override
	public int compareTo(Person p){
		return name.compareToIgnoreCase(p.getName());
	}
}
public class Tester3{
	public static void main(String [] args){
		Person [] p = new Person[5];
		p[0] = new Person(“Abu”);
		p[1] = new Person("Lim Teng Teng");
p[2] = new Person("Abu Bakar");
p[3] = new Person("Siti Fahtimah");
p[4] = new Person("Mutu");

System.out.println(“List of person: ”);
for(int i = 0; i<p.length; i++)
	System.out.println(p[i]);

for(int i=0; i<p.length; i++){
	if(p[i].compareTo(p[i+1]) > 0){
		temp = p[i];
		p[i] = p[i+1];
		p[i+1] = p[i];	
	}
}

System.out.println(“List of person in ascending order: ”);
for(int i = 0; i<p.length; i++)
	System.out.println(p[i]);
	}
}
