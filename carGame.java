import java.util.Scanner;

public class carGame {

    public static Scanner scan = new Scanner(System.in);
    public static String p;
    public static boolean h = true;

    public static void main(String[] args) {
        System.out.println("""
                help = Seeing everu command
                start = to start the car
                stop = to stop the car
                quit = to end the game
                """);
        System.out.print("\n>> ");
        p = scan.nextLine();

        while (!p.equals("quit")) {
            if (p.equalsIgnoreCase("start") && h == true) {
                System.out.println("Your car is running  GOGOGO...");
                p = scan.nextLine();
            }
            h = false;
            if (p.equalsIgnoreCase("start") && h == false) {
                System.out.println("Car is already started");
                p = scan.nextLine();

                h = true;
            } else if (p.equalsIgnoreCase("help")) {
                System.out.println("""
                        Strat = to start the car
                        Stop = to stop the car
                        quit = to exit the game
                        \n
                        """);
                p = scan.nextLine();
                h = false;
                if (p.equalsIgnoreCase("help") && h == false) {
                    System.out.println("You have already asked for help");
                    p = scan.nextLine();

                }
                h = true;
            } else if (p.equalsIgnoreCase("stop")) {
                System.out.println("Your car is stopped");
                p = scan.nextLine();
                h = false;
            }
            if (p.equalsIgnoreCase("stop") && h == false) {
                System.out.println("Car is already stopped");
                p = scan.nextLine();

                h = true;
            } else if (p.equalsIgnoreCase("quit") && h == true) {
                System.out.println("You exited the game");
                System.exit(0);
            }
        }
    }
}
