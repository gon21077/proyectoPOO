/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Main
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21139
 */

  /*imports */
import java.io.*;
import javax.sound.sampled.*;



/*esta es la clase para reproducir musica*/
public class SimpleAudioPlayer {
    AudioInputStream audioInputStream;
    Clip clip;
    String filepath;
    /*Construye el audio player que se utiliza en el main */
    public SimpleAudioPlayer()throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        filepath = "just-relax-11157.wav";
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    /*Comienza la musica */
    public void play(){
        clip.start();
    }
    /*Para la musica*/
    public void stop(){
        clip.stop();
    }
}
