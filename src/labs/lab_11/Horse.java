package labs.lab_11;

public class Horse extends Animal {
    private static final int HORSE_MAX_SPEED = 75;

    public Horse() {
        super(HORSE_MAX_SPEED);
        flyable = new FlyNoWay();
    }
}
