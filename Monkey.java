/**
 * Write a description of class Monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkey extends Animal implements Attack, Fly, Swim, Walk
{
    // instance variables - replace the example below with your own
    private String y;

    /**
     * Constructor for objects of class Monkey
     */
    public Monkey()
    {
        // initialise instance variables
       super ("Dog", "Hi! My name is Snoop Dawg");
       this.y = "A rattler";
    }

    public Monkey (String species, String desc)
    {
        super (species, desc);
        y = "Baseball bat";
    }
    
     public String interact ()
    {
        return "OOHAHHAHA";
    
     }
     
    public String makeNoise ()
    {
           return "WAHAHHAHAA";
    }
    
    public String eat()
    {
        return "I EAT BANANAS";
    }
    
    public String swim()
    {
        return "I DON'T KNOW WHETHER TO SWIM OR NOT";
    }
    
    public String attack()
    {
       return "I DO NOT ATTACK UNLESS I AM MAD";
    }
    
     public String fly()
    {
        return "TECHNOICALLY I CAN FLY SO I AM A BIRD";

    }
    
    public String walk()
    {
        return " I SWING ON TREES AND I NEVER WALK";
    }
}
