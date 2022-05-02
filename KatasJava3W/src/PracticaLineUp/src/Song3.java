import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.File;

public class Song3 implements Runnable{
    private LineUp[] LineUp = new JavaRangerFest().Lineup;


    private BasicPlayer player = new BasicPlayer();

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

    public static void main(String args[]){
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

    @Override
    public void run() {
        try {
            for (int i = 0, n = LineUp.length; i < n; i++) {
                String Voice = LineUp[i].getVoice();
                FileInputStream fis = new FileInputStream(Voice);
                Player player = new Player(fis);
                player.play(200);
                player.close();
                fis.close();
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
