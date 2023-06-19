import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10)+1;
        System.out.println("Guess a number between 1 and 10; ");
        int guess = in.nextInt();
        System.out.println("The number choosen was: "+randomNumber);
        if (guess == randomNumber){
            System.out.println("WOW! YOU GUESSED THE RIGHT NUMBER!");}
            else{
            System.out.println("NO! wrong number");
                }
        }
    }
