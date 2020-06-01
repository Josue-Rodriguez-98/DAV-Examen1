/**
 *
 * @author Josué Rodríguez
 */
public interface PlushieBuilder {
    
    public void setSize(String size);
    public void setColor(String color);
    public void setSmell(String smell);
    public void addPants(boolean pants);
    public void addShirt(boolean shirt);
    public void addHat(boolean hat);
    public void setName(String name);
    public TeddyBear getBear();
    
    
}
