package lazyEvaluation;

// used when no  multiple threads is involved
public class Singleton {
    private static Singleton uniqueInstance = null;
    private int data = 0;

    private Singleton(){}   // cannot be instantiated

    public static Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;  // after an instance created, it's only returned
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
