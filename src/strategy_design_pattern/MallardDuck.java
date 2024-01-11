package strategy_design_pattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyable = new Fly();
    }
}
