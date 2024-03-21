public class Example {
    private static Singleton instance;

    private Example() {
        // Constructor privado para evitar instanciación externa
    }

    public static Example getInstance() {
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
        Example singleton = Example.getInstance();
        singleton.showMessage();
    }
}
