public class JavaRangerFest {
    private String Logo;
    /*
    we use \n to insert a new line
    we use a \t is insert a tab in the text, soo let's see how it works
    */
    private String EventName = "\n \t\t\t\t\tJavaranger Fest\t\t\t\t\t";
    public LineUp[] Lineup = {
            new LineUp("Twenty One Pilots", "","TOP.png"),
            new LineUp("Monsta X", "d:/Monsta X - You Problem.mp3", "MX.jfif"),
            new LineUp("Super Junior", "", "SuperJunior.jpg")
    };
    private String Place = "\n \t\t\t\t\tParque Fundidora\t\t\t\t\t";
    private String City = "\n\t\t\t\t\tMonterrey, Nuevo león\t\t\t\t\t";
    private String Company = "\n \t\t\t\t\t Chipitín del Norte";
    private String Feature = "\n Kessel22's show takes you in the clouds";
    private String Installations = "\n las rayas Estudio, WirdoCreepo, Kusic and skull studio";
    private String BeganOn = "\n 8:30pm CDT, \n10:16am KST, \n18:30pm PDT";


public void JavaRangerFest(String Logo,String EventName, String Place, String City, String Company, String Feature, String Installations, String BeganOn){
    this.Logo = Logo;
    this.EventName = EventName;
    this.Place = Place;
    this.City = City;
    this.Company = Company;
    this.Feature = Feature;
    this.Installations = Installations;
    this.BeganOn = BeganOn;
}

public String getLogo(){return Logo;}
public String getEventName() { return EventName;}
public String getPlace(){return Place;}
public String getCity(){return City;}
public String getCompany(){return Company;}
public String getFeature(){return Feature;}
public String getInstallations(){return Installations;}
public String getBeganOn(){return BeganOn;}

public boolean setLogo(String Logo){
    if(!Logo.isEmpty()){
        this.Logo = Logo;
        return true;
    }
    return false;
}

public boolean setEventName(String EventName){
    if (!EventName.isEmpty()){
        this.EventName = EventName;
        return true;
    }
    return false;
}

public boolean setPlace(String Place){
    if(!Place.isEmpty()){
        this.Place = Place;
        return true;
    }
    return false;
}

public boolean setCity(String City){
    if(!City.isEmpty()){
        this.City = City;
        return true;
    }
    return false;
}

public boolean setCompany(String Company){
    if(!Company.isEmpty()){
        this.Company = Company;
        return true;
    }
    return false;
}

public boolean setFeature(String Feature){
    if(!Feature.isEmpty()){
        this.Feature = Feature;
        return true;
    }
    return false;
}

public boolean setInstallations(String Installations){
    if(!Installations.isEmpty()){
        this.Installations = Installations;
        return true;
    }
    return false;
}

public boolean setBeganOn(String BeganOn){
    if(!BeganOn.isEmpty()){
        this.BeganOn = BeganOn;
        return true;
    }
    return false;
}

public String showMessage(){
    return
            " "+Logo+
            " "+EventName+
                    " "+ Place +
                    " "+City+
                    " "+Company+
                    " "+BeganOn+
                    " "+Feature+
                    " "+Installations;
}



}
