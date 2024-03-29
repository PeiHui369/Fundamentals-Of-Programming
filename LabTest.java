class Delivery{
    public String sender;
    public String recipient;
    public double weight_of_package_kg;

    public Delivery(String sender, String recipient, double weight_of_package_kg){
        this.sender = sender;
        this.recipient = recipient;
        this.weight_of_package_kg = weight_of_package_kg;
    }

    public double totalCost(){
        double kg = this.weight_of_package_kg;
        if(this.weight_of_package_kg < 5){ return this.weight_of_package_kg *2.8;}
        if(this.weight_of_package_kg > 5 && this.weight_of_package_kg<=20){
            return (5*2.8) + ((this.weight_of_package_kg - 5)*5.20);
        }else if(this.weight_of_package_kg >20 && this.weight_of_package_kg <=50){
            return (5*2.8) + (15*5.2) + ((this.weight_of_package_kg-5-15) * 7.00);
        }else if(this.weight_of_package_kg>50) {
            return (5*2.8)+(15*5.2)+(30*7.0)+((this.weight_of_package_kg-5-15-30)*8.6);
        }
        return 0;
    }

    public String toString(){
        return String.format("From: %s To: %s\nWeight of package: %.1fkg\nShipping Cost: RM %.2f\n", this.sender, this.recipient, this.weight_of_package_kg,this.totalCost());
    }
}

class SpecialDelivery extends Delivery{
    boolean weekendDelivery;
    boolean nightTimeDelivery;


    public SpecialDelivery(String sender, String recipient, double weight_of_package_kg,boolean weekendDelivery, boolean nightTimeDelivery) {
        super(sender, recipient, weight_of_package_kg);
        this.weekendDelivery = weekendDelivery;
        this.nightTimeDelivery = nightTimeDelivery;
    }



    public double totalCost(){
        if(this.weekendDelivery & this.nightTimeDelivery){return (super.totalCost() + 50.00) * 1.20;}
        else if(this.weekendDelivery){ return super.totalCost() + 50.00;}
        else if(this.nightTimeDelivery){return super.totalCost() * 1.2;}
        return 0;
    }

    @Override
    public String toString(){
        return String.format("From: %s To: %s\nWeight of package: %.1fkg\nShipping Cost: RM %.2f\n%s\n%s", this.sender, this.recipient, this.weight_of_package_kg,this.totalCost(), weekendDelivery?"Weekend Delivery":"",nightTimeDelivery?"Night Time Delivery":"");
    }

}

public class LabTest{
    public static void main(String[] args){
        double total = 0;
        Delivery a = new Delivery("Ali","Ahmad",4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah",63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        SpecialDelivery d = new SpecialDelivery("Ang","Liew",19.0,true,true);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        total+=a.totalCost();
        total+=b.totalCost();
        total+=c.totalCost();
        total+=d.totalCost();
        System.out.println("\nThe total shipping cost is RM " +total);
    }
}