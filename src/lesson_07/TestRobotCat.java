package lesson_07;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat("BatteryRobotCat", "05/01/2024");
        RobotCat solarRobotCat = new SolarRobotCat("SolarRobotCat", "05/01/2024");
        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());
    }
}
