public class ShipWeapons
{
    // Declared variables.
    public int A;
    public String W;
    public int IA;
    public Boolean I;
    public Boolean E;
    public int EA;

    // Constructor for ShipWeapons.
    public ShipWeapons(int Ammunition, String WeaponModel,Boolean Incendiary_Ammunition, int Incendiary_Rounds, Boolean Explosive_Ammunition, int Explosive_Rounds)
    {
        // Refer this objects to the appropriate parameters set by the constructor.
        A =  Ammunition;
        W = WeaponModel;
        I = Incendiary_Ammunition;
        IA = Incendiary_Rounds;
        E = Explosive_Ammunition;
        EA = Explosive_Rounds;
    }
}