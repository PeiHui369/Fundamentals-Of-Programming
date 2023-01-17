public class Lab9{
    public static void main(String[] args) throws Exception {
        Shape rec = new Rectangle(20,60,"Rectangle",0,0);
        rec.display();
        Shape sq = new Square(20,"Square",0,0);
        sq.display();
        Shape circle = new Circle(20,"Circle",0,0);
        circle.display();
    }
}

/*Define class Shape*/
class Shape {
    //Instance variable, access modifier : private
    private String name;
    private double perimeter, area;

    /*Class has a name, perimeter & area */
    public Shape(String n, double p, double a) {
        this.name = n;
        this.perimeter = p;
        this.area = a;
    }

    /*Class has accessor method & mutator for perimeter & area*/
    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    //Perimeter & Area of shape cannot be 0: throw new Exception("")
    public void setPerimeter(double p)throws Exception {
        if(perimeter < 0){
            throw new Exception("Error: Shape with perimeter = 0");
        }
        this.perimeter = p;
    }

    public void setArea(double a) throws Exception{
        if(area<0){
            throw new Exception("Error: Shape with area = 0");
        }
        this.area = a;
    }

    /*Class has display method to display name, perimeter, area*/
    public void display(){
        System.out.println(this.name);
        System.out.printf("%.2f\n",this.perimeter);
        System.out.printf("%.2f\n", this.area);
    }
}

/*Derive Rectangle from Shape*/
class Rectangle extends Shape{
    //Instance variable, access modifier: protected
    protected double sidelength1, sidelength2;

    public Rectangle(double s1, double s2, String n, double p, double a) throws Exception {
        super(n, p, a);
        this.sidelength1 = s1;
        this.sidelength2 = s2;

        //Call the method in the constructor, so it directly runs when call in tester class
        this.calcArea();
        this.calcPerimeter();
    }

    //If involve operation, create method other than get&set
    //Still use set to change the value, get to display output
    public double calcPerimeter() throws Exception {
        this.setPerimeter((2*this.sidelength1) + (2*this.sidelength2));
        return this.getPerimeter();
    }

    public double calcArea() throws Exception {
        this.setArea(this.sidelength1 * this.sidelength2);
        return this.getArea();
    }
}

class Square extends Shape{
    int sidesLength;

    public Square(int sL, String n, double p, double a) throws Exception {
        super(n, p, a);
        this.sidesLength = sL;

        this.calcPerimeter();
        this.calcArea();
    }

    public double calcPerimeter() throws Exception {
        this.setPerimeter(4*this.sidesLength);
        return this.getPerimeter();
    }

    public double calcArea() throws Exception {
        this.setArea(this.sidesLength * this.sidesLength);
        return this.getArea();
    }
}

class Circle extends Shape{

    int diameter;
    public Circle(int d, String n, double p, double a) throws Exception {
        super(n, p, a);
        this.diameter = d;

        this.calcArea();
        this.calcPerimeter();
    }

    public double calcPerimeter() throws Exception {
        this.setPerimeter (2 * Math.PI * (this.diameter/2));
        return this.getPerimeter();
    }

    public double calcArea() throws Exception {
        this.setArea(Math.PI * Math.pow((this.diameter),2));
        return this.getArea();
    }
}