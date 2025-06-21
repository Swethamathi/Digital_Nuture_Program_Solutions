public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.log("Logging the first call.");

        Singleton s2 = Singleton.getInstance();
        s2.log("Logging the second call.");

        if (s1 == s2) {
            System.out.println("Same object used for both calls. Singleton confirmed!");
        } else {
            System.out.println("Different objects. Singleton pattern broken.");
        }
    }
}


