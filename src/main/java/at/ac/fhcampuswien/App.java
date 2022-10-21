package at.ac.fhcampuswien;

import java.util.Arrays;
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


    public static long[] lcg(long seed) {
        //Quelle https://mein-javablog.de/java-arrays-for-schleife/
        /*https://de.acervolima.com/java-programm-zur-implementierung-des-linearen-kongruenzgenerators-
        fur-die-generierung-von-pseudo-zufallszahlen/ */

        long m = (long) Math.pow(2, 31);
        long a = 1103515245L;
        long c = 12345L;
        long[] Array1 = new long[10];

        Array1[0] = (a * seed + c) % m;

        for (int i = 1; i < Array1.length; i++) {
            Array1[i] = (a * Array1[i - 1] + c) % m;
        }
        return Array1;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scan = new Scanner(System.in);

        int counter = 1;
        int question;
        int guess;
        //randomNumberBetweenOneAndHundred(1,100);

        for (question = 1; question <= 10; question++) {
            System.out.print("Guess number " + counter + ": ");
            guess = scan.nextInt();
            counter++;

            if (guess == numberToGuess && question != 10) {
                System.out.println("You won wisenheimer!");
                break;
            } else if (guess < numberToGuess && question != 10) {
                System.out.println("The number AI picked is higher than your guess.");
            } else if (guess > numberToGuess && question != 10) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (question == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        //Quelle: https://www.javatpoint.com/how-to-generate-random-number-in-java
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static boolean swapArrays(int[] Array1, int[] Array2) {
        //Quelle: https://linuxhint.com/swap-arrays-in-java/

        boolean array5;

        if (Array1.length == Array2.length) {
            array5 = true;
            int fill;
            for (int i = 0; i < Array1.length; i++) {
                fill = Array1[i];
                Array1[i] = Array2[i];
                Array2[i] = fill;
            }
        } else {
            array5 = false;
        }
        return array5;
    }

    public static String camelCase(String sentence) {
        char[] symbols = new char[sentence.length()];

        //wenn zeichen davor = lücke
        for (int i = 1; i < symbols.length; i++){
            if (symbols[i-1] == ) {
                symbols[i - 1] = 127;
                if (symbols[i] <= 122 && symbols[i] >= 97) {
                    symbols[i] += 32;
                }
            }
        }

        /*if (symbols[0] <= (char)122 && symbols[0] >= (char)97){
            symbols [0] -= (char)32;
        } else if (symbols[0] <= (char)47 && symbols[0] >= (char)33 || symbols[0] <= (char)64 && symbols[0] >= (char)58 || symbols[0] <= (char)96
        && symbols[0] >= (char)91 || symbols[0] <= (char)126 && symbols[0] >= (char)123) {
            symbols[0] -= (char)1;
        }

        for (int i = 1; i < symbols.length; i++) {
            if (symbols[i - 1] == (char) 32 && symbols[i] <= (char)122 && symbols[i] >= (char)97) {
                symbols[i] -= (char)32;
            } else if (symbols[i-1] != (char)32 && symbols[i] <= (char)90 && symbols[i] >= (char)65) {
                symbols[i] += (char)32;
            }
           if (symbols[i] <= (char)47 && symbols[i] >= (char)33 || symbols[i] <= (char)64 && symbols[i] >= (char)58 || symbols[i] <= (char)96
                    && symbols[i] >= (char)91 || symbols[i] <= (char)126 && symbols[i] >= (char)123) {
                symbols[i] -= (char)1;
            }
        }*/
        String s = String.valueOf(symbols);

            return s;
    }

        public static int checkDigit ( int[] code){
            //Quelle: https://www.java-forum.org/thema/array-mit-zahlen-zw-0-und-9-befuellen.156261/

            int sumdiv;
            int proof;
            int multiply = 0;

            for (int i = 0; i < code.length; i++) {
                multiply += code[i] * (i + 2);
            }
            sumdiv = multiply % 11;
            proof = 11 - sumdiv;

            if (proof == 10) {
                return 0;
            } else if (proof == 11) {
                return 5;
            }
            return proof;
        }
        public static void main (String[]args){
            // test your method implementations here
            // make method calls
            // print their results
            // etc.
        camelCase("Du bist doof!");
        }
}