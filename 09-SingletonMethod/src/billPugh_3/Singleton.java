package billPugh_3;

// used when no  multiple threads is involved
public class Singleton {
    private int data = 0;

    private Singleton(){}   // cannot be instantiated

    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();  // instance created only get called
    }

    public static Singleton getUniqueInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
