
/**
 * Creeates a Cheetah object and shows what you can do with it
 * 
 * @author Ishaque Khan
 * @period Period 3
 */
public class Cheetah extends Animal
{
    private int speed;
    private int weight;
    private int age;
    private String gender;
    private int height;
    private String color;
    private String name;
    
    public Cheetah(String desc, String species){
        super(desc, species);
        this.speed = 0;
        this.weight = 0;
        this.age = 0;
        this.gender = "";
        this.height = 0;
        this.color = "";
        this.name = "";
    }
    
    public Cheetah(int speed, int weight, int age, String gender, int height, String color, String name, String desc, String species){
        super(desc, species);
        this.speed = speed;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.color = color;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String eat(){
        return getName() + " pounced on you and ate you";
    }
    
    public String interact(){
        return "Do not interact with me or I will eat you.";
    }
    
    public String makeNoise(){
        return "ROOOOOOOOOOOOOOOOOOOOOOAAAAAAAAAAAAAAAAAR";
    }
}
