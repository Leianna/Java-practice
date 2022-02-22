/*
 * A abstract class that calculate and get shape: area(abstract), distance, perimeters(abstract)
 * @author Lei Chen
 * @date 4/15/2019
 */
public abstract class shape{
    //set up the similar properties for subclasses
    double x;
    double y;
    double distance;
    double perimeter;
    double area;

    //call the constructors
    public shape(double x, double y){
        this.x = x;
        this.y = y;
        //set the initial to 0
        this.perimeter = 0;
        this.area = 0;
        this.distance = 0;
    }

    /**calculate the distance(tangent line)
     *using formula √[(x^2)+(y^2)]
     */
    public void calcDist(){
        distance = Math.sqrt(x*x + y*y);
    }

    /**Each shape have different calculation formula
     *
     */
    public abstract void calcPerimeter();
    public abstract void calcArea();

    //get(print) the answers
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    public double getDistance(){
        return distance;
    }
}
