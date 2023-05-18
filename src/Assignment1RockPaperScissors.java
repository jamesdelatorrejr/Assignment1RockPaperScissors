import java.util.Scanner;
public class Assignment1RockPaperScissors {
    public static void main(String[] args) {
        String playerOne = "";
        String playerTwo = "";
        String playAgain = "Y";
        boolean done = false;

        Scanner in = new Scanner(System.in);
        String error = "";
        do {
            do {
                System.out.println("Player 1 move (R/P/S): ");
                if (in.hasNextLine()) {
                    playerOne = in.nextLine();
                    in.hasNextLine();
                    done = true;
                } else {
                    error = in.nextLine();
                    System.out.println("Error in your input " + error + " Provide a legal move.");
                }
            } while (done == false);


            do {
                System.out.println("Player 2 move (R/P/S): ");
                if (in.hasNextLine()) {
                    playerTwo = in.nextLine();
                    in.hasNextLine();
                    done = true;
                } else {
                    error = in.nextLine();
                    System.out.println("Error in your input " + error + " Provide a legal move.");
                }
            } while (done == false);

            if (playerOne.equalsIgnoreCase("R")) {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("R X R is a tie.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                } else if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("R X S player 1 wins.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                } else {
                    System.out.println("R X P player 2 wins.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                }

            } else if (playerOne.equalsIgnoreCase("P")) {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("P X R player 1 wins.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                } else if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("P X S player 2 wins.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                } else {
                    System.out.println("P X P is a tie.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                }
            } else {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("S X R player 2 wins.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                } else if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("S X S it is a tie.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                } else {
                    System.out.println("S X P Player 1 wins.");
                    System.out.println("Play again?(Y/N): ");
                    playAgain = in.nextLine();
                    in.hasNextLine();
                }
            }
        }
        while (playAgain.equalsIgnoreCase("Y"));
    }
}


