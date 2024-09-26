package se.david.DiceGame;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Utils utils = new Utils();



    public static void main(String[] args) {

        //SÄTTER/RESETAR UNDERLINE + EN BALLONG TILL VINNAREN

        String underline = "\u001B[4m";
        String reset = "\u001B[0m";
        String balloon = "\uD83C\uDF88";


        //EN WHILE-LOOP FÖR ATT KUNNA SPELA IGEN
        while (true) {

            //INTRODUKTION TILL SPELET

            utils.printWelcome();


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

            //HÄMTAR RESULTATET FRÅN GETPLAYERSCORE() OCH SKRIVER UT DET.

            System.out.println(underline + "Your result: " + player1.getPlayerScore() + " points" + reset);

            utils.delay();

            player2.setPlayerScore(utils.rollDice(player2.getPlayerName()));

            utils.delay();

            System.out.println(underline + "Your result: " + player2.getPlayerScore() + " points\n" + reset);

            utils.delay();

            //KONTROLLERAR VEM SOM HAR VUNNIT SPELET

            System.out.println(underline + "+++++Game result:+++++" + reset);

            System.out.println(player1.getPlayerName() + ": " + player1.getPlayerScore() + " points");

            System.out.println(player2.getPlayerName() + ": " + player2.getPlayerScore() + " points\n");

            if (player1.getPlayerScore() > player2.getPlayerScore()) {

                System.out.println("+++++" + balloon + player1.getPlayerName() + " wins!" + balloon + "+++++");
            } else {
                System.out.println("+++++" + balloon + player2.getPlayerName() + " wins!" + balloon + "+++++");
            }

            utils.delay();

            //KONTROLLERAR OM DU VILL SPELA IGEN

            while (true) {

                System.out.print("\nDo you want to play again? (y/n)");
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
