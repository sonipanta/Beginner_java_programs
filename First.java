import java.util.Scanner;
public class First{
    public static void main(String[] args){
      
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email=scanner.nextLine();
        if(email.isEmpty()){
            System.out.println("Email address cant be empty");

        }
        else if(email.contains(" ")){
            System.out.println("Email address must not contain space");

        }
        else if(!email.contains(".")){
            System.out.println("Email address must contain atleast one '.'");

        }
        else if(!email.contains("@")){
            System.out.println("Email address must contain @");
            
        }
        else{
            System.out.println("Username:"+email.substring(0,email.indexOf("@")));
            System.out.println("Domain:"+email.substring(email.indexOf("@")+1));
        }

    }
}