//by extending Animal, Bear receives
//every instance variable & method 
//that Animal has
public class Cow extends Animal implements Fly, Walk
{
    private String toy;
    public Cow()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Cow", "This is just your average Cow.");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default bears have
        this.toy = "A Dodgers' beachball";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Cow(String species, String desc)
    {
        super(species, desc);
        toy = "ball";
    }
    
    public String interact() 
    {
        return "Mooooooo, do not touch my  " + toy;
    }
    public String makeNoise() 
    {
        return "Moo";
    }
    public String eat() 
    {
        return "Moo THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The dog slaps on its jetpack and flies away\n" +
                "while Iron Man plays in the background.";
    }
    
    public String walk() 
    {
        return "The Cow dances a little jig.";
    }
}
