import java.util.ArrayList;

public class BaseMembers
{
    // String variable.
    public String Name;
    // ArrayList created.
    public ArrayList<CrewStatus> Members;

    // Constructor for BaseMembers class.
    public BaseMembers(String name)
    {
        // Refer to the object = Name.
        this.Name = name;
        // Refer to the object = Members with Arraylist correlated to CrewStatus.
        this.Members = new ArrayList<CrewStatus>();
    }


}