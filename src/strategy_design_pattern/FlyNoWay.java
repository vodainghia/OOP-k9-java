package strategy_design_pattern;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("Fly No Way!!!");
    }
}
