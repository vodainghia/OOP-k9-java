package labs.lab_07.lab_07_2;

import java.util.Arrays;

public class TestAnimalRacing {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        RacingController racingController = new RacingController();
        racingController.getTheWinner(Arrays.asList(horse, tiger, dog));
    }
}
