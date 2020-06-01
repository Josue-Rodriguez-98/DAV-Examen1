/**
 *
 * @author Josué Rodríguez
 */
public class LifeContext {
    
    public State state;
    
    public LifeContext(){
        this.state = null;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public State getState(){
        return this.state;
    }
    
}
