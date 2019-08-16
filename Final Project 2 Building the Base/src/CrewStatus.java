import java.util.ArrayList;

public class CrewStatus
{
    // Declared variables.
    public String Name;
    public String Role;
    // Declared ArrayList in correlation to CrewTool.
    public ArrayList<CrewTool> CrewTool;

    // Constructor for CrewStatus.
    public CrewStatus()
    {
        // Reference to the CrewTool ArrayList.
        CrewTool = new ArrayList<CrewTool>();
    }

    // Return type for the crew tools.
    public void AddCrewTool(CrewTool myCrewTool)
    {
        // Add the CrewTool object into
        CrewTool.add(myCrewTool);
    }


}