// import java.util.Arrays;
// import java.util.Scanner;

// public class newTic {
//     /*
//      * turns
//      */
//     public static char xOrO() {
//         double ranndom = Math.random() * 2;
//         int random = (int) ranndom;
//         switch (random) {
//             case 0:
//                 return 'X';
//             case 1:
//                 return 'O';
//             default:
//                 return 'n';

//         }
//     }

//     public static Scanner scan = new Scanner(System.in);
//     public static int[][] h = new int[3][3];

//     public static void main(String[] args) {

//         System.out.println("\nLet's play tic tac toe");

//         String[][] board = {
//                 { "   _  _  _   " },
//                 { "   _  _  _   " },
//                 { "   _  _  _   " }
//         };
//         printBoard((board));

//         char XORO = xOrO();
//         if (XORO == 'X') {
//             System.out.println("X turn play your move: ");
//             String answer = scan.nextLine();

//             h[Character.getNumericValue(answer.charAt(0))][Character.getNumericValue(answer.charAt(2))] = 0;
//             printBoard(board);
//         }
//     }

//     public static void printBoard(String[][] board) {
//         System.out.println("\n");
//         System.out.println("\t" + Arrays.toString(board[0]) + "\n\n\t" + Arrays.toString(board[1]) + "\n\n\t"
//                 + Arrays.toString(board[2]) + "\n");
//     }
//     /**
//  * Task 6 - Write a function that determines the winner
//  * Function name - checkWin
//  * 
//  * @param board (char[][])
//  * @return count (int)
//  * 
//  *         Inside the function:
//  *         1. Make a count variable that starts at 0.
//  *         2. Check every row for a straight X or straight O (Task 7).
//  *         3. Check every column for a straight X or straight O (Task 8).
//  *         4. Check the left diagonal for a straight X or straight O (Task 9).
//  *         5. Check the right diagonal for a straight X or straight O (Task 10).
//  */

//  public static int checkWin(char[][] board){
//     int count = 0;
//     if()
//  }
// }

// // Task 1: Create an array with three rows of '_' characters.

// // Task 2: Call the function printBoard();

// /*
//  * { Task 3: Loop through turns.
//  * 
//  * if (X) turn {
//  * Task 4: call askUser().
//  * Task 5: populate the board using askUser's return value.
//  * } else {
//  * Task 4: call askUser().
//  * Task 5: populate the board using askUser's return value. Then, print it.
//  * 
//  * }
//  * 
//  * Task 6 - Call the function.
//  * if return value == 3 {
//  * print: X wins and break the loop
//  * } else if return value == -3 {
//  * print: O wins and break the loop
//  * }
//  * 
//  * }
//  */

// /**
//  * Task 2 - Write a function that prints the board.
//  * Function name - printBoard()
//  * 
//  * @param board (char[][])
//  * 
//  *              Inside the function:
//  *              1. print a new line.
//  *              2. print the board.
//  *              • separate each row by two lines.
//  *              • each row precedes a tab of space
//  *              • each character in the grid has one space from the other
//  *              character
//  */
// /**
 

// /**
//  * Task 6 - Write a function that determines the winner
//  * Function name - checkWin
//  * 
//  * @param board (char[][])
//  * @return count (int)
//  * 
//  *         Inside the function:
//  *         1. Make a count variable that starts at 0.
//  *         2. Check every row for a straight X or straight O (Task 7).
//  *         3. Check every column for a straight X or straight O (Task 8).
//  *         4. Check the left diagonal for a straight X or straight O (Task 9).
//  *         5. Check the right diagonal for a straight X or straight O (Task 10).
//  */
