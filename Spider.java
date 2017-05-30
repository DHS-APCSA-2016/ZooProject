
/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Animal implements Walk
{
   private String toy;
    public Spider()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Spider", "This is just your average Spider.");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default bears have
        this.toy = "A spiderweb";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Spider(String species, String desc)
    {
        super(species, desc);
        toy = "fly";
    }
    
    public String interact() 
    {
        return "RAH, do not touch my " + toy;
    }
    public String makeNoise() 
    {
        return "RAH";
    }
    public String eat() 
    {
        return "RAH THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The Spider shoots a string and flies away" ;
    }
    
    public String walk() 
    {
        return "The Spider walks around the tree.";
    }
}
