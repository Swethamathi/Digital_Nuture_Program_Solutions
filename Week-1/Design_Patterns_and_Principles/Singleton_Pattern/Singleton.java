public class Singleton {
    private static volatile Singleton singleInstance = null;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            synchronized (Singleton.class) {
                if (singleInstance == null) {
                    singleInstance = new Singleton();
                }
            }
        }
        return singleInstance;
    }

    public void log(String message) {
        System.out.println("Message logged: " + message);
    }
}


