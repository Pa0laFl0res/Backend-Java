package PracticaHarry;

public class Proof {
    public static void main(String[] args) {
        def();
    }

    public static void def() {

        HarryPotterCharacter RonWeasley = new HarryPotterCharacter();
        RonWeasley.setFullName("Ron Bilius Weasley\n");
        RonWeasley.setGender("Male\n");
        RonWeasley.setBlood_Status("Pure-Blood\n");
        RonWeasley.setHouse("Gryffindor\n");
        RonWeasley.setWand("\nAsh Unicorn tail hair" + "\n Willow Unicorn tail hair" + "\nChesnut" + "\nDragon heartstring\n");
        RonWeasley.setBoggart("Aragog\n");
        RonWeasley.setPatronus("Jack Russell Terrier\n");
        RonWeasley.setOccupation("\nAuror" + "\nWeasleys Wizard Wheezes co-manager\n\n\n");

        //
        String msg = "Ron has the following characteristics: ";
        msg += "\nFull Name: " + RonWeasley.getFullName();
        msg += "\nGender: " + RonWeasley.getGender();
        msg += "\nBlood Status: " + RonWeasley.getBlood_Status();
        msg += "\nHouse: " + RonWeasley.getHouse();
        msg += "\nWand: " + RonWeasley.getWand();
        msg += "\nBoggart: " + RonWeasley.getBoggart();
        msg += "\nPatronus: " + RonWeasley.getPatronus();
        msg += "\nOccupation: " + RonWeasley.getOccupation();
        ////

        HarryPotterCharacter LunaLovegood = new HarryPotterCharacter();
        LunaLovegood.setFullName("Luna Lovegood \n");
        LunaLovegood.setGender("Female\n");
        LunaLovegood.setBlood_Status("Pure-Blood\n");
        LunaLovegood.setHouse("Ravenclaw\n");
        LunaLovegood.setWand("\nwood" + "\ncore material");
        LunaLovegood.setBoggart("death\n");
        LunaLovegood.setPatronus("Hare\n");
        LunaLovegood.setOccupation("Magizoologist\n\n\n");

        //
        String msg2 = "Luna has the following characteristics: ";
        msg2 += "\nFull Name: " + LunaLovegood.getFullName();
        msg2 += "\nGender: " + LunaLovegood.getGender();
        msg2 += "\nBlood Status: " + LunaLovegood.getBlood_Status();
        msg2 += "\nHouse: " + LunaLovegood.getHouse();
        msg2 += "\nWand: " + LunaLovegood.getWand();
        msg2 += "\nBoggart: " + LunaLovegood.getBoggart();
        msg2 += "\nPatronus: " + LunaLovegood.getPatronus();
        msg2 += "\nOccupation:" + LunaLovegood.getOccupation();

        ////
        HarryPotterCharacter HermioneGranger = new HarryPotterCharacter();
        HermioneGranger.setFullName("Hermione Jean Granger \n");
        HermioneGranger.setGender("Female\n");
        HermioneGranger.setBlood_Status("Muggle\n");
        HermioneGranger.setHouse("Gryffindor\n");
        HermioneGranger.setWand("\nvine wood" + "\ndragon hearstring");
        HermioneGranger.setBoggart("\nFailure\n");
        HermioneGranger.setPatronus("Otter");
        HermioneGranger.setOccupation("\nMinister for Magic\n\n\n");

        //
        String msg3 = "Hermione  has the following characteristics: ";
        msg3 += "\nFull Name: " + HermioneGranger.getFullName();
        msg3 += "\nGender: " + HermioneGranger.getGender();
        msg3 += "\nBlood Status: " + HermioneGranger.getBlood_Status();
        msg3 += "\nHouse: " + HermioneGranger.getHouse();
        msg3 += "\nWand: " + HermioneGranger.getWand();
        msg3 += "\nBoggart: " + HermioneGranger.getBoggart();
        msg3 += "\nPatronus: " + HermioneGranger.getPatronus();
        msg3 += "\nOccupation: " + HermioneGranger.getOccupation();

        ////

        HarryPotterCharacter LordVoldermort = new HarryPotterCharacter();
        LordVoldermort.setFullName("Tom Marvolo Riddle (LORD VOLDEMORT) \n");
        LordVoldermort.setGender("Male\n");
        LordVoldermort.setBlood_Status("Half-Blood\n");
        LordVoldermort.setHouse("Slytherin\n");
        LordVoldermort.setWand("\nyew" + "\nphoenix feather core");
        LordVoldermort.setBoggart("\nHis own corpse\n");
        LordVoldermort.setPatronus("None");
        LordVoldermort.setOccupation("\nRule the world!!!\n\n\n");

        //
        String msg4 = "Voldermort has the following characteristics: ";
        msg4 += "\nFull Name: " + LordVoldermort.getFullName();
        msg4 += "\nGender: " + LordVoldermort.getGender();
        msg4 += "\nBlood Status: " + LordVoldermort.getBlood_Status();
        msg4 += "\nHouse: " + LordVoldermort.getHouse();
        msg4 += "\nWand: " + LordVoldermort.getWand();
        msg4 += "\nBoggart: " + LordVoldermort.getBoggart();
        msg4 += "\nPatronus: " + LordVoldermort.getPatronus();
        msg4 += "\nOccupation: " + LordVoldermort.getOccupation();

        ////
        HarryPotterCharacter Jacob = new HarryPotterCharacter();
        Jacob.setFullName("Jacob Kowalski\n");
        Jacob.setGender("Male\n");
        Jacob.setBlood_Status("Muggle or No Maj\n");
        Jacob.setHouse("none\n");
        Jacob.setWand("unknown\n");
        Jacob.setBoggart("none\n");
        Jacob.setPatronus("None\n");
        Jacob.setOccupation("\nPropietario de Bienes Horneados de Calidad de Kowalski\n\n\n");

        //
        String msg5 = "Jacob has the following characteristics: ";
        msg5 += "\nFull Name: " + Jacob.getFullName();
        msg5 += "\nGender: " + Jacob.getGender();
        msg5 += "\nBlood Status: " + Jacob.getBlood_Status();
        msg5 += "\nHouse: " + Jacob.getHouse();
        msg5 += "\nWand: " + Jacob.getWand();
        msg5 += "\nBoggart: " + Jacob.getBoggart();
        msg5 += "\nPatronus: " + Jacob.getPatronus();
        msg5 += "\nOccupation: " + Jacob.getOccupation();


        System.out.print(msg);
        System.out.print(msg2);
        System.out.print(msg3);
        System.out.print(msg4);
        System.out.print(msg5);
    }
}
