package eagerEvaluation_2;

// used when no  multiple threads is involved
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();  // instance created whether used or unused
    private int data = 0;

    private Singleton(){}   // cannot be instantiated

    public static Singleton getUniqueInstance(){
        return uniqueInstance;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
