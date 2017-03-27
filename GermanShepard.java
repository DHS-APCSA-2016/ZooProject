/**
 * Write a description of class GermanShepard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GermanShepard extends Dog
{
    // instance variables - replace the example below with your own
   // private int x;

    /**
     * Constructor for objects of class GermanShepard
    */
   public GermanShepard()
   {
        super("I am a German Shepard", "I bark at everything I see");
   }
   
   @Override
   public String interact()
   {
       System.out.println(super.makeNoise());
       return "All dogs bark";
    }
}
