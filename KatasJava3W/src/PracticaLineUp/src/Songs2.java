import javazoom.jl.player.Player;

import java.io.FileInputStream;
public class Songs2 implements Runnable{
//Trying with differents methods
        private LineUp[] LineUp = new JavaRangerFest().Lineup;

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
