
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain = "";

        do {
            do {
                System.out.println("Player A, enter your move (R, P, S):");
                playerA = in.nextLine().toUpperCase();
            }while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S"));
            do {
                System.out.println("Player B, enter your move (R, P, S):" );
                playerB = in.nextLine().toUpperCase();
            }while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S"));

            if (playerA.equals(playerB)){
                System.out.println("It's a tie");
            } else if (playerA.equals("R") && playerB.equals("S") || playerA.equals("P") && playerB.equals("R") || playerA.equals("S") && playerB.equals("P")) {
                System.out.println("Player A wins");
            } else {
                System.out.println("Player B wins");
            }
            System.out.println("Do you want to play again? (Y/N)");
            playAgain=in.nextLine().toUpperCase();
        }while (playAgain.equals("Y"));

        System.out.println("Thanks for playing");
        in.close();
    }
}