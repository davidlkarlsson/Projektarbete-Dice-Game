package se.david.DiceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();

        //EN WHILE-LOOP FÖR ATT KUNNA SPELA IGEN
        while (true) {

            //INTRODUKTION TILL SPELET

            System.out.println("++++++++Welcome to the Dice Game++++++++\n");

            utils.delay();

            //INPUT AV SPELARNAMN

            System.out.print("Player 1, input your name: ");
            Players player1 = new Players(scanner.nextLine());

            utils.delay();

            System.out.print("Player 2, input your name: ");
            Players player2 = new Players(scanner.nextLine());


            utils.delay();

            //SKRIVER UT VILKA SOM SPELAR

            System.out.println("\nPlayer1: " + player1.getPlayerName() + "\n" + "Player2: " + player2.getPlayerName());

            utils.delay();

            //I SET-METODENS PARAMETER FINNS ETT METODANROP UTILS.ROLLDICE() SOM KÖRS OCH RETURNERAR ETT VÄRDE I SETPLAYERSCORE()

            player1.setPlayerScore(utils.rollDice(player1.getPlayerName()));

            utils.delay();

            System.out.println("Your result: " + player1.getPlayerScore());

            utils.delay();

            player2.setPlayerScore(utils.rollDice(player2.getPlayerName()));

            utils.delay();

            System.out.println("Your result: " + player2.getPlayerScore());

            utils.delay();

            if (player1.getPlayerScore() > player2.getPlayerScore()) {

                System.out.println("+++++" + player1.getPlayerName() + " wins!+++++");
            } else {
                System.out.println("+++++" + player2.getPlayerName() + " wins!+++++");
            }

            while (true) {

                System.out.println("Do you want to play again? (y/n)");
                String answer = scanner.nextLine().toLowerCase();
                if (answer.equals("y")) {
                    break;


                } else if (answer.equals("n")) {

                    System.out.println("Thanks for playing!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid answer. Try again.");

                }
            }


        }
    }
}
