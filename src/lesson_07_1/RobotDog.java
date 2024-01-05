package lesson_07_1;

public class RobotDog {
    // Class variable
    protected static int dogId = 0;

    // Obj var
    private String name;
    private int robotId;

    public static void changeId1() {
        dogId++;
        // System.out.println(this.name); // error, because static member can not call non-static member (it's not created)
    }

    // Wrong expected
//    public RobotDog() {
//        dogId++;
//    }

    // Fixed: use a temp object var to store the id instead of using the class var
    public RobotDog() {
        robotId = dogId + 1;
        dogId++;
    }

    public int getDogId() {
        return dogId;
    }

    public int getRobotId() {
        return robotId;
    }
}
