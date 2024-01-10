package labs.lab_10;

public class Eagle extends Animal implements IFlyable {
    private static final int EAGLE_MAX_SPEED = 100;

    public Eagle() {
        super(EAGLE_MAX_SPEED);
    }

    @Override
    public boolean flyable() {
        return true;
    }
}
