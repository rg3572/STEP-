import java.util.*;

class Main1 {
    static String playRound(String p, String c) {
        if (p.equals(c)) return "Draw";
        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper")))
            return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random r = new Random();
        int w = 0, l = 0, d = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter move: ");
            String p = sc.next();
            String c = moves[r.nextInt(3)];

            String result = playRound(p, c);
            System.out.println("Computer: " + c);
            System.out.println(result);

            if (result.equals("Player Wins")) w++;
            else if (result.equals("Computer Wins")) l++;
            else d++;
        }

        System.out.println("Wins: " + w);
        System.out.println("Losses: " + l);
        System.out.println("Draws: " + d);
        System.out.println("Win %: " + (w / 5.0 * 100));
    }
}