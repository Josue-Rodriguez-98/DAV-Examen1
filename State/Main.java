/**
 *
 * @author Josué Rodríguez
 */
public class Main {

    public static final String HAPPY = "HAPPY";
    public static final String SAD = "SAD";
    public static final String ANGRY = "ANGRY";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person josue = new Person("Josue");
        josue.changeMood(HAPPY);
        josue.printMood();
        josue.changeMood(SAD);
        josue.printMood();
        josue.changeMood(ANGRY);
        josue.printMood();
    }

}
