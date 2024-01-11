package labs.lab_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingController {
    public String getWinner(List<IFlyable> animalList) {
        List<IFlyable> unFlyableAnimals = new ArrayList<>();
        for (IFlyable animal : animalList) {
            if (!animal.flyable()) unFlyableAnimals.add(animal);
        }
        int max = 0, index = 0;
        for (int i = 0; i < unFlyableAnimals.size(); i++) {
            int animalSpeed = unFlyableAnimals.get(i).getSpeed();
            if (animalSpeed > max) {
                max = animalSpeed;
                index = i;
            }
        }
        return unFlyableAnimals.get(index).getWinnerMessage(max);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Eagle eagle = new Eagle();

        RacingController racingController = new RacingController();
        String winner = racingController.getWinner(Arrays.asList(dog, horse, tiger, eagle));
        System.out.println(winner);
    }
}
