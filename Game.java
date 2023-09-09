import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(">>Let's play Rock Paper Scissors");
        System.out.println("\n>>When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println(">>Are you ready? Write 'yes' if you are");
        String answer = scan.nextLine();
        String playerAnswer = "";

        if (answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("\nrock - paper - scissors, shoot!");
            playerAnswer = scan.nextLine();
        } else {
            System.out.println("Darn, some\uFEFF other time...!");
        }
        String first = Cumputer();
        String second = playerAnswer;
        result(first, second);

        scan.close();
    }

    public static String Cumputer() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return "Rock";
        } else if (random == 1) {
            return "Paper";
        } else if (random == 2) {
            return "Sissor";
        } else {
            return "ERROR";
        }
    }

    public static String result(String computer, String user) {
        if (computer.equals(user)) {
            return ("Draw");
        } else if (computer.equals("Rock") && user.equals("paper")) {
            return ("You won");
        } else if (computer.equals("Sissor") && user.equals("Rock")) {
            return ("You won");
        } else if (computer.equals("Paper") && user.equals("Sissor")) {
            return ("You won");
        } else {
            return ("Computer won");
        }
    }
}
