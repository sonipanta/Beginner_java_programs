import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) throws InterruptedException{
   Scanner scanner=new Scanner(System.in);
   Random random=new Random();
   String option;

   int total;
   int tot=0;
   String d1="""
               -----------
               |           |
               |     ●     |
               |           |
                -----------""";
        String d2= """
                     ----------
                    |  ●        |
                    |           |
                    |        ●  |
                     -----------""";
        String d3="""
                 -----------
                | ●         |
                |    ●      |
                |        ●  |
                 -----------""";
        String d4=""" 
                 -----------
                | ●      ●  |
                |           |
                | ●      ●  |
                 -----------""";
        String d5=""" 
                 -----------
                | ●      ●  |
                |    ●      |
                | ●      ●  |
                 -----------""";
        String d6=""" 
                 -----------
                | ●      ●  |
                | ●      ●  |
                | ●      ●  |
                 -----------""";

   System.out.println("******Welcome to Dice rolling game*******");
   Thread.sleep(2000);
   System.out.println("Make double or triple of your money");
        Thread.sleep(2000);
   System.out.println("..................Rule....................");
        Thread.sleep(2000);
   System.out.println("1.You have to bet the money (how much you want)\n 2.If you won you will get double of your bet\n 3.If you loose you get nothing");
        Thread.sleep(2000);
   System.out.println("4.There are 3 options :\n a.If no. is greater than 8 --->DOUBLE \t b.If no. is equal to 8---->Triple\t c.If no. is less than 8 --->DOUBLE");
        Thread.sleep(2000);
   System.out.println("You have to bet in one of these ..so lets play the game:");
        Thread.sleep(2000);
   do {
       System.out.println("How much amount you wanna bet?");
       double amount = scanner.nextDouble();
       if(amount<0){
           System.out.println("Invalid amount");
           System.exit(1);
       }
       System.out.println("Choose your choice(1/2/3):");
       int choice = scanner.nextInt();
       System.out.println("Rolling the dice......");
       total=0;
       for(int i=0;i<2;i++) {
           Thread.sleep(2000);

           int dice = random.nextInt(1, 7);

           switch (dice) {
               case 1 -> System.out.println(d1);
               case 2 -> System.out.println(d2);
               case 3 -> System.out.println(d3);
               case 4 -> System.out.println(d4);
               case 5 -> System.out.println(d5);
               default -> System.out.println(d6);
           }

           total += dice;

       }
       switch (choice) {
           case 1:
               if (total<8){
                   System.out.println("Congratulation !!!! you won the game \n Your got double amount i.e. "+(2*amount));
                   tot+=2*amount;
               }
               else{
                   System.out.println("You loose the game");
                   tot-=amount;
               }
               break;
           case 2:
               if (total==8){
                   System.out.println("Congratulation !!!! you won the game \n Your got Triple amount i.e. "+(3*amount));
                   tot+=3*amount;
               }
               else{
                   System.out.println("You loose the game");
                   tot-=amount;
               }
               break;
           case 3:
               if (total>8){
                   System.out.println("Congratulation !!!! you won the game \n Your got double amount i.e. "+(2*amount));
                   tot+=2*amount;
               }
               else{
                   System.out.println("You loose the game");
                   tot-=amount;
               }
               break;
           default:
               System.out.println("Invalid choice.");
               break;
       }
       System.out.println("Do you still want to play the game:");
        option = scanner.next();
   }while(option.equalsIgnoreCase("yes"));
     System.out.println("Now your total amount is :"+tot);
    }
}
