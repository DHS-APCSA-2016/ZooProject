/**
 * Super cool fire ant
 * 
 * @author Billy Zhong
 * @version 1
 * period 3
 * @desc fire ant
 */
public class FireAnt extends Ant
{
    public FireAnt()
    {
        super("Fire Ant", "Super fire walking bug thing");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "Spits fire";
      }
    
}