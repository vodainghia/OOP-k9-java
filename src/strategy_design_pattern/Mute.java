package strategy_design_pattern;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute!!!");
    }
}
