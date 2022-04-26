package PracticaMona;

public class Octocat{

        int id;
        String name;
        String Favact;

        Octocat(int id, String name, String Favact){
                this.id = id;
                this. name= name;
                this.Favact = Favact;
        }

}
////////

        class TerraLook extends Octocat{
        String Outfit = "Samurai";

        TerraLook(int id, String name, String Favact){
                super(id, name, Favact);
                this.Outfit = Outfit;
        }


        void display () {
                System.out.println(id+" "+name+" "+Favact+" "+Outfit);
        }

        }

//////
class DinoLook extends Octocat{
        String Outfit = "DinosaurMeow";

        DinoLook(int id, String name, String Favact){
                super(id, name, Favact);
                this.Outfit = Outfit;
        }


        void display () {
                System.out.println(id+" "+name+" "+Favact+" "+Outfit);
        }

}
////
class InvestLook extends Octocat {
        String Outfit = "Sherlock Holmes";

        InvestLook(int id, String name, String Favact) {
                super(id, name, Favact);
                this.Outfit = Outfit;
        }


        void display() {
                System.out.println(id + " " + name + " " + Favact + " " + Outfit);
        }
}


////
class DaftLook extends Octocat {
        String Outfit = "DaftPunk";

        DaftLook(int id, String name, String Favact) {
                super(id, name, Favact);
                this.Outfit = Outfit;
        }


        void display() {
                System.out.println(id + " " + name + " " + Favact + " " + Outfit);
        }

        ////
        static class TrooperLook extends Octocat {
                String Outfit = "stormtrooper";

                TrooperLook(int id, String name, String Favact) {
                        super(id, name, Favact);
                        this.Outfit = Outfit;
                }


                void display() {
                        System.out.println(id + " " + name + " " + Favact + " " + Outfit);
                }

                /////
/////
                class TestOctocat {
                        public static void main(String[] args) {

                                DinoLook Dino = new DinoLook(128, "Dinocat, ", " Rooooaaaar, I mean love u, ");
                                Dino.display();
                                TerraLook Terra = new TerraLook(147, "Terracottocat, ", "I love the martial arts...A samurai should always be prepared for death, ");
                                Terra.display();
                                InvestLook Invest = new InvestLook(119, "Private Investocat, ", "You know my methods, Watson, ");
                                Invest.display();
                                DaftLook Daft = new DaftLook(100, "Daftpunktocat Thomas, ", "Burger, Nuggets, Burger, Nuggest...Opps, I just singing..., ");
                                Daft.display();
                                TrooperLook Troop = new TrooperLook(84, "Stormtroopocat,", "The Death Code Star plans are not in the main computer, ");
                                Troop.display();




                        }
                }
        }
}


/*
public class Octocat {
        private String Name;
        private String Outfit;
        private String Favact;

        public Octocat(String Name, String Outfit, String Favact) {
                this.Name = Name;
                this.Outfit = Outfit;
                this.Favact = Favact;
        }
        public String getName() {
                return Name;
        }

        public String getOutfit(){
                return Outfit;
        }

        public String getFavact(){
                return Favact;
        }

        public void setName(String Name){
                this.Name = Name;
        }

        public void setOutfit(String Outfit){
                this.Outfit = Outfit;
        }

        public void setFavact(String Favact){
                this.Favact = Favact;
        }
}

*/