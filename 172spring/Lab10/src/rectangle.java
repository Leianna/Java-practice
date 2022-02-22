/*
* calculate area, perimeter of the rectangle, and return length and width
*/
public class rectangle extends shape {
    //own properties for rectangle
    double width;
    double length;


    //call the constructor
    public rectangle(double x, double y, double width, double length){
        //get x and y from super class shape
        super(x,y);
        //set properties equal to itself
        this.width = width;
        this.length = length;
    }

    /**calculate the area by using formula length * width
     *
     */
    public void calcArea() {
        area = width * length;
    }

    /**calculate the perimeter by using formula 2length + 2width
     *
     */
    public void calcPerimeter() {
        perimeter = 2 * (width + length);
    }

    //get(print) the answers
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }



}
