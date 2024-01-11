package labs.lab_11;

public class Dog extends Animal {
    private static final int DOG_MAX_SPEED = 60;

    public Dog() {
        super(DOG_MAX_SPEED);
        flyable = new FlyNoWay();
    }
}
