
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Animal implements Swim, Attack 
{
    // instance variables - replace the example below with your own
    private String x;

    /**
     * Constructor for objects of class Dog
     */
    public Dog ()
    {
        super ("Dog", "Hi! My name is Snoop Dawg");
        this.x = "A bone";
        /*
         * This dog has many features to it
         * Do not provoke it or else it will bite!
         * Otherwise, It's a nice dog so have fun!
         */
        
        
    }
    
    
    public Dog(String species, String desc)
    {
        // initialise instance variables
      //  x = 0;
        super (species, desc);
        x = "tennis ball";
    }

   
    public String interact ()
    {
        return "WOOF WOOF";
    
     }
     
    public String makeNoise ()
    {
           return "BARK BARK";
    }
    
    public String eat()
    {
        return "I LOVE THIS DOG FOOD";
    }
    
    public String swim()
    {
        return "I'M GOING TO JUMP IN THE POOL";
    }
    
    public String attack()
    {
       return "I AM A DOG SO I ATTACK PEOPLE MWHAHAHAHAHAHA";
    }
    
}
