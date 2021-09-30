package challenge_4;

public class Team {
    public static void main(String[] args) {
        Captain teamACaptain = Captain.getCaptain();
        teamACaptain.setName("Mbape");

        Captain teamBCaptain = Captain.getCaptain();
        teamBCaptain.setName("Ronaldo");

        if(teamACaptain.equals(teamBCaptain)){
            System.out.println("Same captain");
        } else {
            System.out.println("Diff captains");
        }

    }
}
