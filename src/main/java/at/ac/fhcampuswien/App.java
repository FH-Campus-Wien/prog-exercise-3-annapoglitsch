package at.ac.fhcampuswien;

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
                for (int firstRow = 0; firstRow < 1; firstRow++){

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
                for (int firstRow = 0; firstRow < 1; firstRow++){

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
                for (int firstRow = 0; firstRow < 1; firstRow++){

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
                for (int firstRow = 0; firstRow < 1; firstRow++){

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
                for (int firstRow = 0; firstRow < 1; firstRow++){

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
                for (int firstRow = 0; firstRow < 1; firstRow++){

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



    public static void lcg (){

    }

    public static void  guessingGame () {

    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        oneMonthCalendar(31,7);
    }
}