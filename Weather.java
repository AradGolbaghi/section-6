public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);

        System.out.println(fahrenheitToCelsius("noon"));

    }

    public static String fahrenheitToCelsius(String fahrenheit) {

        switch (fahrenheit) {
            case "noon":
                return "The temp is :25 at noon";
            case "evening":
                return "The temp is: 16 at evening";
            case "midnight":
                return "The temp is: 12 at midnight";
            default:
                return "Not sure";
        }
    }

    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: temperature in fahrenheit.");
        System.out.println("C: temperature in celsius");
    }
}