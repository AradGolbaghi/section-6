public class Prameters {
    public static void main(String[] args) {

        canculateArea(2.3, 3.5);
        canculateArea(2.3, 3.6);
        canculateArea(2.3, 3.8746583658473658743683);
    }

    public static void canculateArea(double length, double width) {

        double Area = length * width;
        System.out.println("Area: " + Area);
    }
}
