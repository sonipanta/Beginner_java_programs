import java.util.Scanner;
import java.util.Random;

public class Spr {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String [] choices={"Scissor","Paper","Rock"};
        String playerchoice;
        String computerchoice;
        String play;
        int score=0;
        int tie=0;
        int count=0;



        System.out.println("*****Welcome to scissor paper rock game*****");
        do {
            System.out.println("1.Scissor 2.Paper 3.Rock");
            System.out.println("Enter :");
           playerchoice = scanner.nextLine();

           if(!playerchoice.equalsIgnoreCase("Scissor")&&!playerchoice.equalsIgnoreCase("paper")&&!playerchoice.equalsIgnoreCase("rock")){
               System.out.println("Invalid choice");
           }
            computerchoice=choices[random.nextInt(0,3)];
            System.out.println(computerchoice);
            if(playerchoice.equalsIgnoreCase(computerchoice)){
                System.out.println("Try again!!");
                tie++;
            }
            else if(playerchoice.equalsIgnoreCase("paper")&&computerchoice.equalsIgnoreCase("rock")){
                System.out.println("You win");
                score++;
            }
            else if(playerchoice.equalsIgnoreCase("rock")&&computerchoice.equalsIgnoreCase("scissor")){
                System.out.println("You win");
                score++;
            }
            else if(playerchoice.equalsIgnoreCase("scissor")&&computerchoice.equalsIgnoreCase("paper")){
                System.out.println("You win");
                score++;
            }
            else{
                System.out.println("You losse");
            }
           count++;
            System.out.println("Do you still want to play the game?");
             play = scanner.next();

             scanner.nextLine();
        }while(play.equalsIgnoreCase("yes"));
        System.out.println("You won "+score+" round , lose "+(count-score)+" round and got tie  "+tie+" out of "+count);
    }
}
