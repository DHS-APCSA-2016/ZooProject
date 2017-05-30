
/**
 * Write a description of class Dog here.
 * 
 * @author Shiroman Singh
 * @version Version 1.2
 */
public class Dog extends Animal implements Fly, Walk, Swim
{
    // instance variables - replace the example below with your own
    private String toy;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        // initialise instance variables
        super("Dog", "This is just your average dog.");
        this.toy = "A Warriors' basketball";
    }

    public Dog(String species, String desc)
    {
        super(species, desc);
        toy = "Warrors' basketball";
    }

    public String interact() 
    {
        return "GGRRRRRR, do not touch my " + toy;
    }

    public String makeNoise() 
    {
        return "GGGGGGRRRRR";
    }

    public String eat() 
    {
        return "BBBBBAAAAAARRRRKKKKK THIS IS DELICIOUS!";
    }

    public String fly()
    {
        return "The dog slaps on its jetpack and flies away\n" +
        "while a legendary figure rises in the background.";
    }

    public String walk() 
    {
        return "The dog break dances to contemporary beats.";
    }

    public String swim()
    {
        return "The water is cold.";
    }
}
