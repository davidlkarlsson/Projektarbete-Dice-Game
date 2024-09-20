package se.david.DiceGame;

import java.util.Random;
import java.util.Scanner;


public class Utils {

    Random random = new Random();

    Scanner scanner = new Scanner(System.in);

    //METOD FÖR ATT SKAPA FÖRDRÖJNING I OUTPUT.

    public void delay() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //METOD FÖR ATT KASTA TÄRNING OCH SEDAN SPARA DATAN I PLAYERSCORE I MAIN-METODEN

    public int rollDice(String playerName) {

        System.out.println("\n" + playerName + ", get ready!\n*****PRESS ENTER TO ROLL YOUR FIRST DICE*****");

        scanner.nextLine();

        int roll1 = random.nextInt(6) + 1;

        System.out.println("Your first roll was a " + roll1 + ".");

        System.out.println("*****PRESS ENTER TO ROLL YOUR SECOND DICE*****");

        scanner.nextLine();

        int roll2 = random.nextInt(6) + 1;

        System.out.println("and your second roll was a " + roll2 + ".\n");

        int sum = roll1 + roll2;
        return sum;
    }
}
