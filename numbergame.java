import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tot_attempt = 0;
        int win = 0;
        while (true) {
            System.out.println("Enter the minimum number:");
            int min = s.nextInt();
            System.out.println("Enter the maximum number:");
            int max = s.nextInt();
            s.nextLine();
            // Generate a random number within the range [min, max]
            int c = (int) (Math.random() * (max - min + 1) + min);
            int a = 0;
            while (true) {
                System.out.println("Guess a number between " + min + " and " + max);
                int num = s.nextInt();
                a++;
                if (num > c) {
                    System.out.println("It's Greater");
                } else if (num < c) {
                    System.out.println("It's Lower");
                } else {
                    System.out.println("Correct guess");
                    win++;
                    break;
                }
            }

            tot_attempt += a; 
            System.out.println("Attempts = " + a);
            System.out.println("Wins = " + win);

            // Calculate and display the win rate
            double winrate = (double) win / tot_attempt * 100;
            System.out.printf("Your winrate is %.2f%%\n", winrate);

            System.out.println("Do you want to play again (y / n)");
            String playagain = s.next();

            if (!playagain.equalsIgnoreCase("y")) {
                s.close();
                System.exit(0);
            }
            s.nextLine();
        }
    }
}
