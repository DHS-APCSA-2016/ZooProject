
/**
 * Write a description of class Horse here.
 * 
 * Horse class - horse noise, eating, swimming, and interaction
 */
public class Horse extends Animal implements Swim, Walk
{
  private String food;
  public Horse()
    {
        super("Horse", "This is just your average horse.");
      
        this.food = "Carrots and Oats";
    }
  public String makeNoise() 
        {
            return "Neigh!";
        }
  public String interact() 
    {
        return "Neigh!";
    }
  public String walk() 
    {
        return "The horse trots.";
    }
  public String eat() 
    {
        return "*chewing noises*";
    }
  public String swim(){
        return "*heavy breathing*"; 
    }
  public Horse(String species, String desc)
    {
        super(species, desc);
        food = "oats";
    }
}
