package PracticaMona;

public class TestOctocat {
    public static void main(String[] args) {

        DinoLook Dino = new DinoLook(128, "Dinocat, ", " Rooooaaaar, I mean love u, ");
        Dino.display();
        TerraLook Terra = new TerraLook(147, "Terracottocat, ", "I love the martial arts...A samurai should always be prepared for death, ");
        Terra.display();
        InvestLook Invest = new InvestLook(119, "Private Investocat, ", "You know my methods, Watson, ");
        Invest.display();
        DaftLook Daft = new DaftLook(100, "Daftpunktocat Thomas, ", "Burger, Nuggets, Burger, Nuggets...Opps, I just singing..., ");
        Daft.display();
        TroopLook Trooper = new TroopLook(84, "Stormtroopocat,", "The Death Code Star plans are not in the main computer, ");
        Trooper.display();
    }
}

