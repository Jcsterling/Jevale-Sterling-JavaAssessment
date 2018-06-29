import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Compass c = new Compass();
        int distanceToGoal = 7000;
        boolean gamePlay = false;

        System.out.println("You're in a baron wasteland.... or are you?");

        while (c.getPlayerDisplacement() <= distanceToGoal) {

            Scanner sca = new Scanner(System.in);
            System.out.println("Choose a direction to find you way out: N/E/S/W\nPress J to show your journey so far");
            char input = sca.next().charAt(0);
            switch (input) {
                case 'n':
                    System.out.println("Journey time: 2 days\nHint: Winter is coming ;)\n\nSelect a fruit\ntype it in:");
                    String fruit = sca.next();

                    North n = new North(fruit);
                    c.distanceFromTreasur(n);
                    c.addDirection(n);

                    System.out.println(n);
                    break;
                case 'N':
                    System.out.println("Journey time: 2 days\nHint: Winter is coming ;)\n\nSelect a fruit\ntype it in: ");
                    String fruits = sca.next();

                    North n1 = new North(fruits);
                    c.distanceFromTreasur(n1);
                    c.addDirection(n1);

                    System.out.println(n1);
                    break;
                case 'e':
                    System.out.println("Journey time: 18 hours\nHint: its all gone a bit left :/\n\nWhat is your heart beat per minute right now\nenter number: ");
                    int heartBeat = sca.nextInt();

                    East e = new East(heartBeat);
                    c.distanceFromTreasur(e);
                    c.addDirection(e);

                    System.out.println(e);
                    break;
                case 'E':
                    System.out.println("Journey time: 18 hours\nHint: its all gone a bit left :/\n\nWhat is your heart beat per minute right now\nenter number: ");
                    int heartBeatS = sca.nextInt();

                    East e1 = new East(heartBeatS);
                    c.distanceFromTreasur(e1);
                    c.addDirection(e1);

                    System.out.println(e1);
                    break;
                case 's':
                    System.out.println("Journey time: 6 days\nHint: yeah you fu***d up bad :o:\n\nChoose you weapon\ntype it in: ");
                    String Weapon = sca.next();

                    South s = new South(Weapon);
                    c.distanceFromTreasur(s);
                    c.addDirection(s);

                    System.out.println(s);
                    break;
                case 'S':
                    System.out.println("Journey time: 6 days\nHint: yeah you fu***d up bad :o:\n\nChoose you weapon\ntype it in: ");
                    String Weapon1 = sca.next();

                    South s1 = new South(Weapon1);
                    c.distanceFromTreasur(s1);
                    c.addDirection(s1);

                    System.out.println(s1);
                    break;
                case 'w':
                    System.out.println("Journey time: 12 hours\nHint: you aren't moving much, like a sloth :) :/\n\nyou see an inn and take a nap\nhow many hours sleep did you get?\nenter number:  ");
                    int restTime = sca.nextInt();

                    West w = new West(restTime);
                    c.distanceFromTreasur(w);
                    c.addDirection(w);

                    System.out.println(w);
                    break;

                case 'W':
                    System.out.println("Journey time: 12 hours\nHint: you aren't moving much, like a sloth :) :/\n\nyou see an inn and take a nap\nhow many hours sleep did you get?\nenter number: ");
                    int restTime1 = sca.nextInt();

                    West w1 = new West(restTime1);
                    c.distanceFromTreasur(w1);
                    c.addDirection(w1);

                    System.out.println(w1);
                    break;
                case 'J':

                    c.displayJourney();
                    break;


            }
            System.out.println(gameConditions(c));
        }






    }




    public static String gameConditions(Compass c){

        int distanceToGoal = 7000;


        if (c.getPlayerDisplacement() == distanceToGoal){
            return "You beat the game!";
        }else{
            return "distance from goal is: " + (distanceToGoal- c.getPlayerDisplacement()) + "M";

        }














    }

}
