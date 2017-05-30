
/**
 * Write a description of class Pangolin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Pangolin
{
    public Pangolin()
    {
        super("Pholidota Manidae", "This scaled mammal often comptemplates \n" +
                                "about asking someone to dance with him.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.interact());
          return "He looks like he's about to ask you out on a date";
      }
    
}

