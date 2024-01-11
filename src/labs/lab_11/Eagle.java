package labs.lab_11;

public class Eagle extends Animal {
    private static final int EAGLE_MAX_SPEED = 100;

    public Eagle() {
        super(EAGLE_MAX_SPEED);
        flyable = new Fly();
    }
}
