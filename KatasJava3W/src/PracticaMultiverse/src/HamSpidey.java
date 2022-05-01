public class HamSpidey extends SpiderManCharacteristics implements Ham {


    //parameterized constructor - accepts parameters with which you can initialize the instance variables.
    //super - used to refer immediate parent class instance variable.
    public HamSpidey(String name, String NickName, String gender, String animal, String RepreSymbol, String DressColor, String SuperhumanPower) {
        super(name, NickName, gender, animal, RepreSymbol, DressColor, SuperhumanPower);
    }

    //Introduce methods
    @Override
    public void strenght(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("strength and agility stand far above those of the average human, allowing him to lift nearly ten tons");
        screen.setVisible(true);
        screen.out(showMessage(), "Ink Free", 20,Colors.red );
        screen.showImage("mainham.jpg");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, " It's never established whether he is still a spider with the limitations of a pig or a pig with the proportionate strength and agility of a spider.");

    }


    @Override
    public void OrganicWebbing(Screen screen) {
        screen.cls();
        screen.repaint();
        //System.out.println("");
        screen.setVisible(true);
        //screen.out(showMessage(), "Ink Free", 20,Colors.BlueHorizon ); - are commented to recall that's why the message was reflected several times
        screen.showImage("hamweb.jpg");
        screen.setBounds(-10, 100, 700, 500);
        Overview(screen, " Precognitive Spider-Sense Organic webbing Ability to cling to surfaces");

    }


}
