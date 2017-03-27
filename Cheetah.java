
/**
 * Write a description of class Cheetah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheetah extends Animal implements Fly, Walk, Swim
{
    private String toy;
    public Cheetah()
    {
        super("Cheetah", "FAST AS LIGHTNING");
        
        this.toy = "70mph of the african savannah";
    }
    
    
    public Cheetah(String species, String desc)
    {
        super(species, desc);
        toy = "Gazelle Meat";
    }
    
    public String interact() 
    {
        return "AYYY, do not touch my " + toy;
    }
    public String makeNoise() 
    {
        return "MEOW!!!!!";
    }
    public String eat() 
    {
        return "AYYY THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "Use your head....Cheetahs can't fly ";
    }
    
    public String walk() 
    {
        return "The Cheetah dances a tango to show its predatorial dominance.";
    }
    public String swim()
    { 
        return "There is no water in the savannah. Thus I cannot swim";
    }
    public String run()
    {
        return "At 70 mph, I am the fastest land mammal on earth";
    }
}
