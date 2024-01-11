package labs.lab_11;

import java.util.Arrays;

public class TestAnimalRacing {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        Animal babyEagle = new Eagle();

        babyEagle.changeFlyable(new FlyNoWay());

        RacingController racingController = new RacingController();
        String winner = racingController.getWinner(Arrays.asList(dog, horse, tiger, eagle, babyEagle));
        System.out.println(winner);
    }
}
