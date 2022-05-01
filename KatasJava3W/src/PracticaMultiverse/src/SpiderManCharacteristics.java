import java.awt.*;

public class SpiderManCharacteristics {
    private String name;
    private String NickName;
    private String gender;
    private String animal;
    private String RepreSymbol;
    private String DressColor;
    private String SuperhumanPower;

    public SpiderManCharacteristics(String name, String NickName, String gender, String animal, String RepreSymbol, String DressColor, String SuperhumanPower) {
        this.name = name;
        this.gender = gender;
        this.NickName = NickName;
        this.animal = animal;
        this.RepreSymbol = RepreSymbol;
        this.DressColor = DressColor;
        this.SuperhumanPower = SuperhumanPower;

    }


    public String getName() {
        return name;
    }

    public String getNickName() {
        return NickName;
    }

    public String getGender() {
        return gender;
    }

    public String getRepreSymbol() {
        return RepreSymbol;
    }

    public String getDressColor() {
        return DressColor;
    }

    public String getSuperhumanPower() {
        return SuperhumanPower;
    }


    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setNickName(String NickName) {
        if (!NickName.isEmpty()) {
            this.NickName = NickName;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender) {
        if (!gender.isEmpty()) {
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setRepreSymbol(String RepreSymbol) {
        if (!RepreSymbol.isEmpty()) {
            this.RepreSymbol = RepreSymbol;
            return true;
        } else
            return false;
    }

    public boolean setDressColor(String DressColor) {
        if (!DressColor.isEmpty()) {
            this.DressColor = DressColor;
            return true;
        } else
            return false;
    }

    public boolean setSuperhumanPower(String SuperhumanPower) {
        if (!SuperhumanPower.isEmpty()) {
            return true;
        } else
            return false;
    }

    public void Overview(Screen screen, String oview){
        String outOverview = "\n " + oview + "\n ";
        screen.out(outOverview, "Ink Free", 20, Color.black);
    }


    //String name, String gender, String animal, String symbol, String RepreSymbol, String DressColor, String SuperhumanPower, String abilities
    public String showMessage() {
        return
                "\nName:  " + name +
                        "\nNickName:  " + NickName +
                        "\nGender:  " + gender +
                        "\nRepresentative Symbol:  " + RepreSymbol +
                        "\nDress Color:  " + DressColor +
                        "Super Human Power: " + SuperhumanPower;
    }
}
