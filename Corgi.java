/**
 * Write a description of class Corgi here.
 * 
 * @author Justine Koa Period 4
 * @version March 24rd 2017
 */
public class Corgi extends Dog
{
    private String toy;
    public Corgi()
    {
        super("Dog", "This is the best dog breed in the world!");
        this.toy = "a tennis ball";
    }
    
    @Override
    public String interact()
    {
        System.out.println(super.walk());
        System.out.println(super.eat());
        System.out.println("My favorite toy is a " + toy + "!");
        return "WOOF! BORK!";
    }
}
