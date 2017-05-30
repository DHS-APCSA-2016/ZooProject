//by extending Animal, Penguin receives
//every instance variable & method 
//that Animal has
public class Penguin extends Animal implements Fly, Walk, Swim
{
    private String toy;
    public Penguin()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Penguin", "A small and slick creature that slides on bellies and lives in Antartica");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default Penguins have
        this.toy = "Small Starfish Toy";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Penguin(String species, String desc)
    {
        super(species, desc);
        toy = "Rubber Seal";
    }
    
    public String interact() 
    {
        return "NOOT NOOT, that's MY " + toy;
    }
    public String makeNoise() 
    {
        return "NOOT NOOT! NOOT NOOT!";
    }
    public String eat() 
    {
        return "Noot this is delicious fish Noot";
    }
    
    public String fly()
    {
        return "The Penguin flaps his wings going down a mountain to achieve Mach 5\n" +
                "and turns on his radio to hear 'I Believe I Can Fly'";
    }
    
    public String walk() 
    {
        return "The Penguin waddles around, occasionally flapping his wings to mark his territory.";
    }
    public String swim() 
    {
        return "The Penguin slides into the water, running away from an imaginary seal. The penguin swims in circles before rising up above the water. ";
    }
}
