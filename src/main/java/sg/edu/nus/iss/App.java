package sg.edu.nus.iss;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] choice = {"scissor", "paper", "stone"};
        Integer computerChoice;
        Integer playerChoice;
        String winner = "";

        Scanner scanner = new Scanner(System.in);

        SPS sps = new SPS();
        computerChoice = sps.generateComputerChoice();

        while (winner.equals("")) {
            System.out.println("Enter '1' for Scissor, '2' for Paper, '3' for Stone: ");
            playerChoice = scanner.nextInt();

            if (!(playerChoice >= 1 && playerChoice <= 3)) {
                System.out.println("Please enter only a number between 1 to 3.");
                continue;
            }

            winner = sps.checkWinner(playerChoice, computerChoice);
            if (winner.equalsIgnoreCase("")) {
                System.out.println("It's a tie");
            }
            else {
                System.out.println("Winner is " + winner);
            }
        }
        

        scanner.close();
    }

}
