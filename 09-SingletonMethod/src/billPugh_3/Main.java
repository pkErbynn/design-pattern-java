package billPugh_3;

public class Main {

    public static void main(String[] args) {
	    Singleton singleton = Singleton.getUniqueInstance();
	    singleton.setData(10);
        System.out.println(singleton);
        System.out.println(singleton.getData());

        singleton = Singleton.getUniqueInstance();
        System.out.println(singleton);
        System.out.println(singleton.getData());
    }
}
