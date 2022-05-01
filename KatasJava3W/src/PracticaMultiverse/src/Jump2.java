import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//version 2 - updated
public class Jump2 {

    public static void main(String[] args) throws InterruptedException, IOException {
        Screen screen = makeScreen();
        Dialog dialog = new Dialog();
        String str;

        //Calls
       screen.out("Welcome to Spiderman Multiverse, Com'on let's review some characters from Marvel creations");
       screen.setVisible(true);


       //BufferedImage - resizes Image
        str = dialog.readString("¿Would you like to continue? yes/no ");
        if (str.charAt(0) == 'Y' || str.charAt(0) == 'y') {
            BufferedImage bufferedImage = ImageIO.read(new File("spiderverse1.jpg"));
            Image image = bufferedImage.getScaledInstance(-100, -200, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            JFrame frame = new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(500,300);
            JLabel jlabel = new JLabel();
            //jlabel.setIcon(icon);
            //frame.add(jlabel);
            //frame.setVisible(true);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            screen.showImage("spiderverse1.jpg");
            screen.out("\nAmaaaaiiizing!!!, let me show you the following Characters Characteristics...");
            Thread.sleep(6000);
        } else
            screen.out("\nQuit", "Seeya", 20, Color.BLACK);


        if (PeterP(screen, dialog) != 0) {
            System.exit(0);
        }
        if (Gwen(screen, dialog) != 0) {
            System.exit(0);
        }

        if(Ham(screen,dialog)!=0){
            System.exit(0);
        }

        if(Noir(screen, dialog)!=0){
            System.exit(0);
        }

        System.exit(0);
    }


    static Screen makeScreen() {
        Screen screen = new Screen("Multiverse");
        screen.setVisible(true);
        screen.setBounds(-10, 100, 700, 500);
        return screen;
    }


    static int PeterP(Screen screen, Dialog dialog) throws InterruptedException, IOException {
        PeterParker Spiderman = new PeterParker(
                "Peter Parker",
                "Spider Man",
                "Male",
                "none",
                "Spider",
                "Red,blue,red and white\n",
                "Healing Factor, spider-sense alert, WallCrawling, cobweb-shooter Speed, strenght,reflexes, genius intellect specializing in chemistry and invention."

        );
        screen.showImage("spidermancom.png");

        Spiderman.Strenght(screen);
        if (dialog.confirm("Would you like to see the next one?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        Spiderman.WebShooter(screen);
        if (dialog.confirm("Would you like to see the next one?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        Spiderman.speed(screen);
        if (dialog.confirm("Would you like to see the next one?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        Spiderman.SpiderSenseAlert(screen);
        if (dialog.confirm("Would you like to see the next one?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        Spiderman.HealingFactor(screen);
        if (dialog.confirm("Would you like to see the next one?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        Spiderman.WallCrawling(screen);
        if (dialog.confirm("Would you like to see the next one?", dialog.tit) != 0) {
            return 1;
        }
        return 0;
    }


    static int Gwen(Screen screen, Dialog dialog) throws InterruptedException {
        Ghost GhostS = new Ghost(
                "Gwen Stacy",
                "Ghost-Spider",
                "Female",
                "none",
                "Spider",
                "White, black and pink",
                "Spider-sense alert, wallcrawler, webshooter, agility, Speed, proportional strenght"
        );


        GhostS.agility(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        GhostS.SpiderSense(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        GhostS.strength(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        GhostS.WebShooter(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        GhostS.SpiderSense(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        GhostS.Wallcrawler(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }

        return 0;
    }

    static int Ham(Screen screen, Dialog dialog) throws InterruptedException{
        HamSpidey Ham = new HamSpidey(
                "Peter Porker",
                "Spider Ham",
                "Male",
                "pig",
                "Spider",
                "Blue, red, black and white",
                "Enhanced strength, Precognitive Spider-Sense Organic webbing Ability to cling to surfaces"

        );


        Ham.strenght(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        Ham.OrganicWebbing(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        return 0;

    }

    static int Noir(Screen screen, Dialog dialog) throws InterruptedException {
        Noirspidey Noir = new Noirspidey(
                "Peter Parker",
                "Spider Man Noir",
                "Male",
                "none",
                "Spider",
                "Black",
                "Webbing Generation, Superhuman Physiology, Indomitable Willpower, Skilled Weapons User,Experienced Detective"
        );



        Noir.strenght(screen);
        if (dialog.confirm("Do you want o continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        Noir.agility(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        Noir.wallcrawler(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        Noir.Webshooter(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }

        Thread.sleep(2000);
        Noir.sense(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        Noir.SkilledWeapons(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        Thread.sleep(2000);
        Noir.ExperiencedDetective(screen);
        if (dialog.confirm("Do you want to continue?", dialog.tit) != 0) {
            return 1;
        }
        dialog.display("This is the end :p");
        return 0;
        }

    }



    
