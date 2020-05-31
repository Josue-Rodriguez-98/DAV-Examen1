import java.util.ArrayList;

/**
 *
 * @author Josué Rodríguez
 */
public class MusicPlayer {
       
    private static volatile MusicPlayer instance = new MusicPlayer();
    private static volatile ArrayList<String> queue = new ArrayList<>();
    
    private MusicPlayer(){}
    
    public static MusicPlayer getInstance(){
        return instance;
    }
    
    public void nowPlaying(){
        if(queue.isEmpty()){
            System.out.println(">>The queue is empty.\nAdd some songs!");
        }else{
            System.out.println("Now playing: " + queue.get(0));
        }
    }
    
    public void addToQueue(String song){
        queue.add(song);
    }
    
    public void skipSong(){
        if(queue.isEmpty()){
            System.out.println(">>The queue is empty.\nAdd some songs!");
        }else if(queue.size() == 1){
            queue.remove(0);
            System.out.println(">>You've reached the end of the queue.");
        }else{
            queue.remove(0);
            System.out.println("Now playing: " + queue.get(0));
        }
    }
    
}
