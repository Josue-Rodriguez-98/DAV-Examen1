/**
 *
 * @author Josué Rodríguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildABear bab = new BuildABear();
        PlushieBuilder builder = new TeddyBearBuilder();
        bab.buildBear(builder);
        System.out.println(builder.getBear().toString());
    }
    
}
