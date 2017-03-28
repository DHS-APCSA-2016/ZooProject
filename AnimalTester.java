
/**
 * Write a description of class AnimalTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalTester extends Dog
{
    public static void main(String[] args) 
    {
        Animal b = new CircusBear();
        b.interact();
        Tiger t = new SpottedTiger();
        System.out.println(t.interact());
    }
}
