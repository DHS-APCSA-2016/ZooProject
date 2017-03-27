
/**
 * Write a description of class Husky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Husky extends Dog
{
    // instance variables - replace the example below with your own
    private String toy;

    public Husky()
    {
        super("Husky", "This is a retired husky that rides its \n" +
            "tricycle all day long.");
        this.toy = "A frisbee";
    }

    public Husky(String species,String desc)
    {
        super(species, desc);
        toy = "frisbee";
    }

    @Override
    public String interact()
    {
        System.out.println(super.eat());
        return "The husky looks at you forlornly.";
    }

}
