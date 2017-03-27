
/**
 * .
 * 
 * @author Ishaque Khan Period 3 
 * @version (a version number or a date)
 */
public class FastCheetah extends Cheetah
{
    public FastCheetah(String desc, String species){
        super(desc, species);
    }
    
    public FastCheetah(int speed, int weight, int age, String gender, int height, String color, String name, String desc, String species){
        super(speed, weight, age, gender, height, color, name, desc, species);
    }
    
    @Override
    public String interact(){
        return getName() + " ran away at 999999999999999999999999999999999999999999999999999999999999999999999999 miles per nanosecond.";
    }

}
