/**
 *
 * @author Josué Rodríguez
 */
public class RoomFactory {

    public Room createRoomTariff(String type) {
        switch (type) {
            case "SINGLE":
                return new Single();
            case "DOUBLE":
                return new Double();
            case "TRIPLE":
                return new Triple();
        }
        return null;
    }

}
