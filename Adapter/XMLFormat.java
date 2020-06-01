import java.util.Scanner;
/**
 *
 * @author Josué Rodríguez
 */
public class XMLFormat implements SpecialFormat{
    
    public String content;
    
    public XMLFormat(String txt){
        String temp = "<content>\n";
        Scanner reader = new Scanner(txt);
        while(reader.hasNextLine()){
            String line = reader.nextLine().replaceAll("\\s","");
            String tag = line.substring(0,line.indexOf(":"));
            String body = line.substring(line.indexOf(":")+1,line.length());
            temp += "<"+tag+">"+body+"</"+tag+">\n";
        }
        this.content = temp + "</content>";    
    }

    @Override
    public void print() {
        System.out.println(this.content);
    }
    
    
    
}
