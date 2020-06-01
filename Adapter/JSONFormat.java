/**
 *
 * @author Josué Rodríguez
 */
public class JSONFormat implements SpecialFormat{
    
    public String content;
    
    public JSONFormat(String txt){
        this.content = "{\n" + txt + "\n}";
    }

    @Override
    public void print() {
        System.out.println(this.content);
    }
    
    
    
}
