/**
 * Write a description of class SpottedTiger here.
 * 
 * @author Raj Khaitan, Period 4
 * @version Version 1.0, 3/24/17
 */
public class SpottedTiger extends Tiger
{
   public SpottedTiger(){
       super("SpottedTiger" , "It's rare but common. It's basically a cheetah with lots of hair.");
    }
   @Override
    public String interact(){
        return "He runs FAAASSSSTTTT. Like one second your alive, the next second your're not.";
    }
}