import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private static Map<String, Prototype> prototypes = new HashMap<>();

    static {
        prototypes.put("prototype1", new ConcretePrototype1());
        prototypes.put("prototype2", new ConcretePrototype2());
    }

    public static Prototype getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}

public interface Prototype {
    Prototype clone();
}

public class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}

public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Prototype prototype1 = PrototypeRegistry.getPrototype("prototype1");
        Prototype prototype2 = PrototypeRegistry.getPrototype("prototype2");
    }
}