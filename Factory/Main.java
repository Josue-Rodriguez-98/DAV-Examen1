/**
 *
 * @author Josué Rodríguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static final String SINGLE = "SINGLE";
    private static final String DOUBLE = "DOUBLE";
    private static final String TRIPLE = "TRIPLE";
    
    public static void main(String[] args) {
        RoomFactory factory = new RoomFactory();
        Room room1 = factory.createRoomTariff(SINGLE);
        room1.printTariff(5);
        Room room2 = factory.createRoomTariff(DOUBLE);
        room2.printTariff(2);
        Room room3 = factory.createRoomTariff(TRIPLE);
        room3.printTariff(10);
        
        
    }
    
}
