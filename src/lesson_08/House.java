package lesson_08;

public class House {
    private String color;
    private String topRoofColor;
    private int doorNum;

    // Problem 1: There are too many overloading constructors when increasing the quantity of attributes

//    public House(int doorNum) {
//        this.doorNum = doorNum;
//    }
//
//    public House(String topRoofColor) {
//        this.topRoofColor = topRoofColor;
//    }
//
//    public House(String topRoofColor, int doorNum) {
//        this.topRoofColor = topRoofColor;
//        this.doorNum = doorNum;
//    }

//    public House(String color, String topRoofColor, int doorNum) {
//        this.color = color;
//        this.topRoofColor = topRoofColor;
//        this.doorNum = doorNum;
//    }

    // Others...

    // Solution 1: Create only one constructor with a dynamic approach
    private String color1 = "White";
    private String topRoofColor1 = "Red";
    private int doorNum1 = 1;

//    public House(String color1, String topRoofColor1, int doorNum1) {
//        if (color1 != null)
//            this.color1 = color1;
//        if (topRoofColor1 != null)
//            this.topRoofColor1 = topRoofColor1;
//        if (doorNum1 > 1)
//            this.doorNum1 = doorNum1;
//    }

    // Problem 2: Because there are many arguments as the above constructor, so it leads to unfriendly usage

//    public static void main(String[] args) {
//        // So hard to use when having too many arguments:
//        House house = new House(null, "blue", 2);
//    }

    // Solution 2: Only create Setter for them, not create any constructor

    public void setDoorNum1(int doorNum1) {
        this.doorNum1 = doorNum1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public void setTopRoofColor1(String topRoofColor1) {
        this.topRoofColor1 = topRoofColor1;
    }

    public static void main(String[] args) {
        House house = new House();
        // Set attributes' value if needed
        house.setDoorNum1(2);
        house.setTopRoofColor1("Yellow");
    }

    // Problem 3: In case we need to have an Immutable object (that means we can not change the object after creating)
    // Solution 3: To remove all Setter => The Problem 1 will happen again!!!

    // The best practice here: To utilize the "Builder Design Pattern"
    // To solve all the problems: No need to have many overloading constructors, still have an immutable object.
    // Note: Just apply this design pattern when we have many attributes and have to create immutable object.
    // Sample implementation: Prefer to the class HouseWithBuilder.java

}
