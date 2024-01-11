package labs.lab_11;

public class Tiger extends Animal {
    private static final int TIGER_MAX_SPEED = 100;

    public Tiger() {
        super(TIGER_MAX_SPEED);
        flyable = new FlyNoWay();
    }
}
