/**
 *
 * @author Josué Rodríguez
 */
public class SadState implements State{

    @Override
    public void doAction(LifeContext lifeContext) {
        System.out.println("Remembered when Ash got turned into stone.");
        lifeContext.setState(this);
    }
    
    @Override
    public String toString(){
        return "is Sad.";
    }
}
