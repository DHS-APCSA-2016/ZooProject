
/**
 * Write a description of class Leopard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leopard extends Animal
{
    // instance variables - replace the example below with your own
    private String name;
    private int height;
    private int weight;

    /**
     * Constructor for objects of class Leopard
     */
    public Leopard()
    {
        super("Panthera Pardus", "The leopard is distinguished by its well-camouflaged fur, opportunistic hunting behaviour, broad diet, and strength (which it uses to move heavy carcasses into trees), as well as its ability to adapt to various habitats ranging from rainforest to steppe, including arid and montane areas, and its ability to run at speeds of up to 58 kilometres per hour (36 mph)");
        this.name = "Spottie";
        this.height = 59;
        this.weight = 100;
    }
    public Leopard(String name, String species, String desc, int height, int weight)
    {
        // initialise instance variables
        super(species, desc);
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //Getters
    public String getSpecies()
    {
        return super.getSpecies();
    }
    
    public String getDesc() 
    {
        return super.getDesc();
    }
    
    public String eat()
    {
        String eatNoise = "Rar... Omnomnom";
        return eatNoise;
    }
    public String makeNoise()
    {
        String noise = "Grrrrrr.....";
        return noise;
    }
    public String interact()
    {
        String interaction = "*sits patiently*";
        return interaction;
    }
    public String sayName()
    {
        return "*" + name + " tilts their head*";
    }
    public String stats()
    {
        return "Name: " + name + ", Height: " + height + ", Weight: " + weight;
    }
}
