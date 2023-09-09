import java.util.Scanner;

public class RockPaperSissor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to play Yes or No? ");
        String playerAnswer = scan.nextLine();

        if (playerAnswer.equals("no")) {
            System.exit(0);
        }
        String computerAnswer = answer().trim();
        System.out.println("What do you want to play ");
        String play = scan.nextLine().trim();
        System.out.println("Computer turn: " + computerAnswer);

        if (computerAnswer.equals(play)) {
            System.out.println("Draw");
        } else if (computerAnswer.equals("Rock") && play.equals("Paper")) {
            System.out.println("You won");
        } else if (computerAnswer.equals("Sissor") && play.equals("Rock")) {
            System.out.println("You won");
        } else if (computerAnswer.equals("Paper") && play.equals("Sissor")) {
            System.out.println("You won");
        } else {
            System.out.println("Computer won");
        }
        scan.close();
    }

    public static String answer() {

        int randomInt = (int) (Math.random() * 3);

        switch (randomInt) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            default:
                return " Sissor";
        }
    }
}