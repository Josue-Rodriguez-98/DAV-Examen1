/**
 *
 * @author Josué Rodríguez
 */
public class Text {
    
    public String content;
    public Adapter adapter;
    
    public Text(String content){
        this.content = content;
    }
    
    public void print(String format){
        if(format.equals("txt")){
            System.out.println(this.content);
        }else if(format.equals("json")){
            this.adapter = new Adapter("json", this.content);
            this.adapter.print();
        }else if(format.equals("xml")){
            this.adapter = new Adapter("xml", this.content);
            this.adapter.print();
        }
    }
    
}
