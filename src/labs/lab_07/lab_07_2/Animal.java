package labs.lab_07.lab_07_2;

import java.security.SecureRandom;

public class Animal {
    private int speed;

    public Animal() {
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
        String animalName = getClass().getSimpleName();
        return String.format("Winner is %s, with speed: %d", animalName, speed);
    }
}
