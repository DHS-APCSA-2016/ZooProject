/**
 * Write a description of class Mandrill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mandrill extends Monkey
{
   

    /**
     * Constructor for objects of class Mandrill
     */
    public Mandrill()
    {
        super("I am a Monkey", "I act wild sometimes");
    }

   @Override
   public String interact()
   {
       System.out.println(super.makeNoise());
       return "OOHHOOOOOHAHHA";
    }
}
