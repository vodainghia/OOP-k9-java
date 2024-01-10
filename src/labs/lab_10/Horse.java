package labs.lab_10;

public class Horse extends Animal implements IFlyable {
    private static final int HORSE_MAX_SPEED = 75;

    public Horse() {
        super(HORSE_MAX_SPEED);
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
