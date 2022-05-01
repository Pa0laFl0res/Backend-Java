import java.awt.*;

public class Jump {

    //First version - my first steps... I'm still working on it to get best practices

    public static void main(String[] args) throws InterruptedException{

        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;
        

        screen.out("Welcome to Spiderman Multiverse, Com'on let's review some characters from Marvel creations");
        screen.setVisible(true);

        str = d.readString("¿Would you like to continue? yes/no ");
        if (str.charAt(0) == 'Y' || str.charAt(0)== 'y'){
            screen.showImage("spiderverse.jpg");
            screen.out("\nHi, let me show you the following Characters Characteristics...");
        } else
            screen.out("\nQuit", "Comic", 20, Color.BLACK);


        PeterParker Spiderman = new PeterParker(
                "Peter Parker",
                "Spider Man",
                "Male",
                "none",
                "Spider",
                "Red,blue,red and white\n",
                "Healing Factor, spider-sense alert, WallCrawling, cobweb-shooter Speed, strenght,reflexes, genius intellect specializing in chemistry and invention."

        );


        Ghost GhostSpider = new Ghost(
                "Gwen Stacy",
                "Ghost-Spider",
                "Female",
                "none",
                "Spider",
                "White, black and pink",
                "Spider-sense alert, wallcrawler, webshooter, agility, Speed, proportional strenght"

        );




        Noirspidey Noir = new Noirspidey(
                "Peter Parker",
                "Spider Man Noir",
                "Male",
                "none",
                "Spider",
                "Black",
                "Webbing Generation, Superhuman Physiology, Indomitable Willpower, Skilled Weapons User,Experienced Detective"
        );

        HamSpidey Ham = new HamSpidey(
                "Peter Porker",
                "Spider Ham",
                "Male",
                "pig",
                "Spider",
                "Blue, red, black and white",
                "Enhanced strength, agility, durability, Precognitive Spider-Sense Organic webbing Ability to cling to surfaces"

        );
/*
        Spiderman.Strenght(screen);
        Spiderman.WallCrawling(screen);
        Spiderman.WebShooter(screen);
        Spiderman.speed(screen);
        Spiderman.HealingFactor(screen);
        Spiderman.Reflexes(screen);
        Thread.sleep(1000);


        GhostSpider.endurance(screen);
        GhostSpider.Wallcrawler(screen);
        GhostSpider.SpiderSense(screen);
        GhostSpider.strength(screen);
        GhostSpider.agility(screen);
        Thread.sleep(1000);

        Noir.strenght(screen);
        Noir.agility(screen);
        Noir.reflexes(screen);
        Noir.wallcraler(screen);
        Noir.sense(screen);
        Noir.SkilledWeapons(screen);
        Noir.ExperiencedDetective(screen);
        Noir.SuperhumanPhysiology(screen);
        Thread.sleep(1000);


        Ham.strenght(screen);
        Ham.agility(screen);
        Ham.durability(screen);
        Ham.OrganicWebbing(screen);
        Ham.PrecogSpiderSense(screen);
        Ham.WallCrawler(screen);
        Thread.sleep(1000);
*/

}



}




//Thread.sleep(3000);
//ashe.hawkShot(screen);
        /*s.setVisible(true);
        s.out(ashe.showMessage(), "Helvetica",28, Colors.BlueHorizon);
    */

