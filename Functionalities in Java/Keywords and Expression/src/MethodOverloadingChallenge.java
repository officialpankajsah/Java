// Q-> I. Declare two integer variables as length and breadth, and one double variable as height for storing the
//        dimensions of the figures.
// II. Declare three double variables as sq_area, rect_area, and tri_area, for calculating the area of the three figures.
// III. Create three different methods as follows:
// area(int length) - for calculating the area of the square.
// area(int length, int breadth) - for calculating the area of the rectangle.
// area(int breadth, double height) - for calculating the area of the triangle.

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        int length = 20;
        int breadth = 15;
        double height = 28.43;

        area(length);
        area(length, breadth);
        area(breadth, height);

    }

    public static void area(int length) {
        double sq_area = length * length ;
        System.out.println("Area of square = " + sq_area);
    }

    public static void area(int length, int breadth) {
        double rect_area = length * breadth ;
        System.out.println("Area of rectangle = " + rect_area);
    }

    public static void area(int breadth, double height) {
        double tri_area = 0.5 * breadth * height ;
        System.out.println("Area of triangle = " + tri_area);
    }

}
