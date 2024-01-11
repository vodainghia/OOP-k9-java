package strategy_design_pattern;

public abstract class Duck {

    // Program based on interface or abstraction
    // This is abstraction

    // There is the "Has-A" relationship here belongs to the "Is-A" relationship
    QuackBehavior quackBehavior;
    Flyable flyable;

    public void performQuack() {
        quackBehavior.quack();
    }

    // The Strategy Design Pattern allows objects to change the behavior (relationship)
    public void changeQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyable.fly();
    }

    public void changeFlyBehavior(Flyable flyable) {
        this.flyable = flyable;
    }

    // This is abstraction

}
