
/**
 * Write a description of class ArnoldSchwarzenegger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArnoldSchwarzenegger extends Animal implements Fly, Walkls
{
    // instance variables - replace the example below with your own
    private String muscles; 

   public ArnoldSchwarzenegger() {
     super("Arnold", "This is just your average Schwarzenegger");
     this.muscles= "Are poppin'";
    }
    
    public ArnoldSchwarzenegger(String species, String desc){
        super(species, desc);
        muscles = "biceps";
        
    }
    
    public String interact()
    {
        return "RAWR, do not touch my weights";
        
    }
    
    public String makeNoise()
    {
        return "RAWRR";
    }
    
   public String eat()
   {
       return "RAWR THIS IS DELICIOUS";
    }
    
   public String fly()
   {
       return "Arnold, with the sheer power of his muscles, flaps his arms and begins to fly"; 
    }


    public String walk()
    {
        return "Walking is for the weak, Arnold runs...across lava, carrying an entire gym and governmental body on is back.";
    }

}
