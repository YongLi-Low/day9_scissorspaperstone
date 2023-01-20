package sg.edu.nus.iss;

import java.util.Random;

public class SPS {
    public Integer generateComputerChoice() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice) {
        
        String winner = "";
        playerChoice -= 1;

        if (playerChoice == computerChoice) {
            System.out.println("Tie");
            return "";
        }

        switch(playerChoice) {
            case 0: // Scissor
            if (computerChoice == 1) {
                winner = "player";
            }
            else {
                winner = "computer";
            }
                break;
            case 1: // Paper
            if (computerChoice == 2) {
                winner = "player";
            }
            else {
                winner = "computer";
            }
                break;
            case 2: //Stone
            if (computerChoice == 0) {
                winner = "player";
            }
            else {
                winner = "computer";
                break;
            }
        }
        return winner;
    }
}
