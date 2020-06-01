/**
 *
 * @author Josué Rodríguez
 */
public class TeddyBearBuilder implements PlushieBuilder{
    
    private TeddyBear teddyBear = null;
    
    public TeddyBearBuilder(){
        this.teddyBear = new TeddyBear();
    }

    @Override
    public void setSize(String size) {
        this.teddyBear.size = size;
    }

    @Override
    public void setColor(String color) {
        this.teddyBear.color = color;
    }

    @Override
    public void setSmell(String smell) {
        this.teddyBear.smell = smell;
    }

    @Override
    public void addPants(boolean pants) {
        this.teddyBear.pants = pants;
    }

    @Override
    public void addShirt(boolean shirt) {
        this.teddyBear.shirt = shirt;
    }

    @Override
    public void addHat(boolean hat) {
        this.teddyBear.hat = hat;
    }

    @Override
    public void setName(String name) {
        this.teddyBear.name = name;
    }

    @Override
    public TeddyBear getBear() {
        return this.teddyBear;
    }
    
}
