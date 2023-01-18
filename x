class Delivery{
    public String sender;
    public String recipient;
    public double weight_of_package_kg;
    public double totalShippingCost;

    public Delivery(String sender, String recipient, double weight_of_package_kg){
        this.sender = sender;
        this.recipient = recipient;
        this.weight_of_package_kg = weight_of_package_kg;
    }

    public double totalCost(){
        int n;
        if(this.weight_of_package_kg <= 5){
            n = 280;
            this.totalShippingCost = weight_of_package_kg * n;
        }else if(this.weight_of_package_kg >5 && this.weight_of_package_kg <=20){
            n = 520;
            this.totalShippingCost = weight_of_package_kg * n;
        }else if(this.weight_of_package_kg >20 && this.weight_of_package_kg <=50){
            n = 700;
            this.totalShippingCost = weight_of_package_kg * n;
        }else if(this.weight_of_package_kg>50) {
            n = 860;
            this.totalShippingCost = weight_of_package_kg * n;
        }
        return this.totalShippingCost;
    }

    public String toString(){
        return String.format("Sender: %s To:%s\nWeight of package: %.1fkg\nShipping Cost: RM %d.%02d\n", this.sender, this.recipient, this.weight_of_package_kg,(int)this.totalShippingCost%100, (int)this.totalShippingCost/100);
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
        if(this.weekendDelivery & this.nightTimeDelivery){return (super.totalCost() + 500) *1.20;}
        else if(this.weekendDelivery){ return super.totalCost() + 500;}
        else if(this.nightTimeDelivery){return super.totalCost() * 1.20;}
        return 0;
    }

    @Override
    public String toString(){
        return String.format("Sender: %s To:%s\nWeight of package: %.1fkg\nShipping Cost: %.2f\n", this.sender, this.recipient, this.weight_of_package_kg,this.totalCost());
    }

}

public class LabTest{
    public static void main(String[] args){
        double total = 0;
        Delivery a = new Delivery("Ali","Ahmad",4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah",63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM","FK,UM",32.5,true,false);
        SpecialDelivery d = new SpecialDelivery("Ang","Liew",19.0,true,true);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        total+=a.totalCost();
        total+=b.totalCost();
        total+=c.totalCost();
        total+=d.totalCost();
        System.out.println("The total shipping cost is RM " +total);
    }
}

>>
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.2\lib\idea_rt.jar=57898:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\w3exercise\out\production\w3exercise LabTest
Sender: Ali To:Ahmad
Weight of package: 4.4kg
Shipping Cost: RM 0.00

Sender: Ah Chong To:Fatimah
Weight of package: 63.1kg
Shipping Cost: RM 0.00

Sender: FSKTM, UM To:FK,UM
Weight of package: 32.5kg
Shipping Cost: 23250.00

Sender: Ang To:Liew
Weight of package: 19.0kg
Shipping Cost: 12456.00

The total shipping cost is RM 91204.0

Process finished with exit code 0
