import java.util.Scanner;

public class newHangman {

        public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
                        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
                        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
                        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
                        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
                        "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
                        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
                        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
                        "wombat", "zebra" };

        public static String[] gallows = { "+---+\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "|   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|   |\n" +
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a
                                                      // trailing escape
                                                      // character, which also happens to be '\'
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/    |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/ \\  |\n" +
                                        "     |\n" +
                                        " =========\n" };

        public static String randomWordd() {
                int numWords = words.length;
                double randomDouble = Math.random();
                int randomIndex = (int) (randomDouble * numWords);
                return words[randomIndex];
        }

        public static String randomm = randomWordd();
        public static int guess = 0;
        public static int misses = 0;
        public static String guesss;
        public static String a = "_ _ _";
        public static String b = "_ _ _ _";
        public static String c = "_ _ _ _ _";
        public static String d = "_ _ _ _ _ _";

        public static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }
                System.out.println(gallows[0]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);
                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }

                System.out.println(gallows[1]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);
                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }
                System.out.println(gallows[2]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);
                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }
                System.out.println(gallows[3]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);
                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }
                System.out.println(gallows[4]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);
                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }
                System.out.println(gallows[5]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);
                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }
                System.out.println(gallows[6]);
                System.out.println("Misses: " + miss(guess));
                System.out.print("Guesses: " + guesss);
                guesss = scan.nextLine();
                guess++;
                if (!(guesss.equals(randomm))) {
                        System.out.println("Misses: " + guesss);
                        System.out.print(misses++);

                }
                if (guesss.equals(randomm)) {
                        System.out.println("Correct guesses: " + guesss);
                }
                for (int i = 0; i < 1; i++) {
                        System.out.println();
                        if (randomm.length() == 3) {
                                System.out.println("\nGuesses: " + a);
                        } else if (randomm.length() == 4) {
                                System.out.println("\nGuesses: " + b);
                        } else if (randomm.length() == 5) {
                                System.out.println("\nGuesses: " + c);
                        } else if (randomm.length() == 6) {
                                System.out.println("\nGuesses: " + d);
                        }

                }

                System.out.println("Your guesses are over the word was: " + randomm);
                System.exit(0);

        }

        public static int miss(int misses) {
                misses = 0;
                if (guesss != randomm) {
                        return misses++;

                }
                return misses;

        }

}
