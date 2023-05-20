import java.util.Scanner;
public class Assignment1RockPaperScissors {
    public static void main(String[] args) {
        String playerOne = "";
        String playerTwo = "";
        boolean done = false;
        String playAgain = "";
        boolean play = true;

        Scanner in = new Scanner(System.in);
        String error = "";
        while (play == true)
        {
            do {
                System.out.println("Player 1 move (R/P/S): ");
                if (in.hasNextLine()) {
                    playerOne = in.nextLine();
                    if (playerOne.equalsIgnoreCase("R" ))
                        done = true;
                    else if (playerOne.equalsIgnoreCase("S" )) {
                        done = true;
                    }
                    else if (playerOne.equalsIgnoreCase("P" )) {
                        done = true;
                    }
                    else
                    {
                        System.out.println("Error in player 1 input.");
                    }
                } else {}
            } while (done == false);

            do {
                System.out.println("Player 2 move (R/P/S): ");
                if (in.hasNextLine()) {
                    playerTwo = in.nextLine();
                    if (playerTwo.equalsIgnoreCase("R" ))
                        done = true;
                    else if (playerTwo.equalsIgnoreCase("S" )) {
                        done = true;
                    }
                    else if (playerTwo.equalsIgnoreCase("P" )) {
                        done = true;
                    }
                    else
                    {
                        System.out.println("Error in player 2 input.");
                        done = false;
                    }
                } else {}
            } while (done == false);

            if (playerOne.equalsIgnoreCase("R")) {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("R X R is a tie.");
                } else if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("R X S player 1 wins.");
                } else if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("R X P player 2 wins.");
                }
                else
                {
                    System.out.println("Player 1 has Rock. Player 2 input is an error.");
                }

            } else if (playerOne.equalsIgnoreCase("P")) {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("P X R player 1 wins.");
                } else if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("P X S player 2 wins.");
                } else if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("P X P is a tie.");
                }
                else
                {
                    System.out.println("Player 1 has Paper. Player 2 input is an error.");
                }
            } else if (playerOne.equalsIgnoreCase("S"))
            {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("S X R player 2 wins.");
                } else if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("S X S it is a tie.");
                } else if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("S X P Player 1 wins.");
                }
                else
                {
                    System.out.println("Player 1 has Rock. Player 2 input is an error.");
                }
            }
            else
            {
                System.out.println("Error in player 1 input.");
            }
            System.out.println("Play again?(Y/N): ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y"))
            {
                play = true;
            }
            else
            {
                play = false;
            }
        }

    }
}


