public class LineUp {
    private String Voice;
    private String Songs;
    private String Img;

    public LineUp(String Voice, String Songs, String Img) {
        this.Voice = Voice;
        this.Songs = Songs;
        this.Img = Img;
    }


    public void LineUp(String Voice, String Songs, String Img) {
        this.Voice = Voice;
        this.Songs = Songs;
        this.Img = Img;


    }

    public String getVoice(){
        return Voice;
    }

    public String getArtBandsSongs(){
        return Songs;
    }

    public String getArtBandsImg(){return Img;}


    public boolean setVoice(String Voice){
        if(!Voice.isEmpty()){
            this.Voice = Voice;
            return true;
        }
        return false;
    }

    public boolean setSongs(String Songs){
        if(!Songs.isEmpty()){
            this.Songs = Songs;
            return true;
        }
        return false;

    }

    public boolean setImg(String Img){
        if(!Img.isEmpty()){
            this.Img = Img;
            return true;
        }
        return false;
    }


    public String showMessage(){
        return
                "Name: "+Voice+
                        "Songs: "+ Songs+
                        ""+Img;
    }

}