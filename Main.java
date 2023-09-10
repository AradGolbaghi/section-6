public class Main {
    public static void main(String[] args) {

        Car s = new Car("Ferrari", 4_000_000, 2023, "Orange");

        Car r = new Car("Bugatti", 5_000_000, 2023, "Purple");



        System.out.println("This " + s.make + " is worth $" + s.price + 
        ". It was built in " + s.year + ". It is " + s.color + ".\n");
        System.out.println("This " + r.make + " is worth $" + r.price + 
        ". It was built in " + r.year + ". It is " + r.color + ".\n");
    }
}
