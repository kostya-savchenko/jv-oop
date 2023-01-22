package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Certain machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Certain machine stopped its work");
    }
}
