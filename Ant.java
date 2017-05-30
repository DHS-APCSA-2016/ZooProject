/**
 * Super cool ant
 * 
 * @author Billy Zhong
 * @version 1
 * period 3
 * @desc ant
 */
public class Ant extends Animal implements Walk
{
    /**
     * Constructor for objects of class Ant
     */
    public String toy = null;
    public Ant()
    {
        super("Ant", "Super cool walking bug thing");
        this.toy = "Leaf";
    }

    public Ant(String species, String desc)
    {
        super(species, desc);
        this.toy = "Leaf";
    }
    
    public String interact() 
    {
        return "*Panics*";
    }
    public String makeNoise() 
    {
        return "Do Ants make noise?";
    }
    public String eat() 
    {
        return "Chews on leaf";
    }
    
    public String walk() 
    {
        return "walks aimlessly";
    }
}