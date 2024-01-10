package labs.lab_10;


public class Dog extends Animal implements IFlyable {
    private static final int DOG_MAX_SPEED = 60;

    public Dog() {
        super(DOG_MAX_SPEED);
    }

    @Override
    public boolean flyable() {
        return false;
    }
}
