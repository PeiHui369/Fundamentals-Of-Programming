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

    public double totalShippingCost_cents(double weight_of_package_kg){
        int n = 0;
        this.totalShippingCost = 0;
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

    @Override
    public String toString(){
        return String.format("Sender: %s\nRecipient: %s\nWeight of package in kilogram: %.2fkg\nTotal Shipping Cost: %.2f\n", this.sender, this.recipient, this.weight_of_package_kg,this.totalShippingCost);
    }
}

class SpecialDelivery extends Delivery{
    boolean weekendDelivery;
    boolean nightTimeDelivery;

/*
    public SpecialDelivery(String sender, String recipient, double weight_of_package_kg,boolean weekendDelivery, boolean nightTimeDelivery) {
        super(sender, recipient, weight_of_package_kg);
        this.weekendDelivery = weekendDelivery;
        this.nightTimeDelivery = nightTimeDelivery;
    }
*/
    public SpecialDelivery(boolean weekendDelivery, boolean nightTimeDelivery) throws Exception{
        this.weekendDelivery = weekendDelivery;
        this.nightTimeDelivery = nightTimeDelivery;
        
    }

    public double totalCost(){
        if(this.weekendDelivery){this.totalShippingCost + 500;
        }
        
    }
}
