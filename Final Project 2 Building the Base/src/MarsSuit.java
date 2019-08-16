public class MarsSuit extends CrewTool
{
    // Declared variable.
    public String SuitCondition;

    // Constructor for MarsSuit.
    public MarsSuit(String SuitCondition)
    {
        // Recall the parent constructor with the addition of SuitCondition.
        super(SuitCondition);
        // Refer to the object = SuitCondition.
        this.SuitCondition = SuitCondition;
    }

}