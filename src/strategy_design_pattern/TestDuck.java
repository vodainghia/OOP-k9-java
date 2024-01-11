package strategy_design_pattern;

public class TestDuck {

    // Controller
    // Not use "Has-A" relationship but "Is-A" relationship here
    // Program based on interface or abstraction
    // Don't know detail implementation when writing controller
    void performQuackBehavior(Duck duck) {
        // But there is the "Has-A" relationship within this "Is-A" relationship
        duck.performQuack();
    }

    void performFlyBehavior(Duck duck) {
        duck.performFly();
    }

    public static void main(String[] args) {
        // TEST HERE
        Duck mallardDuck = new MallardDuck();
        Duck babyDuck = new BabyDuck();
        Duck decoyDuck = new DecoyDuck();

        TestDuck testDuck = new TestDuck();
        testDuck.performQuackBehavior(mallardDuck);
        testDuck.performFlyBehavior(mallardDuck);
        testDuck.performQuackBehavior(babyDuck);
        testDuck.performFlyBehavior(babyDuck);
        testDuck.performQuackBehavior(decoyDuck);
        testDuck.performFlyBehavior(decoyDuck);

        // Strategy Design Pattern allows object to change behavior (relationship)
        babyDuck.changeQuackBehavior(new Quack());
        babyDuck.changeFlyBehavior(new Fly());
        testDuck.performQuackBehavior(babyDuck);
        testDuck.performFlyBehavior(babyDuck);
    }
}
