package PracticaHarry;

public class HarryPotterCharacter {
    private int id;
    private String FullName;
    private String Gender;
    private String Blood_Status;
    public String Boggart;
    public String Wand;
    public String Patronus;
    public String Occupation;
    public String House;
    //

    public void Character(String FullName, String Gender, String Blood_Status, String Boggart, String Wand, String Patronus, String Occupation, String House, String Loyalty, String Specie ){
        this.FullName = FullName;
        this.Gender = Gender;
        this.Blood_Status = Blood_Status;
        this.Boggart = Boggart;
        this.Wand = Wand;
        this.Patronus = Patronus;
        this.Occupation = Occupation;
        this.House = House;
    }

    public String getFullName(){
        return FullName;
    }

    public String getGender(){
        return Gender;
    }

    public String getBlood_Status () {
        return Blood_Status;
    }

    public String getBoggart() {
        return Boggart;
    }

    public String getWand(){
        return Wand;
    }

    public String getPatronus() {
        return Patronus;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getHouse() {
        return House;
    }


    //public boolean

    public boolean setFullName(String FullName) {
        if (!FullName.isEmpty()) {
            this.FullName = FullName;
            return true;
        }
        return false;
    }

    public boolean setGender(String Gender) {
        if (!Gender.isEmpty()) {
            this.Gender = Gender;
        }
        return false;
    }

    public boolean setBlood_Status(String Blood_Status){
        if (!Blood_Status.isEmpty()) {
            this.Blood_Status = Blood_Status;
        }
        return false;
    }

    public boolean setBoggart(String Boggart) {
        if(!Boggart.isEmpty()) {
            this.Boggart = Boggart;
        }
        return false;
    }

    //Wand,Patronus,Occupation,House,Loyalty,Specie

    public boolean setWand(String Wand) {
        if (!Wand.isEmpty()){
            this.Wand = Wand;
        }
        return false;
    }

    public boolean setPatronus (String Patronus){
        if(!Patronus.isEmpty()){
            this.Patronus = Patronus;
        }
        return false;
    }

    public boolean setOccupation (String Occupation) {
        if(!Occupation.isEmpty()){
            this.Occupation = Occupation;
        }
        return false;
    }

    public boolean setHouse(String House){
        if(!House.isEmpty()){
            this.House = House;
        }
        return false;
    }

    public String showMessage() {
        return "Full Name: " + FullName +
                "\nGender: " + Gender +
                "\n:Blood Status: " + Blood_Status +
                "\nHouse: " + House +
                "\nWand: " + Wand +
                "\nBoggart: " + Boggart +
                "\nPatronus: " + Patronus +
                "\nOccupation: " + Occupation;

    }
}
