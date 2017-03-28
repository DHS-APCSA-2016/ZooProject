//Tim Degerness P4

public class ThreeToedSloth extends Sloth
{
    public ThreeToedSloth()
    {
        super("Bradypus tridactylus","Has three long toes with Hair");
    }
    @Override
    public String interact()
    {
        return super.eat() + " and looks at you blankly";
    }
}
