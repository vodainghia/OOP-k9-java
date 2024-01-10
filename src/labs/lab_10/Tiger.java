package labs.lab_10;

public class Tiger extends Animal implements IFlyable {
    private static final int TIGER_MAX_SPEED = 100;

    public Tiger() {
        super(TIGER_MAX_SPEED);
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
