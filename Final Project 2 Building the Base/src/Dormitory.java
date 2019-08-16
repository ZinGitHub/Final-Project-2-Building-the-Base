import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dormitory
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;
    public int NB;
    public int NL;
    public int NS;

    // Dormitory constructor.
    public Dormitory(String Name, String Color, int EntryCode, int Temperture, int NumberOfBeds, int NumberOfLavatories, int NumberOfShowers)
    {
        // Variables correlating to the proper parameters.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperture;
        NB = NumberOfBeds;
        NL = NumberOfLavatories;
        NS = NumberOfShowers;
    }

    // DormitoryWaterSystem() method.
    static void DormitoryWaterSystem()
    {
        Scanner userInput = new Scanner(System.in);
        // Declared variables.
        String Water;
        String yes = "yes";
        String no = "no";

        // Ask user if they want to turn on the water.
        System.out.println("Do you want to turn on the dormitory water: ");
        Water = userInput.nextLine();

        // Continue to ask user if they want to trn on water until they don't.
        while(Water.equals(yes))
        {
            // User has turned on the water.
            if (Water.equals(yes))
            {
                System.out.println("* Turning on water... * ");

                // Ask user if they want to continue running water.
                System.out.println("Do you want to continue running water in the dormitory: ");
                Water = userInput.nextLine();

                // User no longer wants to run water.
                if(Water.equals(no))
                {
                    System.out.println("* Water turning off... *");
                }
            }
        }
    }

    // DormitoryConstruction() method.
    static void DormitoryConstruction() throws InterruptedException {
        // Declared variables.
        int min1 = 24;
        int max1 = 48;
        int min2 = 4;
        int max2 = 8;
        int TimeIncrease = 0;

        // Random status percent increase.
        int DormitoryConstructionStatus = ThreadLocalRandom.current().nextInt(min2,max2+1);

        // Random number between 24 hours to 48 hours.
        int TimeMax = ThreadLocalRandom.current().nextInt(min1, max1 +1);

        // Set Construction status at zero.
        System.out.println("\t - Current Dormitory Construction Status: 0%");

        // A while loop that will increase time by 2 hours and the percentage of the construction.
        while(TimeIncrease < TimeMax)
        {
            if(DormitoryConstructionStatus < 100)
            {
                // Delay the iteration for one second.
                Thread.sleep(1000);
                System.out.println("Current Construction Time Length: " + TimeIncrease + " Hours working on dormitory....");
                System.out.println("\t - Current Dormitory Construction Status: " + (DormitoryConstructionStatus += 6) + "%");

                // Once the loop reaches a specific range set the next iteration to have 100% progress.
                if(DormitoryConstructionStatus == 94 || DormitoryConstructionStatus >= 94)
                {
                    System.out.println("\t - Current Dormitory Construction Status: 100%");
                    break;
                }
            }

            TimeIncrease += 2;
        }
    }
}