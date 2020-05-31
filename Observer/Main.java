/**
 *
 * @author Josué Rodríguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guardian north = new Guardian("North");
        Guardian south = new Guardian("South");
        north.registerObserver(new Neighbor("Josue"));
        north.registerObserver(new Neighbor("Daniel"));
        north.registerObserver(new Neighbor("Martin"));
        south.registerObserver(new Neighbor("Roman"));
        south.registerObserver(new Neighbor("MaryLu"));
        north.notifyAllObservers("Weird noises heard at night from the abandoned factory.");
        south.notifyAllObservers("Rebel punks skipping school.");
    }
    
}
