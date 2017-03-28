

public class EmperorPenguin extends Penguin
{
    public EmperorPenguin()
    {
        super("Pingu the Penguin", "This is a penguin who appeared in many cartoons on television. It is now imprisoned in a zoo and is forced to stay there for Humans");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          System.out.println("Pingu the Penguin wonders what life is like outside the zoo when he looks at the people. He wonders if there are others like him.");
          return null;
      }
    }
    

