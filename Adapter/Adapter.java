/**
 *
 * @author Josué Rodríguez
 */
public class Adapter {
    
    private SpecialFormat specialFormat;
    
    public Adapter(String type, String content){
        if(type.equals("json")){
            this.specialFormat = new JSONFormat(content);
        }else if(type.equals("xml")){
            this.specialFormat = new XMLFormat(content);
        }
    }

    public void print(){
        this.specialFormat.print();
    }
}
