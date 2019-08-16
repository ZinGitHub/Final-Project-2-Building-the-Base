import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Cafeteria
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;
    public int NS;
    public int NT;

    // Cafeteria constructor.
    public Cafeteria(String Name, String Color, int EntryCode, int Temperature, int NumberOfStations, int NumberOfTables)
    {
        // Variables correlating to the proper parameters.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperature;
        NS = NumberOfStations;
        NT = NumberOfTables;
    }

    // CafeteriaWaterSystem() method.
    static void CafeteriaWaterSystem()
    {
        Scanner userWaterInput = new Scanner(System.in);
        // Declared variables.
        String Water;
        String yesWater = "yes";
        String noWater = "no";

        // Collect user input.
        System.out.println("Do you want to turn on the cafeteria water: ");
        Water = userWaterInput.nextLine();

        // While statement to keep asking user if they want the water off or on.
        while (Water.equals(yesWater))
        {
            // Turn on water if user types yes.
            if (Water.equals(yesWater))
            {
                System.out.println("* Turning on water... * ");
                // User input to keep water running.
                System.out.println("Do you want to continue running water in the cafeteria: ");
                Water = userWaterInput.nextLine();

                // Turn off water.
                if (Water.equals(noWater))
                {
                    System.out.println("* Water turning off... *");
                }
            }
        }
    }

    // CafeteriaStatusSystem() method.
    static void CafeteriaStatusSystem()
    {
        Scanner userCafeteriaStatusInput = new Scanner(System.in);
        // Declared variables.
        Boolean CafeteriaAvailable = false;
        String Cafeteria;
        String yesCafeteria = "yes";
        String noCafeteria = "no";

        System.out.println("\nIs the cafeteria available: " + CafeteriaAvailable);

        // User input if they want to open cafeteria.
        System.out.println("Do you want to open the cafeteria: ");
        Cafeteria = userCafeteriaStatusInput.nextLine();

        // While statement to keep asking user if they want open cafeteria.
        while (Cafeteria.equals(yesCafeteria))
        {
            // Open cafeteria.
            if (Cafeteria.equals(yesCafeteria))
            {
                CafeteriaAvailable = true;
                System.out.println("* Opening the cafeteria * ");
                System.out.println("Is the cafeteria available: " + CafeteriaAvailable);

                // User input on whether they want to still open or close cafeteria.
                System.out.println("Do you want to continue having the cafeteria open: ");
                Cafeteria = userCafeteriaStatusInput.nextLine();

                // Close cafeteria
                if (Cafeteria.equals(noCafeteria))
                {
                    System.out.println("* Closing the cafeteria *");
                }
            }
        }
    }

    // CafeteriaMealAndCleanSystem() method.
    static void CafeteriaMealAndCleanSystem()
    {
        Scanner userCafeteriaCleanInput = new Scanner(System.in);
        Scanner userCafeteriaMealInput = new Scanner(System.in);
        // Declared variables.
        Boolean CafeteriaCleanOrDirty;
        String CafeteriaMeal;
        String yesCafeteriaMeal = "yes";
        String noCafeteriaMeal = "no";
        String CafeteriaClean;
        String yesCafeteriaClean = "yes";
        String noCafeteriaClean = "no";

        // User input on whether they want a meal
        System.out.println("\nWould you like a meal prepared: ");
        CafeteriaMeal = userCafeteriaMealInput.nextLine();

        // While statement if user types yes.
        while (CafeteriaMeal.equals(yesCafeteriaMeal))
        {
            // Prepare meal.
            if (CafeteriaMeal.equals(yesCafeteriaMeal))
            {
                CafeteriaCleanOrDirty = false;
                System.out.println("* Turning on Cook Bot * ");
                System.out.println("* Preparing meal... * ");
                System.out.println("* Meal is ready * ");

                // User input if they want another meal.
                System.out.println("Would you like another meal prepared: ");
                CafeteriaMeal = userCafeteriaMealInput.nextLine();

                // Tell user that cafeteria is closed.
                System.out.println("Is the cafeteria clean: " + CafeteriaCleanOrDirty);

                // Ask user if they want to clean cafeteria.
                System.out.println("Would you like to send Cleaning bot now: ");
                CafeteriaClean = userCafeteriaCleanInput.nextLine();

                // Clean the cafeteria if user types yes.
                if (CafeteriaClean.equals(yesCafeteriaClean))
                {
                    // Cafeteria clean.
                    CafeteriaCleanOrDirty = true;
                    System.out.println("* Turning on Cleaning Bot * ");
                    System.out.println("* Cleaning cafeteria... * ");
                    System.out.println("Is the cafeteria clean: " + CafeteriaCleanOrDirty);
                }
                // Don't clean cafeteria if user types no.
                if (CafeteriaClean.equals(noCafeteriaClean))
                {
                    // Cafeteria not clean.
                    System.out.println("* Not activating Clean Bot *");
                }

                // No meal prepared if user types no.
                if (CafeteriaMeal.equals(noCafeteriaMeal))
                {
                    System.out.println("* Not activating Cook Bot *");
                }
            }
        }
    }

    // CafeteriaAccess() method.
    static void CafeteriaAccess()
    {
        Scanner userCafeteriaAccessint = new Scanner (System.in);
        Scanner userCafeteriaAccessWord = new Scanner (System.in);
        // Declared public variable
        int CafeteriaAccessnum;
        String CafeteriaAccessWord;
        String yesCafeteriaAccess = "yes";

        // Ask user what they want to access in the cafeteria system.
        System.out.println("Would you like access to the cafeteria system: ");
        CafeteriaAccessWord = userCafeteriaAccessWord.nextLine();

        // Continue the menu until user no longer wants access to the cafeteria system.
        while(CafeteriaAccessWord.equals(yesCafeteriaAccess))
        {
            // If user types yes then the cafeteria system menu pops-up.
            if(CafeteriaAccessWord.equals(yesCafeteriaAccess))
            {
                // Cafeteria system menu.
                System.out.println("Which would you like to access: ");
                System.out.println("\t - Type 1 to access the water system in the cafeteria.");
                System.out.println("\t - Type 2 to access the status system in the cafeteria.");
                System.out.println("\t - Type 3 to access the meal and cleaning system in the cafeteria.");
                System.out.println("\t - Type 4 to exit the cafeteria access menu.");
                CafeteriaAccessnum = userCafeteriaAccessint.nextInt(); // Ask user to input a number.

                // Recalling all the cafeteria methods using a switch.
                switch(CafeteriaAccessnum)
                {
                    // User typed 1 and is given access to the cafeteria water system.
                    case 1:
                        Cafeteria.CafeteriaWaterSystem();
                        break;
                    // User typed 2 and is given access to the cafeteria status system.
                    case 2:
                        Cafeteria.CafeteriaStatusSystem();
                        break;
                    // User typed 3 and is given access to the cafeteria meal and cleaning system.
                    case 3:
                        Cafeteria.CafeteriaMealAndCleanSystem();
                        break;
                    // User typed 4 and wants to exit the cafeteria system menu.
                    case 4:
                        return;
                }
            }
        }
    }

    // CafeteriaConstruction() method.
    static void CafeteriaConstruction() throws InterruptedException {
        // Declared variables.
        int min1 = 24;
        int max1 = 48;
        int min2 = 4;
        int max2 = 8;
        int TimeIncrease = 0;

        // Random status percent increase.
        int CafeteriaConstructionStatus = ThreadLocalRandom.current().nextInt(min2,max2+1);

        // Random number between 24 hours to 48 hours.
        int TimeMax  = ThreadLocalRandom.current().nextInt(min1, max1 +1);

        // Set Construction status at zero.
        System.out.println("\t - Current Cafeteria Construction Status: 0%");

        // A while loop that will increase time by 2 hours and the percentage of the construction.
        while(TimeIncrease < TimeMax)
        {
            if(CafeteriaConstructionStatus < 100)
            {
                // Delay the iteration for one second.
                Thread.sleep(1000);
                System.out.println("Current Construction Time Length: " + TimeIncrease + " Hours working on cafeteria....");
                System.out.println("\t - Current Cafeteria Construction Status: " + (CafeteriaConstructionStatus += 6) + "%");

                // Once the loop reaches a specific range set the next iteration to have 100% progress.
                if(CafeteriaConstructionStatus == 94 || CafeteriaConstructionStatus >= 94)
                {
                    System.out.println("\t - Current Cafeteria Construction Status: 100%");
                    break;
                }
            }

            TimeIncrease += 2;
        }
    }
}