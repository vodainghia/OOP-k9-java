package lesson_08;

// ENCAPSULATION
public class HouseWithBuilder {
    private int doorNum = 1;
    private String topRoofColor = "Red";
    private String color = "White";

    public HouseWithBuilder() {
    }

    // Customer service | Inner class
    public static class Builder {
        private int doorNum = 1;
        private String topRoofColor = "Red";
        private String color = "White";

        // WRITE ONLY
        public Builder setDoorNum(int doorNum) {
            this.doorNum = doorNum;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseWithBuilder build() {
            return new HouseWithBuilder(this);
        }
    }

    protected HouseWithBuilder(Builder builder) {
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        color = builder.color;
    }

    // READ ONLY
    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNum=" + doorNum +
                ", topRoofColor='" + topRoofColor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
