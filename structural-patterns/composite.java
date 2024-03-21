import java.util.ArrayList;
import java.util.List;

// Component interface
interface Graphic {
    void draw();
}

// Leaf class
class Ellipse implements Graphic {
    @Override
    public void draw() {
        System.out.println("Ellipse");
    }
}

// Composite class
class CompositeGraphic implements Graphic {
    private final List<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

    @Override
    public void draw() {
        for (Graphic graphic : childGraphics) {
            graphic.draw();
        }
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        // Create a root composite graphic
        CompositeGraphic root = new CompositeGraphic();

        // Add some leaf graphics
        root.add(new Ellipse());
        root.add(new Ellipse());

        // Create a branch composite graphic
        CompositeGraphic branch = new CompositeGraphic();
        branch.add(new Ellipse());
        branch.add(new Ellipse());

        // Add the branch to the root
        root.add(branch);

        // Draw everything
        root.draw();
    }
}
