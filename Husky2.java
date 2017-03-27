
/**
 * Write a description of class Husky2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
