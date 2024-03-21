public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("¡Hola! Soy un singleton.");
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
