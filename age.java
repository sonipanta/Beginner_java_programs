import java.util.Scanner;

public class age{
    public static void main(String[] args){
      boolean isstudent=true;

     Scanner scanner=new Scanner(System.in);

        String name=scanner.nextLine();
        scanner.nextLine();   //you can use this as a flushhstdin if you scan string right after int
        if(isstudent){
            System.out.println("hello  "+name+"which faculty you are reading");
        }
        else {
            System.out.println("hello  "+name+"which job you are doing");
        }
        System.out.print("Enter your birth_date:");
      int birthdate=scanner.nextInt();
        System.out.print("Enter the current_date:");

      int currentdate=scanner.nextInt();
      scanner.close();
      int age=currentdate-birthdate;
        if(birthdate>=2013 && birthdate<=2025){
            System.out.print("Your age is "+age+"You are GenAlpha");
        }
        else if(birthdate>=1997 && birthdate<=2012){
            System.out.print("Your age is "+age+"You are GenZ");
        }
        else if(birthdate>=1981 && birthdate<=1996){
            System.out.print("Your age is "+age+"You are Millennials");
        }
        else if(birthdate>=1965 && birthdate<=1980){
            System.out.print("Your age is "+age+"You are GenX");

        }
        else{
            System.out.println("you are baby boomers.");
        }
        if(age>=18){
            System.out.println("you are eligible for vote.");
        }
        else{
            System.out.println("you will be  eligible for vote in "+(18-age)+"years.");
        }
    }
}