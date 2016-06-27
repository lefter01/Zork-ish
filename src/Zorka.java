
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zorka {

    static Game Gamer = new Game();
    
  
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        start();
    }
    public static void start()
    {
        try {
            Gamer.play();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Zorka.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Zorka.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
