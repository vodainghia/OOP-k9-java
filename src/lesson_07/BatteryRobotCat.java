package lesson_07;

// child class, sub-class, concrete class
public class BatteryRobotCat extends RobotCat {
    public BatteryRobotCat(String name, String productionDate) {
        super(name.concat(" , meo meo meo"), productionDate);
    }

    @Override
    public String charge() {
        return super.charge() + " with battery";
    }
}
