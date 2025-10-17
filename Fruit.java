import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple", "Watermelon", "Grapes", "Coconut", "Tomato", "Kiwi", "Dragon Fruit"};
        String[] total = new String[20];
        int totalCount = 0;

        System.out.println("Welcome to our Fruit shop!");
        System.out.println("We have 10 fruits in our menu:\nMenu:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }

        String ans;
        scanner.nextLine(); // Clear input buffer

        do {
            System.out.println("Which fruit do you want?");
            String ask = scanner.nextLine();

            boolean found = false;
            for (String fruit : fruits) {
                if (ask.equalsIgnoreCase(fruit)) {
                    found = true;
                    System.out.println("We have this fruit.");
                    if (ask.equalsIgnoreCase("Banana")) {
                        System.out.println("How many dozen do you want?");
                        int n = scanner.nextInt();
                    } else {
                        System.out.println("How many kilograms do you want?");
                        int kg = scanner.nextInt();
                    }
                    scanner.nextLine();
                    total[totalCount++] = ask;
                    break;
                }
            }

            if (!found) {
                System.out.println("Sorry, we don't have this fruit.");
            }

            System.out.println("Do you want anything else? (yes/no)");
            ans = scanner.nextLine();

        } while (ans.equalsIgnoreCase("yes"));

        System.out.print("You have taken: ");
        for (int i = 0; i < totalCount; i++) {
            System.out.print(total[i] + "\t");
        }

        scanner.close();
    }
}
