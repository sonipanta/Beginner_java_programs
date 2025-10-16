import java.util.Scanner;
public class Bank {
    double balance ;


    public static void main(String[] args){
        double amount;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to our Bank ");
        System.out.println("How can i help you? ");
        scanner.nextLine();
        System.out.println("**********Menu**************  ");
        System.out.println("1. Deposit\t 2. Withdraw\t 3. Transfer Amount\t  ");
        int choice=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your Account name: ");
        String accname=scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter your Account number: ");
        String accno=scanner.next();
        scanner.nextLine();
        System.out.print("Enter your Current balance: ");
        double balance=scanner.nextDouble();
        if(balance<0){
            System.out.println("Invalid Amount");
            System.exit(1);
        }
        switch(choice){
            case 1:
                System.out.print("Enter the amount you want to deposit: ");
                 amount=scanner.nextDouble();
                deposit(balance,amount);
                break;
            case 2:
                System.out.print("Enter the amount you want to withdraw: ");
                amount=scanner.nextDouble();
                withdraw(balance,amount);
                break;
            case 3:

                System.out.print("Enter the amount you want to send : ");
                 amount=scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter the another Account name: ");
                String name=scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter the another  Account number : ");
                String account=scanner.next();
                System.out.print("Transfer sucessfully\n ");
                withdraw(balance,amount);
                break;
            default:
                System.out.println("Enter a right choice:");
                break;
        }


    }
    static void deposit(double balance,double amount){
        balance+=amount;
        System.out.println("Your current balance is "+balance);

    }
    static void withdraw(double balance,double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Your current balance is " + balance);
        } else {
            System.out.println("Insufficient amount ");
        }
    }
}
