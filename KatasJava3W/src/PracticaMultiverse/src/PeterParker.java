import java.io.IOException;

public class PeterParker extends SpiderManCharacteristics implements PeterP {


    public PeterParker(String name, String NickName, String gender, String animal, String RepreSymbol, String DressColor, String SuperhumanPower) {
        super(name, NickName, gender, animal, RepreSymbol, DressColor, SuperhumanPower);
    }

    @Override
    public void Strenght(Screen screen) throws IOException {
        screen.cls();
        screen.repaint();
        //System.out.print("strength and agility stand far above those of the average human, allowing him to lift nearly ten tons");
        screen.setVisible(true);
        screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("spidermancom.png");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "strength and agility stand far above those of the average human, allowing him to lift nearly ten tons");
    }


    @Override
    public void speed(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("leap and move at incredible speeds with high accuracy. ");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("speed.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen,"leap and move at incredible speeds with high accuracy. ");


    }

    @Override
    public void WallCrawling(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("his way to the top avoiding dangerous attacks from above! Help him climb to the top, take down his enemies and save the day!");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("wallcrawler.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "his way to the top avoiding dangerous attacks from above! Help him climb to the top, take down his enemies and save the day!");



    }

    @Override
    public void HealingFactor(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("He also heals faster than normal when injured, though he is not completely immune to viruses and other human ailments.");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("healing.png");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen,"He also heals faster than normal when injured, though he is not completely immune to viruses and other human ailments.");



    }

    @Override
    public void Reflexes(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("Sipderman's reflexes are so fast he once covered a gun barrel with his spiderweb after the trigger was pulled but before the bullet was fired");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("reflexes.webp");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "Sipderman's reflexes are so fast he once covered a gun barrel with his spiderweb after the trigger was pulled but before the bullet was fired");


    }

    @Override
    public void SpiderSenseAlert(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("he is capable of reacting anywhere from 12–15 times faster than an average human.");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("spiderman.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "he is capable of reacting anywhere from 12–15 times faster than an average human.");


    }

    @Override
    public void WebShooter(Screen screen) {
        screen.cls();
        screen.repaint();
        System.out.println("uses self-designed web-shooters allowing him to fire and swing from sticky webs");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon );
        screen.showImage("webshoot.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen,"uses self-designed web-shooters allowing him to fire and swing from sticky webs");




    }



}