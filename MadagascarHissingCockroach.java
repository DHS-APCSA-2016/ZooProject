
/**
 * Write a description of class MadagascarHissingCockroach here.
 *
 * @author Pranav Konduru Period: 4
 * @version 3/26/2017
 */
public class MadagascarHissingCockroach extends Cockroach
{
    public MadagascarHissingCockroach()
    {
        super("MadagascarHissingCockroach", "MadagascarHissingCockroach is from Madagaskar");
    }
    
      @Override
      public String interact()
      {
          //System.out.println(super.eat());
          return "MadagascarHissingCockroach is full";
      }
}
