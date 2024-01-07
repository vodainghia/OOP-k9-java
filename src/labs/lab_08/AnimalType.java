package labs.lab_08;

public enum AnimalType {
    TIGER(100),
    HORSE(75),
    DOG(60),
    FALCON(200),
    EAGLE(200),
    PIGEON(50),
    SNAKE(20);

    private final int maxSpeed;

    AnimalType(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
