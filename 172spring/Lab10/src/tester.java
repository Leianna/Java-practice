public class tester {
    public static void main(String[] args) {
        //Circle test
        System.out.println("Test CIRCLE");
        circle testcircle = new circle(2.0,0.0,1);
        //test x and y
        System.out.println("Center: (" + testcircle.x + "," + testcircle.y + ")");
        //test radius
        System.out.println("Radius should be: " + testcircle.getRadius());
        System.out.println("Distance From Origin Expected: 2");
        testcircle.calcDist();//test calculation of distance
        System.out.println("DistanceFromOrigin Got: " + testcircle.getDistance());
        System.out.println("Perimeter Expected: 6.28");
        testcircle.calcPerimeter();//test calculation of perimeter
        System.out.println("Perimeter Got: " + testcircle.getPerimeter());
        System.out.println("Area Expected: 3.14");
        testcircle.calcArea();//test calculation of area
        System.out.println("Area Got: " + testcircle.getArea());

        //rectangle test
        System.out.println("-------------------------");
        System.out.println("Test Rectangle");
        rectangle testRectangle = new rectangle(3.0,4.0,150,50);
        //test x and y
        System.out.println("Center: (" + testRectangle.x + "," + testRectangle.y + ")");
        //test length and width
        System.out.println("length should be 50: " + testRectangle.getLength());
        System.out.println("width should be 150: " + testRectangle.getWidth());
        System.out.println("Distance From Origin Expected: 5.0");
        testRectangle.calcDist();//test calculation of distance
        System.out.println("DistanceFromOrigin Got: " + testRectangle.getDistance());
        System.out.println("Perimeter Expected: 400.0");
        testRectangle.calcPerimeter();//test calculation of perimeter
        System.out.println("Perimeter Got: " + testRectangle.getPerimeter());
        System.out.println("Area Expected: 7500.0");
        testRectangle.calcArea();//test calculation of area
        System.out.println("Area Got: " + testRectangle.getArea());


        //triangle test
        System.out.println("-------------------------");
        System.out.println("Test trangle");
        triangle testTriangle = new triangle(3.0,4.0,40,50,30);
        //test x and y
        System.out.println("Center: (" + testTriangle.x + "," + testTriangle.y + ")");
        //test three sides
        System.out.println("SideA should be 40: " + testTriangle.getSideA());
        System.out.println("SideB should be 50: " + testTriangle.getSideB());
        System.out.println("SideC should be 30: " + testTriangle.getSideC());
        System.out.println("Distance From Origin Expected: 5.0");
        testTriangle.calcDist();//test calculation of distance
        System.out.println("DistanceFromOrigin Got: " + testTriangle.getDistance());
        System.out.println("Perimeter Expected: 120.0");
        testTriangle.calcPerimeter();//test calculation of perimeter
        System.out.println("Perimeter Got: " + testTriangle.getPerimeter());
        System.out.println("Area Expected: 600.0");
        testTriangle.calcArea();//test calculation of area
        System.out.println("Area Got: " + testTriangle.getArea());

    }

}
