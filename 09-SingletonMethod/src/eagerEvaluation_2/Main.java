package eagerEvaluation_2;

public class Main {

    public static void main(String[] args) {
	    Singleton singleton = Singleton.getUniqueInstance();
	    singleton.setData(10);
        System.out.println(singleton);
        System.out.println(singleton.getData());

        Singleton singleton2 = Singleton.getUniqueInstance();
        singleton2 = Singleton.getUniqueInstance();
        System.out.println(singleton2);
        System.out.println(singleton2.getData());

        singleton = Singleton.getUniqueInstance();
        System.out.println(singleton);
        System.out.println(singleton.getData());
    }
}
