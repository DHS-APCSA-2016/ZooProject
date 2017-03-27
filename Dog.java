
/**
 * Write a description of class Dog here.
 * 
 * @Jenny Li (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Animal implements Walk
{
    // instance variables - replace the example below with your own
    private String toy;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Dog", "This is just your average dog.");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default dog have
        this.toy = "A Squeeky ball' Frisbee";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Dog(String species, String desc)
    {
        super(species, desc);
        toy = "ball";
    }
    
    public String interact() 
    {
        return "Ruf Ruf, do not touch my " + toy;
    }
    public String makeNoise() 
    {
        return "Rufff";
    }
    public String eat() 
    {
        return "*sniff sniff* THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The dog slaps on its jetpack and flies away\n" +
                "while Iron Man plays in the background.";
    }
    
    public String walk() 
    {
        return "The dog dances a little jig.";
    }
    }

    
