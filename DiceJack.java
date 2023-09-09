import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter 3 numbs between 1 and 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (isLessThen1(num1, num2, num3) || isHigherThen6(num1, num2, num3)) {
            System.out.println("\nYour number(s) is out of the range.\n");
            System.exit(0);
        }
        int sumNumber = num1 + num2 + num3;
        int sumDiceRoll = roll1 + roll2 + roll3;

        System.out.println("You sum: " + sumNumber + " Computer sum: " + sumDiceRoll);

        if (userWon(sumNumber, sumDiceRoll)) {
            System.out.println("You won");
        } else {
            System.out.println("Better luck next time");
        }
        scan.close();
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }

    public static boolean isLessThen1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThen6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static int rollDice() {
        double remdom = Math.random() * 6;
        remdom += 1;
        return (int) remdom;
    }
}
