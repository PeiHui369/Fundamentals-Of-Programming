public class Lab8{
    public static void main (String[] args){
        WeightCalculator user = new WeightCalculator(20,159);
        user.getRecommendWeight();
        user.displayResult();
    }
}
class WeightCalculator{

    double age, height, recommendWeight;

    public WeightCalculator(int age, int height){
        this.age = age;
        this.height = height;
    }

    public double getRecommendWeight(){
        this.recommendWeight = (this.height - 100 + this.age/10) * 0.9;
        return this.recommendWeight;
    }

    public void displayResult(){
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.height);
        System.out.println("Recommend Weight: " + this.recommendWeight);
    }
}
