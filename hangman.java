import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("word.txt"))) {
            System.out.println("File Found:");
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
        } catch (IOException e) {
            System.out.println("Something went wrong !!");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        System.out.println(word);


        Scanner scanner = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Welcome to Hangman game. ");
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvv");

        int wrongguess = 0;
        ArrayList<Character> wordlist = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordlist.add('_');
        }
        while (wrongguess < 6) {
            System.out.println(hangmen(wrongguess));
            System.out.print("Word:");
            for (char c : wordlist) {
                System.out.print(c + " ");
            }

            System.out.println();
            System.out.println("Enter your Guess:");
            char guess = scanner.next().toLowerCase().charAt(0);


            if (word.indexOf(guess) >= 0) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordlist.set(i, guess);
                    }
                }
                if (!wordlist.contains('_')) {
                    System.out.println(hangmen(wrongguess));
                    System.out.println("YOU WINNN ");
                    break;
                }
            } else {
                wrongguess++;
                System.out.println("Wrong Guess");

            }
        }



        if(wrongguess>=6){
            System.out.println("GAME OVER!!!");
            System.out.println(hangmen(wrongguess));
            System.out.println("The word was:"+word);
        }
    }

    static String hangmen(int wrongguess){
        return switch(wrongguess){
            case 0-> """
                            _______
                               
                            """;

            case 1-> """
                            _______
                               |
                               0
                            """;

            case 2-> """
                            _______
                               |
                               0
                              / 
                        
                            """;

            case 3-> """
                            _______
                               |
                               0
                              /  \\
                        
                            """;

            case 4-> """
                            _______
                               |
                               0
                              /|\\
                        
                            """;

            case 5-> """
                            _______
                               |
                               0
                              /|\\
                              /
                            """;

            case 6->"""
                            _______
                               |
                               0
                              /|\\
                              / \\
                            """;
             default->" ";


        };
    }



    }
