import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        int pointNum = crapsRoll;
        int die3 = rnd.nextInt(6) + 1;
        int die4 = rnd.nextInt(6) + 1;
        int roll2 = die3 + die4;

        if (crapsRoll == 3 || crapsRoll == 2 || crapsRoll == 12)
        {
            System.out.println("Awe crap! You rolled craps! " + crapsRoll + " Would you like to play again?");
        }
        else if (crapsRoll == 7 || crapsRoll == 11)
        {
            System.out.println("You rolled a neutral! " + crapsRoll + " Would you Like to play again?");
        }
        else
        {
            {
                System.out.println("You rolled a point number of " + crapsRoll);
            }


        while (roll2 != 7 && roll2 != pointNum)
        {
            die3 = rnd.nextInt(6) + 1;
            die4 = rnd.nextInt(6) + 1;
            roll2 = die3 + die4;

            if (pointNum == roll2) {
                System.out.println("You have a lucky hand! You rolled a " + roll2 + " again You Win! ");
                System.out.println("Would you like to play again?");
            }
            else if (roll2 == 7)
            {
                System.out.println("You rolled a 7. You lose :(");
                System.out.println("Would you like to play again?");
            }
        }
        }
      }

}



