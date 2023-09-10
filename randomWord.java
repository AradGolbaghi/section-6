// import java.util.Scanner;

// public class randomWord {
//     public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
//             "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
//             "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
//             "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
//             "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
//             "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
//             "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
//             "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
//             "wombat", "zebra" };

//     public static String randomWordd() {
//         int numWords = words.length;
//         double randomDouble = Math.random();
//         int randomIndex = (int) (randomDouble * numWords);
//         return words[randomIndex];
//     }

//     public static Scanner scan = new Scanner(System.in);
//     public static String scannerTimes;

//     public static void main(String[] args) {
//         System.out.println("\nThere is a word that you need to Guess: ");
//         scannerTimes = scan.nextLine();

//         for (int i = 0; i < 4; i++) {
//             System.out.println("Guess again: ");
//             scannerTimes = scan.nextLine();

//         }
//         for (int j = 0; j < 1;) {
//             if (scannerTimes.equalsIgnoreCase(randomWordd())) {
//                 System.out.println("You won!!! \n");
//                 break;
//             } else {
//                 System.out.println("You lose the word was: " + randomWordd());
//                 break;
//             }

//         }

//     }
// }
