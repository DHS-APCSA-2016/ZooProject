
/**
 * Write a description of class Husky2 here.
 * 
 * @author Justin Symmank 
 * @version 3/27/17
 */
public class Husky2 extends Dog
{
    public Husky2()
    {
        super("Husky", "The dog of the tundra.");
    }

    public String interact(){
        return "The husky appreciates your companionship.";
    }
    
    public String walk(){
        return "The husky does not want to be walked.";
    }
    
    public String eat(){
        return "The husky eats 5 cans of food in a minute!";
    }
}
