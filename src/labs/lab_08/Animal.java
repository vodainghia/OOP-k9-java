package labs.lab_08;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private boolean flyable;
    private String name;

    public Animal() {
    }

    public static class Builder {
        private int speed;
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
            this.speed = speed(type.getMaxSpeed());
            return this;
        }

        public static int speed(int maxSpeed) {
            return new SecureRandom().nextInt(Math.max(0, maxSpeed));
        }

        public Animal build() {
            if (speed < 0 || name == null || name.isEmpty() || type == null)
                throw new IllegalArgumentException("Invalid animal properties.");
            return new Animal(this);
        }
    }

    protected Animal(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getWinnerMessage() {
        return String.format("Winner is %s, with speed: %d", name, speed);
    }
}
