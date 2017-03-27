public class Fjord extends Horse
{
    public Fjord()
    {
        super("Wow!", "This is a retired farm horse that runs in circles \n" +
                                " all day long.");
    }
    @Override
    public String interact()
    {
          System.out.println(super.walk());
          return "The horse looks at you fondly.";
    }
}
