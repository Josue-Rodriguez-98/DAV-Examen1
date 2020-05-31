import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MusicPlayer mp = MusicPlayer.getInstance();
        Scanner entrada = new Scanner(System.in);
        boolean keepPlaying = true;
        while(keepPlaying){
            System.out.println("Welcome to Nala Music Player");
            System.out.println("1) Show now playing");
            System.out.println("2) Add song");
            System.out.println("3) Skip current song");
            System.out.println("4) Close the player");
            System.out.print("Enter a number: ");
            int option = entrada.nextInt();
            switch (option) {
                case 1:
                    mp.nowPlaying();
                    break;
                case 2:
                    System.out.println("Enter the song's name:");
                    entrada.nextLine();
                    String song = entrada.nextLine();
                    mp.addToQueue(song);
                    break;
                case 3:
                    mp.skipSong();
                    break;
                case 4:
                    keepPlaying = false;
                    entrada.close();
                    break;
                default:                   
            }
        }
    }
    
}
