package labs.lab_07.lab_07_2;

import java.security.SecureRandom;

public class Animal {
    private int maxSpeed;

    public Animal() {
    }

    public Animal(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMAX_SPEED() {
        return maxSpeed;
    }

    public void setMAX_SPEED(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int speed() {
        return new SecureRandom().nextInt(maxSpeed);
    }

    public void printWinnerMessage(int speed) {
        String animalName = getClass().getSimpleName();
        System.out.printf("Winner is %s, with speed: %d", animalName, speed);
    }
}
