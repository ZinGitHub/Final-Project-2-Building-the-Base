public class Spaceship
{
    // Declared variables.
    public int S;
    public String M;
    public Boolean D;
    public int FC;

    // Constructor for Spaceship
    public Spaceship(int Seats, Boolean Drone, int Forcefield_Capacity, String Model)
    {
        // Refer this objects to the appropriate parameters set by the constructor.
        S = Seats;
        M = Model;
        D = Drone;
        FC = Forcefield_Capacity;
    }
}