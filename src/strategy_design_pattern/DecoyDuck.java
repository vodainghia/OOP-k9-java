package strategy_design_pattern;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new Mute();
        flyable = new FlyNoWay();
    }
}
