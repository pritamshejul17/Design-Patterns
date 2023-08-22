public class Singleton {

    //private static instance variable
    private static Singleton instance;

    //private constructor
    private Singleton() {}

    //public static method to access the instance
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
