
/**
 * Write a description of class Labrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Labrador extends Dog
{
    public Labrador()
    {
        super("Retreverus Laboradorus", "This dog is \n" +
                                        "voting for Brian.");
    }
    
    @Override
    public String interact()
    {
        System.out.println(super.swim());
        return "The dog succeeeds at life because it votes for Brian.";
    }
}