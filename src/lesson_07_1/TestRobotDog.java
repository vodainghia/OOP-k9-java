package lesson_07_1;

public class TestRobotDog {
    public static void main(String[] args) {
        // Shared value: Because dogId belongs to class (class member), so it affects to all instances
        RobotDog dog = new SolarRobotDog();
        System.out.println(RobotDog.dogId); // 1
        RobotDog dog2 = new WindRobotDog();
        System.out.println(RobotDog.dogId); // 2

        // Wrong expected value
        System.out.println(dog.getDogId()); // 2
        System.out.println(dog2.getDogId()); // 2

        // Fixed: use a temp object var to store the id instead of using the class var
        System.out.println(dog.getRobotId()); // 1
        System.out.println(dog2.getRobotId()); // 2
    }
}
