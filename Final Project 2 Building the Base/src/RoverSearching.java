import java.util.Scanner;
import java.util.Random;


public class RoverSearching
{

    public RoverSearching()
    {

        // Create Random number.
        Random Quadrant = new Random();
        // Establish that the quadrant is whatever the random number generator generated.
        int CorrectQuadrant = Quadrant.nextInt(21);
        // Number of attempts from user.
        int Attempts = 0;

        // Collect user input on number picking.
        Scanner UserInput = new Scanner(System.in);
        int Guess;

        // Boolean variable to keep looping the rover search until user finds it.
        boolean win = false;

        // While loop for continuous guessing until user gets it right.
        while (win ==false)
        {
            // Rover searching introduction.
            System.out.println("* Captain we need you to find the rover, we seem to have lost it. *");
            System.out.println("* We are sure that the rover is within quadrant one through 21. *");
            System.out.println("* We need you to guess a number for us to ping the rover's location. *");
            System.out.println("Guess a quadrant 1 through 21: ");
            Guess = UserInput.nextInt();
            System.out.println(" [SENDING OUT PING]...");
            // Increment number of attempts by user.
            Attempts++;

            // User has correctly guessed the rover location.
            if (Guess == CorrectQuadrant)
            {
                win = true;
            }
            // Give the user a hint (There guess was too high).
            else if(Guess < CorrectQuadrant)
            {
                System.out.println("Your guess is too low.");
            }
            // Give the user a hint (There guess was too low).
            else if(Guess > CorrectQuadrant)
            {
                System.out.println("Your guess is too high");
            }
        }

        // Display the user information and that they found the rover.
        System.out.println("* You have found the rover. *");
        System.out.println("The quadrant location of the rover was: " + CorrectQuadrant);
        System.out.println("Number of Attempts: " + Attempts);
    }



}
