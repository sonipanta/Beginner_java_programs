public class snack{

 public static void main(String[] args){
 Scanner scanner =new Scanner(System.in);
        String ans;
        int pizza=0;
        int burger=0;
        int momo=0;
        int small=450;
        int medium=650;
        int large=1150;
        int veg=120;
        int buff=150;
        int chicken=180;
        int regular=200;
        int ham=230;
        int crispy=270;
        int total=0;
        System.out.println("Enter your gender(M/F):");
        String gender=scanner.next();
        if(gender.equals("M")||gender.equals("m")) {
            System.out.println("Hello sir how can i help you?");
        }
        else {
            System.out.println("Hello maam how can i help you?");
        }
        scanner.nextLine();
        String food=scanner.nextLine();
        System.out.println("Here is the menu...");
        scanner.nextLine();
        System.out.println("Burger:\n regular burger:Rs 200\t ham burger:Rs230\t crispy chicken burger:Rs270\n\n Momo:\n buff:RS150\t veg:Rs120\t chicken:Rs180\n\n Pizza:\n small:Rs450\t medium:Rs650\t large:Rs1150\n" );
        do {
            System.out.println(" what  snack do you want ?");
            String snack = scanner.nextLine();
            scanner.nextLine();
            if(snack.equals("pizza")){

                scanner.nextLine();
                System.out.println("Which size?");
                String size = scanner.nextLine();
                scanner.nextLine();
                if(size.equals("large")){
                    total+=large;
                }
                else if(size.equals("medium")){
                    total+=medium;
                }
                else{
                    total+=small;
                }
                pizza++;
            }
            else if(snack.equals("burger")){

                scanner.nextLine();
                System.out.println("Which one?");
                String size = scanner.nextLine();
                scanner.nextLine();
                if(size.equals("ham burger")){
                    total+=ham;
                }
                else if(size.equals("crispy chicken burger")){
                    total+=crispy;
                }
                else{
                    total+=regular;
                }
                burger++;
            }
            else if(snack.equals("momo")){

                scanner.nextLine();
                System.out.println("Which one?");
                String size = scanner.nextLine();
                scanner.nextLine();
                if(size.equals("veg")){
                    total+=veg;
                }
                else if(size.equals("buff")){
                    total+=buff;
                }
                else{
                    total+=chicken;
                }
                momo++;
            }
            else {


                System.out.println("Sorry ... we dont have this in our menu.");
                System.exit(1);
            }
                System.out.println("Do you like to order anything..(yes/no)");
                              ans = scanner.nextLine();
            scanner.nextLine();





        }while(ans.equals("yes"));
        System.out.println("You have ordered"+pizza+" pizza,"+burger+" burger and "+momo+"plate momo.");
        System.out.println("so  the total amount is "+total );
        System.out.println("Thanks for coming(^v^)\n Have a good day(^!^)" );
        }
        }