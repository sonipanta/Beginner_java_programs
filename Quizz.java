import java.util.Scanner;
public class Quizz {
    public static void main(String[] args) {
        String[] question = {"1.What is the name of Shinchan’s little sister?", "2.What is Shinchan’s favorite TV superhero?", "3.What food does Doraemon love the most?", "From which century did Doraemon come to help Nobita?", "What is Nobita’s favorite hobby?"};
        String[][] answer = {{"a.Himawari", "b.Shinko", "c.Nene", "d.Yosinaga"}, {"a.Batman", "b.Power Ranger", "c.Action Ramen", "d.Action Kamen"}, {"a.Shusi", "b.Dumpling", "c.Dora cake", "d.Chocobi"}, {"a.21th century", "b.22th century", "c.20th century", "d.25th century"}, {"a.Study", "b.Sleep", "c.Playing Baseball", "d.playing video games"}};
        char[] correct = {'a', 'd', 'c', 'b', 'c'};

        int score=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to our Quizz Game");

        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            scanner.nextLine();
            for (int j = 0; j < answer[i].length; j++) {

                System.out.println(answer[i][j]);
            }
                System.out.print("Guess:");
                char guess = scanner.next().toLowerCase().charAt(0);
                if (guess==correct[i]) {
                    System.out.println("****Correct****");
                    score++;
                } else {
                    System.out.println("****Wrong****");
                }



        }
        System.out.println("You got "+score+" out of 5");
    }
}
