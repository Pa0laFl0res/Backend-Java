public class DJPutItBackOn {

        Screen s = makeScreen();
        Dialog d = new Dialog();

        static Screen makeScreen(){
            Screen s = new Screen("JAVARANGER FEST");
            s.setVisible(true);
            s.setBounds(-10, 100, 700, 500);
            return s;
        }


    }


