public class circle extends shape {
    //own properties for circle
    double radius;

    //call the constructor
    public circle(double x, double y,double radius){
        //get x and y from super class shape
        super(x,y);
        //set properties equal to itself
        this.radius = radius;
    }

    /**calculate the area by using formula A=πr^2
     *
     */
    public void calcArea() {
        //System know Math.PI = π = 3.14159265...
        area = Math.PI * Math.pow(radius, 2);
    }

    /**calculate the area by using formula P=2πr
     *
     */
    public void calcPerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    //get(print) the answers
    public double getRadius(){
        return radius;
    }




}
