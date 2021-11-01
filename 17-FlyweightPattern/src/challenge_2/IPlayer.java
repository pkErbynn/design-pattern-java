package challenge_2;

interface IPlayer {
    void mission();

    // extrinsic data that changes
    void assignWeapon(String weapon);
}

class Terrorist implements IPlayer {
    // intrinsic
    private final String task;

    // extrinsic
    private String weapon;

    public Terrorist(){
        this.task = "Plant bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist: Task = " + this.task + ", With Weapon = " + this.weapon);
    }
}

class CounterTerrorist implements IPlayer {
    // intrinsic
    private final String task;

    // extrinsic
    private String weapon;

    public CounterTerrorist(){
        this.task = "Diffuse bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("CounterTerrorist: Task = " + this.task + ", With Weapon = " + this.weapon);
    }

}