package objectCompositionExample;

public class Client {
    public static void main(String[] args) {
        GhanaianDuck ghanaianDuckDuck = new GhanaianDuck();
        ForeignTurkey USTurkey = new ForeignTurkey();

        TurkeyAdapter USTurkeyGhDuck = new TurkeyAdapter(USTurkey);

        System.out.println("Ghanaian duck : ");
        ghanaianDuckDuck.fly();
        ghanaianDuckDuck.quack();

        System.out.println("US turkey : ");
        USTurkey.fly();
        USTurkey.gobble();


        System.out.println("Turkey adapter : ");
        USTurkeyGhDuck.fly();
        USTurkeyGhDuck.quack();
    }
}
