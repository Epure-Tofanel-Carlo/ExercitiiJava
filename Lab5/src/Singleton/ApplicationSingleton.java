package Singleton;

public class ApplicationSingleton {
    public static void main(String[] args) {
        DB singleton = DB.getInstance();
        singleton.connect();
        singleton.connect();
        singleton.disconnect();
        singleton.disconnect();
    }
}
