// Zinedin Bautista
// I estimate this to take me an hour and 45 minutes.
// It took me a little over an hour and 50 minutes.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {

        // Introduction.
        System.out.println("*** Welcome back captain ***\n");
        System.out.println("* This program's purpose is to: *\n");
        System.out.println("\t* Report on the status of the ship. *");
        System.out.println("\t* Report on the status of the crew. *");
        System.out.println("\t* Report on the status of the dormitory. *");
        System.out.println("\t* Report on the status of the cafeteria. *");
        System.out.println("\t* Report on the status of the laboratory. *");
        System.out.println("\t* Report on the status of the command center. *");
        System.out.println("\t* Report on the status of the storage. *");
        // Divider
        System.out.println("-------------------------------------------------");

        System.out.println("* [STATUS REPORT: SPACESHIP] *");

        // Initialized variables for spaceship.
        Spaceship mySpaceship = new Spaceship(5,true,100,"LAAT");

        // Print out status report on the spaceship.
        System.out.println("\t- Ship Model: " + mySpaceship.M);
        System.out.println("\t- Number of Seats: " + mySpaceship.S);
        // If else statement to report if the space drone is available.
        if (mySpaceship.D == true)
        {
            System.out.println("\t- Is Drone Available: Yes");
        }
        else
        {
            System.out.println("\t- Is Drone Available: No");
        }
        System.out.println("\t- Ship Force-Field Capacity: " + mySpaceship.FC + "%");

        // Divider
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: SPACESHIP WEAPONS] *");

        // Initialized variables for ship weapons.
        ShipWeapons myShipWeapons = new ShipWeapons(9000, "Ti-83", true, 9000, true, 9000);

        // Print out status report on the spaceship's weapon.
        System.out.println("\t- Ammunition Rounds: " + myShipWeapons.A + " Available");
        System.out.println("\t- Weapon Model Name: " + myShipWeapons.W);
        // If else statement to report if incendiary rounds are available.
        if(myShipWeapons.I == true)
        {
            System.out.println("\t- Is Incendiary Rounds Available: Yes");
            System.out.println("\t- Incendiary Rounds: " + myShipWeapons.IA + " Available");
        }
        else
        {
            System.out.println("\t- Is Incendiary Rounds Available: No");
        }
        // If else statement to report if explosive rounds are available.
        if(myShipWeapons.E == true)
        {
            System.out.println("\t- Is Explosive Rounds Available: Yes");
            System.out.println("\t- Explosive Rounds: " + myShipWeapons.EA + " Available");
        }
        else
        {
            System.out.println("\t- Is Explosive Rounds Available: No");
        }

        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: BASE STATS] *");

        // Initialized variables for the base.
        BaseStats myBaseStats = new BaseStats(100,100,100,false);

        // Print out status report on the Base.
        System.out.println("\t- Energy Level at: " + myBaseStats.E + "%");
        System.out.println("\t- Oxygen Level at: " + myBaseStats.O + "%");
        System.out.println("\t- Base Force field at: " + myBaseStats.BF + "%");
        // If else statement to report if the rover is available.
        if(myBaseStats.BR == true)
        {
            System.out.println("\t- Is Base Rover Available: Yes");
        }
        else
        {
            System.out.println("\t- Is Base Rover Available: No");
        }

        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: CREW] *");

        BaseMembers MarsExploration = new BaseMembers("Mars Exploration 1");

        // Create crew status report on Levi.
        CrewStatus ExplorationMember = CreateCrewStatus("Levi", "Captain"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Levi into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Siraj.
        ExplorationMember = CreateCrewStatus("Siraj", "Engineer"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Siraj into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Tom.
        ExplorationMember = CreateCrewStatus("Tom", "Soldier"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Tom into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Jenny.
        ExplorationMember = CreateCrewStatus("Jenny", "Doctor"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Jenny into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Nile.
        ExplorationMember = CreateCrewStatus("Nile", "Scientist"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Nile into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: DORMITORY] *");

        // Initialized variables from dormitory class.
        Dormitory myDormitory = new Dormitory("Dormitory", "White,", 360, 75,5,2,2);

        // Print out status report on dormitory class.
        System.out.println("\t- Pod Name: " + myDormitory.N);
        System.out.println("\t- Color: " + myDormitory.C);
        System.out.println("\t - Entry Code : " + myDormitory.EC);
        System.out.println("\t - Temperature: " + myDormitory.T + "°Fahrenheit");
        System.out.println("\t- Number of Beds: " + myDormitory.NB);
        System.out.println("\t- Number of Lavatories: " + myDormitory.NL);
        System.out.println("\t- Number of Showers: " + myDormitory.NS);
        // Recall dormitory construction method.
        Dormitory.DormitoryConstruction();
        System.out.println("* The captain has gone of to inspect the dormitory. *");
        // Recall dormitory method.
        Dormitory.DormitoryWaterSystem();
        //Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: CAFETERIA] *");

        // Initialized variables from cafeteria class.
        Cafeteria myCafeteria = new Cafeteria("Cafeteria", "White", 110, 74,1,2);

        // Print out status report on cafeteria
        System.out.println("\t- Pod Name: " + myCafeteria.N);
        System.out.println("\t- Color: " + myCafeteria.C);
        System.out.println("\t - Entry Code : " + myCafeteria.EC);
        System.out.println("\t - Temperature: " + myCafeteria.T + "°Fahrenheit");
        System.out.println("\t - Number of Stations: " + myCafeteria.NS);
        System.out.println("\t - Number of Tables: " + myCafeteria.NS);
        // Recall cafeteria construction method.
        Cafeteria.CafeteriaConstruction();
        System.out.println("* The captain has gone of to inspect the cafeteria. *");
        // Recall Cafeteria Access menu method.
        Cafeteria.CafeteriaAccess();
        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: LABORATORY] *");

        // Initialized variables from laboratory class.
        Laboratory myLaboratory = new Laboratory("Laboratory", "White", 809, 73);

        // Print out status report on laboratory class.
        System.out.println("\t- Pod Name: " + myLaboratory.N);
        System.out.println("\t- Color: " + myLaboratory.C);
        System.out.println("\t - Entry Code : " + myLaboratory.EC);
        System.out.println("\t - Temperature: " + myLaboratory.T + "°Fahrenheit");
        // Recall Laboratory construction method.
        Laboratory.LaboratoryConstruction();
        System.out.println("* The captain has gone of to inspect the laboratory. *");
        // Recall laboratory method.
        Laboratory.LaboratorySecurityStatusSystem();
        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: COMMAND CENTER] *");

        // Initialized variables from command center class.
        CommandCenter myCommandCenter = new CommandCenter("Command Center", "White",158,75);

        // Print out status report on command center class.
        System.out.println("\t- Pod Name: " + myCommandCenter.N);
        System.out.println("\t- Color: " + myCommandCenter.C);
        System.out.println("\t - Entry Code : " + myCommandCenter.EC);
        System.out.println("\t - Temperature: " + myCommandCenter.T + "°Fahrenheit");
        // Recall Command Center construction method.
        CommandCenter.CommandCenterConstruction();
        System.out.println("* The captain has gone of to inspect the command center. *");
        // Recall command center method.
        CommandCenter.CommStatus();
        //Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* [STATUS REPORT: STORAGE] *");

        // Initialized variables from storage class.
        Storage myStorage = new Storage("Storage", "White", 834,70,25);

        // Print out status report on storage class.
        System.out.println("\t- Pod Name: " + myStorage.N);
        System.out.println("\t- Color: " + myStorage.C);
        System.out.println("\t - Entry Code : " + myStorage.EC);
        System.out.println("\t - Temperature: " + myStorage.T + "°Fahrenheit");
        System.out.println("\t - Capacity: " + myStorage.CA + " % Full");
        // Recall storage construction method.
        Storage.StorageConstruction();
        System.out.println("* The captain has gone of to inspect the storage. *");
        // Recall humidity method.
        Storage.Humidity();

        System.out.println("\n* Status report and inspection complete. *");
        System.out.println("* Time to go find the rover. *");
        new RoverSearching();


        // Conclusion
        System.out.println("-------------------------------------------------------");
        System.out.println("\n* Objectives are complete. *");
        System.out.println("* Have a nice day captain. *");
    }

    // Constant on the instructions on how to process and produces a status report on each crew member.
    private static CrewStatus CreateCrewStatus(String name, String role, CrewTool [] crewtools)
    {
        CrewStatus newCrewMember = new CrewStatus();

        // Initialized variables correlated to CrewStatus.
        newCrewMember.Name = name;
        newCrewMember.Role = role;

        // for loop on the adding crew tool to the list.
        for(CrewTool crewTool : crewtools)
        {
            newCrewMember.AddCrewTool(crewTool);
        }

        // Report on each crew member with there name, role, suit condition, and crew health.
        System.out.println("Crew Member: " + newCrewMember.Name + ", " + newCrewMember.Role + ":");
        System.out.println("\t- Suit Condition: "+ newCrewMember.CrewTool.get(0).toString());
        System.out.println("\t- Crew Health Status: " + newCrewMember.CrewTool.get(1).toString());

        return newCrewMember;
    }
}