
/**
 * Write a description of class SnowLeopard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowLeopard extends Leopard
{
    /**
     * Constructor for objects of class SnowLeopard
     */
    private String name;
    public SnowLeopard()
    {
        // initialise instance variables
        super ("Snowy", "Panthera uncia",
        "The snow leopard is a large cat native to the mountain ranges of Central and South Asia. "
        + "It is listed as Endangered on the IUCN Red List of Threatened Species because, as of 2003, "
        + "the size of the global wild population was estimated at 4,080–6,590 adults. "
        + "Fewer than 2,500 individuals may be reproducing in the wild", 
        100, 70);
        this.name = "Snowy";
    }
    
    public SnowLeopard(String name, String desc, int height, int weight)
    {
        // initialise instance variables
        super (name, "Panthera uncia", desc, height, weight);
        this.name = name;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public String sayName()
    {
        // put your code here
        return "*" + name + " swipes at you*";
    }
}
