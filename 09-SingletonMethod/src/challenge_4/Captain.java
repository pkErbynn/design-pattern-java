package challenge_4;

// using Bill Pugh approach

public class Captain {

    private String name;

    private Captain(){};

    private static class CaptainHelper {
        private static Captain uniqueCaptain = new Captain();
    }

    public static Captain getCaptain(){
        return CaptainHelper.uniqueCaptain;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
