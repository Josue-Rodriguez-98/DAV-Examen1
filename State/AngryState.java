/**
 *
 * @author Josué Rodríguez
 */
public class AngryState implements State{

    @Override
    public void doAction(LifeContext lifeContext) {
        System.out.println("Entered twitter and saw violence.");
        lifeContext.setState(this);
    }
    
    @Override
    public String toString(){
        return "is Angry.";
    }
    
}
