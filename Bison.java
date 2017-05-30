
/**
 * Write a description of class CircusBear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bison extends Cow
{
    public Bison()
    {
        super("Ursus Circusus", "This is a retired Bison that rides its \n" +
                                "tricycle all day long.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "The Bison looks legendary.";
      }
    
}

