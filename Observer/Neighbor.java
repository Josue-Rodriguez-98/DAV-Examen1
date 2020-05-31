/**
 *
 * @author Josué Rodríguez
 */
public class Neighbor implements Observer{
    
    private final String name;
    
    public Neighbor(String name){
        this.name = name;
    }

    @Override
    public void update(String news, String location) {
        System.out.println("The guardian from " + location +" sector notified " + this.name + " about " + news);
    }
    
}
