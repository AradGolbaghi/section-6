public class Tip {

    public static void main(String[] args) {

        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        canculateTip(53.5);
        // Task 2: Call a function that tips the waiter.
    }

    public static void canculateTip(double money) {
        double bill = 53.5;
        System.out.println("Your service was wonderful! Please, accept this tip:");
        System.out.println(bill / 10 + bill / 10 / 2);
    }

    // Task 1: Make a function here. See the doc comment for details.

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * 
     * @param bill (double).
     * 
     *             Inside the function:
     *             1. Calculates a tip that's 15 percent of bill.
     *             2. Prints: Your service was wonderful! Please, accept this tip:
     *             $<tip>
     */

}