public class returnValues {
    public static void main(String[] args) {

        double area1 = canculateArea(2.3, 3.5);
        double area2 = canculateArea(2.3, 3.6);
    }

    public static double canculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DEMENTIONS");
            System.exit(0);
        }

        double Area = length * width;
        return Area;
    }

    public static String explainArea(String language) {

        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * an";
            default:
                return "Language not available";
        }
    }
}
