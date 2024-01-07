package labs.lab_08;

import java.security.SecureRandom;

public class Animal {
    private int maxSpeed;
    private boolean flyable;
    private String name;

    public Animal() {
    }

    public static class Builder {
        private int maxSpeed;
        private boolean flyable;
        private String name;
        private AnimalType type;

        public Builder withWings(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(AnimalType type) {
            this.type = type;
            switch (type) {
                case TIGER -> this.maxSpeed = 100;
                case HORSE -> this.maxSpeed = 75;
                case DOG -> this.maxSpeed = 60;
                case FALCON, EAGLE -> this.maxSpeed = 200;
                case PIGEON -> this.maxSpeed = 50;
                case SNAKE -> this.maxSpeed = 20;
                default -> throw new IllegalArgumentException("Unknown animal type: " + type);
            }
            return this;
        }

        public Animal build() {
            if (maxSpeed < 0)
                throw new IllegalArgumentException("Maximum speed must be non-negative.");
            return new Animal(this);
        }
    }

    protected Animal(Builder builder) {
        name = builder.name;
        maxSpeed = builder.maxSpeed;
        flyable = builder.flyable;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    public int speed() {
        return new SecureRandom().nextInt(Math.max(0, maxSpeed));
    }

    public void printWinnerMessage(String name, int speed) {
        System.out.printf("Winner is %s, with speed: %d", name, speed);
    }
}
