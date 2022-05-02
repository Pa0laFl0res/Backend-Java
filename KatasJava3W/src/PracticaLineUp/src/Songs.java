import javazoom.jlgui.basicplayer.BasicPlayer;

import javax.sound.sampled.Line;
import java.io.File;

public class Songs extends LineUp  {
    //private BasicPlayer player;
    //We create a constructor
    private BasicPlayer player = new BasicPlayer();

    public Songs(String Voice, String Songs, String Img) {
        super(Voice, Songs, Img);
    }


    //Play, Pause, Resum, Stop Methods....
    public void Play() throws Exception {
        player.play();
    }

    public void OpenFile(String root) throws Exception {
        player.open(new File(root));
    }
    public void OpenFile2(String root2) throws Exception {
        player.open(new File(root2));
    }
    public void OpenFile3(String root3) throws Exception {
        player.open(new File(root3));
    }
    public void OpenFile4(String root4) throws Exception {
        player.open(new File(root4));
    }

    public void Pause() throws Exception {
        player.pause();
    }

    public void Continue() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }

    public static void main(String [] args){
        try {
            Songs Songs = new Songs();
            Songs.OpenFile("d:/Stromae-Sante.mp3");
            Songs.Play();
            Songs.OpenFile2("d:/Monsta X - You Problem.mp3");
            Songs.Play();
            Songs.OpenFile3("d:/SUPER JUNIOR - One More Time (Otra Vez) (Feat.mp3");
            Songs.Play();
            Songs.OpenFile4("d:/The Outside - twenty one pilots.m4a");
            Songs.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
        

}