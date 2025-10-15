import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
int guess;
int ranum;
       System.out.println("Welcome to Number Guessing Game");
       scanner.nextLine();
        System.out.println("Choose the level:\n 1.Easy\t 2.Meduim\t 3.Hard");
        int level=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you want hint(Yes/No):");
        String hint=scanner.nextLine();


        switch(level){
            case 1:
                System.out.println("You choosed Easy level:");
                 ranum= random.nextInt(0,10);
                do {
                    System.out.println("Guess the number between 0 to 10:");
                     guess = scanner.nextInt();

                    if (hint.equalsIgnoreCase("yes")) {
                        if (ranum < guess) {
                            System.out.println("The random number is less than your guess");
                        } else if (ranum > guess) {
                            System.out.println("The random number is greater  than your guess");
                        } else {
                            System.out.println("Congratulation !!  You won the game");
                            System.exit(1);
                        }

                    }
                }while(ranum!=guess);

                        System.out.println("Congratulation !!  You won the game");
                break;
            case 2:
                System.out.println("You choosed Medium level:");
                 ranum= random.nextInt(0,100);
                do {
                    System.out.println("Guess the number between 0 to 100:");
                    guess = scanner.nextInt();

                    if (hint.equalsIgnoreCase("yes")) {
                        if (ranum < guess) {
                            System.out.println("The random number is less than your guess");
                        } else if (ranum > guess) {
                            System.out.println("The random number is greater  than your guess");
                        } else {
                            System.out.println("Congratulation !!  You won the game");
                            System.exit(1);

                        }

                    }
                }while(ranum!=guess);

                System.out.println("Congratulation !!  You won the game");
                break;
            case 3:
                System.out.println("You choosed Hard level:");
                 ranum= random.nextInt(0,1000);
                do {
                    System.out.println("Guess the number between 0 to 1000:");
                     guess = scanner.nextInt();

                    if (hint.equalsIgnoreCase("yes")) {
                        if (ranum < guess) {
                            System.out.println("Try Again...The random number is less than your guess");
                        } else if (ranum > guess) {
                            System.out.println("Try Again..The random number is greater  than your guess");
                        } else {
                            System.out.println("Congratulation !!" +
                                    "  You won the game");
                            System.exit(1);
                        }

                    }
                }while(ranum!=guess);



                System.out.println("Congratulation !!  You won the game");
                break;

            default:
                System.out.println("Sorry, we have no such level.");
                break;

        }
    }
}

