/**
 *
 * @author Josué Rodríguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String content = "name: Josue\nlastName: Rodriguez\nage: 21";
        Text txt = new Text(content);
        txt.print("txt");
        System.out.println("------------------------------------");
        txt.print("json");
        System.out.println("------------------------------------");
        txt.print("xml");
        
    }
    
}
