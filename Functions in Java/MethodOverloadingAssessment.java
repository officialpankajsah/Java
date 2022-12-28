//Q-> Declare two integer variables as length and breadth, and one double variable as height for storing the
//    dimensions of the figures.
//  Declare three double variables as sq_area, rect_area, and tri_area, for calculating the area of the three figures.
//  Create three different methods as follows:
//  area(int length) - for calculating the area of the square.
//  area(int length, int breadth) - for calculating the area of the rectangle.
//  area(int breadth, double height) - for calculating the area of the triangle.

public class MethodOverloadingAssessment {
    public static void main(String[] args) {
        int length = 20;
        int breadth = 10;
        double height = 22.5;

        double sq_area = area(length);
        double rect_area = area(length,breadth);
        double tri_area = area(breadth,height);

        System.out.println("Area of square = " + sq_area);
        System.out.println("Area of rectangle = " + rect_area);
        System.out.println("Area of triangle = " + tri_area);


    }

    public static double area(int length) {
        int areaOfSquare = length * length;
//        System.out.println("Area of square is = " + areaOfSquare);
        return areaOfSquare;
    }

    public static double area(int length, int breadth) {
        int areaOfRectangle = length * breadth;
//        System.out.println("Area of rectangle is = " + areaOfRectangle);
        return areaOfRectangle;
    }

    public static double area(int breadth, double height) {
        double areaOfTriangle = 0.5 * breadth * height;
//        System.out.println("Area of triangle is = " + areaOfTriangle);
        return areaOfTriangle;
    }
}
