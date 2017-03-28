/**
 * Write a description of class Tiger here.
 * 
 * @author Raj Khaitan, Period 4 
 * @version Version 1.0, 3/24/17
 */
public class Tiger extends Animal implements Swim, Fly, Walk
    {
        private String toy;
        public Tiger()
        {
            super("Tiger", "If you see a tiger, run. And it will chase you and kill you.");
            this.toy = "People";
        }
        public Tiger( String species, String desc)
        {
            super(species, desc);
            this.toy = toy;
        }
        public String makeNoise (){
            return "Roar, roar, roar.";
        }
        public String eat(){
            return "Tigers love eating humans.";
        }
        public String interact(){
            return "It will pounce onto you before you blink.";
        }
        public String walk(){
            return "It doesn't walk. It runs.";
        }
        public String fly(){
            return "Well I mean, it runs so fast it doesn't need to fly.";
        }
        public String swim(){
            return "It won't swim well so now you know how to save yourself.";
        }
        public String getToy(){
            return toy;
        }
    }