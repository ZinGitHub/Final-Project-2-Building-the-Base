
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Storage
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;
    public int CA;


    // Storage constructor.
    public Storage(String Name, String Color, int EntryCode, int Temperature, int Capacity)
    {
        // Variables correlating to the proper parameters.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperature;
        CA = Capacity;
    }

    // Humidity() method.
    static void Humidity()
    {
        Scanner userHumidityChangeInput = new Scanner(System.in);
        Scanner userHumidityInput = new Scanner(System.in);
        Scanner userHumidityNumber = new Scanner(System.in);
        // Declared variables.
        int CurrentHumidity = 60;
        int HumidityNumberChange;
        String Humidity;
        String HumidityChange;
        String yesChangeHumidity = "yes";

        // Show user current humidity.
        System.out.println("\t - Current Humidity: " + CurrentHumidity + "%");

        // Ask user if they want to change the humidity.
        System.out.println("Would you like to change the humidity: ");
        Humidity = userHumidityInput.nextLine();

        // Continue to ask user to change humidity until they don't.
        while(Humidity.equals(yesChangeHumidity))
        {
            // User wanted to change humidity.
            if (Humidity.equals(yesChangeHumidity))
            {
                // Ask user if they want to increase or decrease humidity.
                System.out.println(" * Type exit to not change the humidity * ");
                System.out.println("Would you like to increase or decrease the humidity: ");
                HumidityChange = userHumidityChangeInput.nextLine();

                // Switch to create a multitude of scenarios.
                switch(HumidityChange)
                {
                    // User typed increase and wants to increase the humidity.
                    case "increase":
                        // Ask user how much of an increase.
                        System.out.println("By how much would you like to increase humidity: ");
                        HumidityNumberChange = userHumidityNumber.nextInt();

                        // If user types a number less than 100 then humidity changes.
                        if(HumidityNumberChange < 100)
                        {
                            System.out.println(" * Increasing humidity * ");
                            // New humidity value.
                            System.out.println("\t - Current Humidity: " + (CurrentHumidity + HumidityNumberChange) + "%");
                        }
                        // User entered a umber less than 100 so no humidity change.
                        else
                        {
                            System.out.println(" * You have inputted an illogical number * ");
                        }
                        break;
                    // User typed decrease and wants to decrease the humidity.
                    case "decrease":
                        // Ask user how much of a decrease.
                        System.out.println("By how much would you like to decrease humidity: ");
                        HumidityNumberChange = userHumidityNumber.nextInt();

                        // If user types a number less than 100 then humidity changes.
                        if(HumidityNumberChange < 100)
                        {
                            System.out.println(" * Decreasing humidity * ");
                            // New humidity value.
                            System.out.println("\t - Current Humidity: " + (CurrentHumidity - HumidityNumberChange) + "%");
                        }
                        // User entered a umber less than 100 so no humidity change.
                        else
                        {
                            System.out.println(" * You have inputted an illogical number * ");
                        }
                        break;
                    // User does not want to adjust the humidity.
                    case "exit":
                        System.out.println("* Not changing humidity *");
                        return;
                }

            }

        }

    }

    // StorageConstruction() method.
    static void StorageConstruction() throws InterruptedException {
        // Declared variables.
        int min1 = 24;
        int max1 = 48;
        int min2 = 4;
        int max2 = 8;
        int TimeIncrease = 0;

        // Random status percent increase.
        int StorageConstructionStatus = ThreadLocalRandom.current().nextInt(min2,max2+1);

        // Random number between 24 hours to 48 hours.
        int TimeMax = ThreadLocalRandom.current().nextInt(min1, max1 +1);

        // Set Construction status at zero.
        System.out.println("\t - Current Storage Construction Status: 0%");

        // A while loop that will increase time by 2 hours and the percentage of the construction.
        while(TimeIncrease < TimeMax)
        {
            if(StorageConstructionStatus < 100)
            {
                // Delay the iteration for one second.
                Thread.sleep(1000);
                System.out.println("Current Construction Time Length: " + TimeIncrease + " Hours working on storage....");
                System.out.println("\t - Current Storage Construction Status: " + (StorageConstructionStatus += 6) + "%");

                // Once the loop reaches a specific range set the next iteration to have 100% progress.
                if(StorageConstructionStatus == 94 || StorageConstructionStatus >= 94)
                {
                    System.out.println("\t - Current Storage Construction Status: 100%");
                    break;
                }
            }

            TimeIncrease += 2;
        }
    }
}