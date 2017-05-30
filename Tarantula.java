
/**
 * Write a description of class Tarantula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarantula extends Spider
{
    public Tarantula()
    {
        super("Theraphosidae", "This is a big hairy spider that \n" +
                                "eats birds all day long.");
    }
    
    @Override
    public String interact()
    {
        System.out.println(super.eat());
        return "The Spider looks at you forlornly.";
    }
}
