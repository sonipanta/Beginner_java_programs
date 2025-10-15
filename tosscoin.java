import java.util.Scanner;
import java.util.Random;
public class tosscoin{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Which player will gonna choose HEAD(A/B):");
        String x=scanner.next();
        System.out.println("Player "+x+" has choosen HEAD and Another player will ultimately have TAIL  ");
        Random random=new Random();
        boolean ishead;
        ishead= random.nextBoolean();;
        if(ishead){
            System.out.println("OHHHHH ,You got HEAD ...Player "+x+"...........YOU WON .............");

        }
        else{
            System.out.println("OHHHH NOO  , You got TAIL.....Player "+x+".......YOU LOOSE.......");
        }
    }
}
