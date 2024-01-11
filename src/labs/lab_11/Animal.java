package labs.lab_11;

import java.security.SecureRandom;

public class Animal {
    private final int speed;

    IFlyable flyable;

    public boolean isFlyable() {
        return flyable.isFlyable();
    }

    public void changeFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public Animal(int maxSpeed) {
        this.speed = speed(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public int speed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }

    public String getWinnerMessage(int speed) {
        String animalType = getClass().getSimpleName();
        return String.format("Winner is %s, with speed: %d", animalType, speed);
    }
}
