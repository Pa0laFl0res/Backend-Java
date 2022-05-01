public class Noirspidey extends SpiderManCharacteristics implements Noir {


    public Noirspidey(String name, String NickName, String gender, String animal, String RepreSymbol, String DressColor, String SuperhumanPower) {
        super(name, NickName, gender, animal, RepreSymbol, DressColor, SuperhumanPower);
    }

    @Override
    public void strenght(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        screen.out(showMessage(), "Comic Sans MS", 20,Colors.black);
        screen.showImage("spidernoir.jpg");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "After being bitten by a spider, Parker has gained the superhuman physical strength, mobility speed, highly acrobatic agility, accelerated healing and endurance.");


    }



    @Override
    public void agility(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        //screen.out(showMessage(), "Congenial", 20,Colors.BlueHorizon );
        screen.showImage("webnoir.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "proportionate to that of a spider; the ability to have his body cling to sheer walls or other solid surfaces.Unlike the traditional Spider-Man, he uses his acrobatic agility to maneuver about the rooftops.");

    }

    @Override
    public void sense(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        //screen.out(showMessage(), "Congenial", 20,Colors.BlueHorizon );
        screen.showImage("noir3.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "a sixth sense which warns him of incoming danger, also known as spider-sense unseen");

    }

    @Override
    public void wallcrawler(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        //screen.out(showMessage(), "Congenial", 20,Colors.BlueHorizon );
        screen.showImage("wallcrawnoir.jpg");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, " crawl up walls with little effort, can shoot webbing as nets and to maneuver in between buildings and rooftops");

    }

    @Override
    public void SkilledWeapons(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        //screen.out(showMessage(), "Congenial", 20,Colors.BlueHorizon );
        screen.showImage("noirgun.png");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "He can shoot liquid silk out of his wrists, he is a skilled weapons ");

    }

    @Override
    public void ExperiencedDetective(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        //screen.out(showMessage(), "Congenial", 20,Colors.BlueHorizon );
        screen.showImage("detective.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, "Spider-Man is a skilled investigative reporter who uses his investigative skills to determine the facts and discover the origins of a crime as well as the criminals.In Spider-Verse volume 3 (2020), it is revealed that following his death in Spider-Geddon, Spider-Man Noir woke up alive and well in a web-cocoon on his native Earth-90214, having had a vision of the spider-god telling him his service was not finished. Now slightly more introspective and glib, this Peter Parker officially starts working as a private investigator, adopting a slightly new look and a more stereotypical 1930s dialect");

    }

    @Override
    public void Webshooter(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.setVisible(true);
        screen.showImage("detective.gif");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen,"He can produce powerful organic webbing from his hands and he uses the webbing to both stun and capture his enemies.");
    }
}
