// Complex subsystems
class CPU {
    public void processData() {
        System.out.println("Processing data...");
    }
}

class Memory {
    public void load() {
        System.out.println("Loading data into memory...");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("Reading data from hard drive...");
    }
}

// Facade
class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.processData();
        memory.load();
        hardDrive.readData();
        System.out.println("Computer started successfully.");
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}
