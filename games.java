import java.util.Scanner;

public class games {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(">>Let's play Rock Paper Scissors");
        System.out.println("\n>>When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println(">>Are you ready? Write 'yes' if you are");
        String answer = scan.nextLine();

        if (answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("\nrock - paper - scissors, shoot!");
            String playerAnswer = scan.nextLine();
            String compChoice = Cumputer();
            result(playerAnswer, compChoice);

            System.out.println("\nYou chose:        " + playerAnswer);
            System.out.println("The computer chose: " + compChoice);

            String finalResult = result(playerAnswer, compChoice);
            System.out.println(finalResult);
        } else {
            System.out.println("Darn, some\uFEFF other time...!");
        }
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

    public static String result(String yourChoice, String computerChoice) {
        if (computerChoice.equals(yourChoice)) {
            return ("Draw");
        } else if (computerChoice.equals("Rock") && yourChoice.equals("paper")) {
            return ("You won");
        } else if (computerChoice.equals("Sissor") && yourChoice.equals("Rock")) {
            return ("You won");
        } else if (computerChoice.equals("Paper") && yourChoice.equals("Sissor")) {
            return ("You won");
        } else if (yourChoice.equals("Rock") && computerChoice.equals("paper")) {
            return ("You LOSE");
        } else if (yourChoice.equals("Sissor") && computerChoice.equals("Rock")) {
            return ("You LOSE");
        } else if (yourChoice.equals("Paper") && computerChoice.equals("Sissor")) {
            return ("You LOSE");
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
            return "";
        }
    }
}
