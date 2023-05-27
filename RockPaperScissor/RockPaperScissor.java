package RockPaperScissor;
import java.util.Scanner;
import java.util.*;
//import java.io.*;

public class RockPaperScissor {
    public static void main(String[] args){
        

        Scanner scanner = new Scanner(System.in);

        while(true){

            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            
            String playerMove;

            while(true){
                System.out.println("Please enter your move (r, p or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")){
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)){
                System.out.println("It was a tie!");
            }
            else if (playerMove.equals("r")){
                if (computerMove.equals("p")){
                    System.out.println("You lose!");
                } else if (computerMove.equals("s")){
                    System.out.println("You win!");
                }
            }

            else if (playerMove.equals("s")){
                if (computerMove.equals("p")){
                    System.out.println("You Win!");
                } else if (computerMove.equals("r")){
                    System.out.println("You Lose!");
                }
            }

            else if (playerMove.equals("p")){
                if (computerMove.equals("s")){
                    System.out.println("You lose");
                } else if (computerMove.equals("r")){
                    System.out.println("You win!");
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")){
                break;
            }
            
            scanner.close();

        }


            





    }


}