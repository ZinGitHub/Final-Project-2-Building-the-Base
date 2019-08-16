import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CommandCenter
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;

    // Command Center constructor.
    public CommandCenter(String Name, String Color, int EntryCode, int Temperture)
    {
        // Variables correlating to the proper parameter.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperture;
    }

    // CommStatus() method.
    static void CommStatus()
    {
        Scanner userCommandCenterSecurityInput = new Scanner(System.in);
        Scanner userCommandCenterStatusInput = new Scanner (System.in);
        // Declared variables.
        String CommandCenterStatus;
        String yesCommandCenterOpen = "yes";
        int CommandCenterSecurityLevel;
        // Side Note: Captain order number = 501

        // Ask user if they want to open command center.
        System.out.println("Would you like to open the command center: ");
        CommandCenterStatus =  userCommandCenterStatusInput.nextLine();

        // User wants to open the command center.
        if(CommandCenterStatus.equals(yesCommandCenterOpen))
        {
            // Ask user for the captain order number.
            System.out.println("Please enter the captain order number: ");
            CommandCenterSecurityLevel = userCommandCenterSecurityInput.nextInt();

            // User put the correct number.
            if(CommandCenterSecurityLevel == 501)
            {
                // Command center opened.
                System.out.println("* [ACCESS GRANTED] * ");
                System.out.println("* Command Center Opened * ");
            }
            // User did not put the correct number.
            else if(CommandCenterSecurityLevel != 501)
            {
                // Command center not opened.
                System.out.println("* [ACCESS DENIED] * ");
            }
        }
    }

    // CommandCenterConstruction() method.
    static void CommandCenterConstruction() throws InterruptedException {
        // Declared variables.
        int min1 = 24;
        int max1 = 48;
        int min2 = 4;
        int max2 = 8;
        int TimeIncrease = 0;

        // Random status percent increase.
        int CafeteriaConstructionStatus = ThreadLocalRandom.current().nextInt(min2,max2+1);

        // Random number between 24 hours to 48 hours.
        int TimeMax = ThreadLocalRandom.current().nextInt(min1, max1 +1);

        // Set Construction status at zero.
        System.out.println("\t - Current Command Center Construction Status: 0%");

        // A while loop that will increase time by 2 hours and the percentage of the construction.
        while(TimeIncrease < TimeMax)
        {
            if(CafeteriaConstructionStatus < 100)
            {
                // Delay the iteration for one second.
                Thread.sleep(1000);
                System.out.println("Current Construction Time Length: " + TimeIncrease + " Hours working on command center....");
                System.out.println("\t - Current Command Center Construction Status: " + (CafeteriaConstructionStatus += 6) + "%");

                // Once the loop reaches a specific range set the next iteration to have 100% progress.
                if(CafeteriaConstructionStatus == 94 || CafeteriaConstructionStatus >= 94)
                {
                    System.out.println("\t - Current Command Center Construction Status: 100%");
                    break;
                }
            }

            TimeIncrease += 2;
        }
    }
}