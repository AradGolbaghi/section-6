public class Main {

    public static void main(String[] args) {
        Car s = new Car("Ferrari", 6_000_000, 2023, "Purple");
        Car r = new Car("Bugatti", 5_000_000, 2023, "Purple");

        s.setColor("Black");
        r.setColor("Black");

        s.setPrice(s.getPrice() / 2);
        r.setPrice(r.getPrice() / 2);

        System.out.println("This " + s.getMake() + " is worth $" + s.getPrice() +
                ". It was built in " + s.getYear() + ". It is " + s.getColor() + ".\n");
        System.out.println("This " + r.getMake() + " is worth $" + r.getPrice() +
                ". It was built in " + r.getYear() + ". It is " + r.getColor() + ".\n");

    }

}
