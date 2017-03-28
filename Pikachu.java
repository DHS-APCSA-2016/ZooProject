
/**
 * The class Pikachu is a mouse and extends the mouse class. When interacted with the Pikachu, it will reply to you in a manner tone
 * 
 * @author Japheth Wun 
 * @version 3/28/17
 */
public class Pikachu extends Mouse
{
    public Pikachu()
    {
        super("Ursus Circusus", "Pikachu is bery emotional\n" +
                                "with all the problems it faces.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "Pikachu is judging you!";
      }
}
