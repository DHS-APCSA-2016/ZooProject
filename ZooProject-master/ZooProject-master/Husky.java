
/**
 * Write a description of class CircusBear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Husky extends Dog
{
    public Husky()
    {
        super("Ursus Circusus", "This is a retired Dog that rides its \n" +
                                "tricycle all day long.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "The dog looks legendary.";
      }
    
}
