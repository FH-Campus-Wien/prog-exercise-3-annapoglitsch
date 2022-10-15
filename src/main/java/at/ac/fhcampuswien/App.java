package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int days, int firstDay) {
        int start = 1;
        int file = 0;
        switch (firstDay) {
            case 1:
                for (int rows = 1; rows < 6; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;

            case 2:
                for (int firstRow = 0; firstRow < 1; firstRow++) {

                    System.out.print("   ");

                    for (int file1 = 0; file < 6; file++) {

                        System.out.printf("%2d", start++);
                        System.out.print(" ");
                    }

                    System.out.println();
                }
                for (int rows = 1; rows < 5; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;

            case 3:
                for (int firstRow = 0; firstRow < 1; firstRow++) {

                    System.out.print("      ");

                    for (int file1 = 0; file < 5; file++) {

                        System.out.printf("%2d", start++);
                        System.out.print(" ");
                    }

                    System.out.println();
                }
                for (int rows = 1; rows < 5; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;

            case 4:
                for (int firstRow = 0; firstRow < 1; firstRow++) {

                    System.out.print("         ");

                    for (int file1 = 0; file < 4; file++) {

                        System.out.printf("%2d", start++);
                        System.out.print(" ");
                    }

                    System.out.println();
                }
                for (int rows = 1; rows < 5; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;

            case 5:
                for (int firstRow = 0; firstRow < 1; firstRow++) {

                    System.out.print("            ");

                    for (int file1 = 0; file < 3; file++) {

                        System.out.printf("%2d", start++);
                        System.out.print(" ");
                    }

                    System.out.println();
                }
                for (int rows = 1; rows < 5; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 6:
                for (int firstRow = 0; firstRow < 1; firstRow++) {

                    System.out.print("               ");

                    for (int file1 = 0; file < 2; file++) {

                        System.out.printf("%2d", start++);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                for (int rows = 1; rows < 5; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 7:
                for (int firstRow = 0; firstRow < 1; firstRow++) {

                    System.out.print("                  ");

                    for (int file1 = 0; file < 1; file++) {

                        System.out.printf("%2d", start++);
                        System.out.print(" ");
                    }

                    System.out.println();
                }
                for (int rows = 1; rows < 5; rows++) {

                    System.out.print("");

                    for (file = 0; file < 7; file++) {

                        if (start <= days) {

                            System.out.printf("%2d", start++);
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }


    public static void lcg() {

    }

    public static void guessingGame(int numberToGuess) {
        Scanner scan = new Scanner(System.in);

        int guess;
        int counter = 1;
        int question;
        randomNumberBetweenOneAndHundred(1,101);

        for (question = 1; question <= 10; question++) {
            System.out.print("Guess number " + counter + ": ");
            guess = scan.nextInt();
            counter++;

            if (guess == numberToGuess && question != 10) {
                System.out.println("You won wisenheimer!");
                break;
            } else if (guess < numberToGuess && question != 10) {
                System.out.println("The number AI picked is higher than your guess.");
            } else if (guess > numberToGuess && question != 10){
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (question == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
        }
    }

    public static void randomNumberBetweenOneAndHundred(int min, int max) {
        //Quelle: https://www.javatpoint.com/how-to-generate-random-number-in-java

        min = 1;
        max = 100;

        int numberToGuess = (int)(Math.random() * (max - min + 1) + min);

    }
    public static void swapArrays(int array1, int array2){

    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
       oneMonthCalendar(31,7);
       randomNumberBetweenOneAndHundred(1,101);
        guessingGame(100);
    }
}