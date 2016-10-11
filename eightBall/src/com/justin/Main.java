package com.justin;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        shakeTheBall();
    }


    public static int getRandomNumber () {
        Random rand = new Random();
        return  rand.nextInt(9);
    }

    public static void shakeTheBall () {
        System.out.println("What is your question?");
        input.nextLine();
        countdown();
        System.out.println(response());
        askAgain();
    }
    public static String response () {

        String fortune = "Something has gone horribly wrong";

        switch (getRandomNumber()) {
            case 0: fortune = "It is certain";
                break;
            case 1: fortune = "It is decidedly so";
                break;
            case 2: fortune = "Without a doubt";
                break;
            case 3: fortune = "Yes, definitely";
                break;
            case 4: fortune = "Ask again later";
                break;
            case 5: fortune = "Better not tell you now";
                break;
            case 6: fortune = "Don't count on it";
                break;
            case 7: fortune = "My sources say no";
                break;
            case 8: fortune = "Outlook not so good";
                break;
        }

        return fortune;
    }

    public static void countdown() {
        for (int i = 0; i < 9; i++) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            }
    }

    public static void askAgain() {
        System.out.println("Ask another question?");
        String again = input.nextLine();
        again = again.replace(" ","");

        if (again.equalsIgnoreCase("yes")) {
            System.out.print("So be it. ");
            shakeTheBall();
        }

        else if (again.equalsIgnoreCase("no")){
            System.out.println("As you wish");
            System.exit(0);
        }

        else {
            System.out.println("I don't understand");
            askAgain();
        }
    }
}
