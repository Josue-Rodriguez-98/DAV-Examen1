/**
 *
 * @author Josué Rodríguez
 */
public class Person {
    
    public String name;
    public LifeContext mood;
    
    public Person(String name){
        this.name = name;
        this.mood = new LifeContext();
    }
    
    public void changeMood(String newMood){
        switch (newMood) {
            case "HAPPY":
                HappyState happy = new HappyState();
                happy.doAction(this.mood);
                break;
            case "SAD":
                SadState sad = new SadState();
                sad.doAction(this.mood);
                break;
            case "ANGRY":
                AngryState angry = new AngryState();
                angry.doAction(this.mood);
                break;
            default:
                throw new AssertionError();
        }       
    }
    
    public void printMood(){
        System.out.println(this.name + " " +this.mood.getState().toString());
    }
    
}
