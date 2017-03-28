//Tim Degerness P4

public class Sloth extends Animal implements Walk
{
    private String toy;
    public Sloth()
    {
        super("Sloth","Regular lazy sloth");
        this.toy = "Stick";
    }
    public Sloth(String species, String descr)
    {
        super(species,descr);
        this.toy = "Long Stick";
    }
    public String eat()
    {
        return getSpecies() + " grabs a leaf with a " + toy + " eats it";
    }
    public String makeNoise()
    {
        return "SQUEEK";
    }
    public String interact()
    {
        return getSpecies() + " does not seem to be doing anything";
    }
    public String walk()
    {
        return getSpecies() + " moves a little bit up the tree";
    }
}
