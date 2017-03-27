
/**
 * Write a description of class Husky here.
 * 
 * @Jenny Li (your name) 
 * @version (a version number or a date)
 */
public class Husky extends Dog
{
    public Husky()
    {
        super("Husky Dog Park", "This is a young Husky that have lots of energy \n" +
                                "and can run in the dog park all day long");
    }
    
    @Override
    public String interact()
    {
        System.out.println(super.eat());
        return "The dog looks at you guiltily.";
    }
}
