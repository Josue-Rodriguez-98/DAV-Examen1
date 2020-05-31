import java.util.ArrayList;

/**
 *
 * @author Josué Rodríguez
 */
public class Guardian implements Subject{
    
    private final String location;
    private final ArrayList<Observer> neighbors;
    
    public Guardian(String location){
        this.location = location;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.neighbors.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.neighbors.remove(observer);
    }

    @Override
    public void notifyAllObservers(String news) {
        for (Observer neighbor : neighbors) {
            neighbor.update(news, this.location);
        }
    }
    
}
