package lesson_07;

import java.util.Arrays;
import java.util.List;

// Form up
public class RobotController {
    // Controller | Is-A relationship
    public void charge(List<RobotCat> robotCatList) {
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }

    // Test
    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat batteryRobotCat = new BatteryRobotCat("BatteryRobotCat", "05/01/2024");
        RobotCat solarRobotCat = new SolarRobotCat("SolarRobotCat", "05/01/2024");

        robotController.charge(Arrays.asList(batteryRobotCat, solarRobotCat));
    }
}
