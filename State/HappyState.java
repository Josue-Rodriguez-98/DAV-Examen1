/**
 *
 * @author Josué Rodríguez
 */
public class HappyState implements State{

    @Override
    public void doAction(LifeContext lifeContext) {
        System.out.println("Got 20/20 on his DAV Exam!");
        lifeContext.setState(this);
    }
    
    @Override
    public String toString(){
        return "is Happy.";
    }
    
}
