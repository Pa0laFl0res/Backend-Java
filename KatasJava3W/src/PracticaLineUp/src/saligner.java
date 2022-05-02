public class saligner extends LineUp implements Listeners {

    public saligner(String Voice, String Songs, String Img) {
        super(Voice, Songs, Img);
    }

    @Override
    public void Play(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Pristina", 20,Colors.BlueHorizon );
        s.showImage("");
        s.setBounds(-10, 100, 700, 500);
        //Overview(screen, "strength and agility stand far above those of the average human, allowing him to lift nearly ten tons");
        
    }

    @Override
    public void View(Screen s) {

    }

    @Override
    public void ListenTeaser(Screen s) {

    }

    @Override
    public void TakeTicket(Screen s) {

    }

    @Override
    public void Pause(Screen s) {

    }


}
