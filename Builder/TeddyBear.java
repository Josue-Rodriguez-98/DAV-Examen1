/**
 *
 * @author Josué Rodríguez
 */
public class TeddyBear {
    
    public String size;
    public String color;
    public String smell;
    public boolean pants;
    public boolean shirt;
    public boolean hat;
    public String name;
    
    public TeddyBear(){
        
    }

    public TeddyBear(String size, String color, String smell, boolean pants, boolean shirt, boolean hat, String name) {
        this.size = size;
        this.color = color;
        this.smell = smell;
        this.pants = pants;
        this.shirt = shirt;
        this.hat = hat;
        this.name = name;
    }
        
    @Override
    public String toString(){
        return "This is " + this.name + ". It is a " + this.size + " sized " + this.color + " bear with " + this.smell + " smell.\nIt is " 
                + this.pants + " that it wears pants, as it is " + this.shirt + " that it wears a shirt and it is " + this.hat + " that it has a hat.\n"
                + this.name + " really loves you!";
    }
    
    
}
