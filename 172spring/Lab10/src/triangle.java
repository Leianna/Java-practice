/*
 * calculate area, perimeter of the triangle, and return 3 sides
 */
public class triangle extends shape {
    //own properties for triangle
    double sideA;
    double sideB;
    double sideC;

    //call the constructor
    public triangle(double x, double y,double sideA, double sideB, double sideC){
        //get x and y from super class shape
        super(x,y);
        //set properties equal to itself
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     *  calculate the area by using:
     *  Area = SquareRoot(P * (P - sideA) * (P - sideB) * (P - sideC))
     *  and P = (sideA + sideB + sideC) / 2
      */

    public void calcArea() {
        perimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
    }

    /**calculate the perimeter by adding three sides together
     *
     */
    public void calcPerimeter() {
        perimeter= sideA + sideB + sideC;
    }

    /**get(print) the answers
     *
     * @return three sides
     */
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
}
