package labs.lab_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static labs.lab_08.Animal.Builder;

public class TestAnimalRacing {
    public static void main(String[] args) {
        Animal tiger = new Builder()
                .setName("Tiger")
                .setType(AnimalType.TIGER)
                .withWings(false)
                .build();
        Animal horse = new Builder()
                .setName("Horse")
                .setType(AnimalType.HORSE)
                .withWings(false)
                .build();
        Animal corgi = new Builder()
                .setName("Corgi")
                .setType(AnimalType.DOG)
                .withWings(false)
                .build();
        Animal chihuahua = new Builder()
                .setName("Chihuahua")
                .setType(AnimalType.DOG)
                .withWings(false)
                .build();
        Animal falcon = new Builder()
                .setName("Falcon")
                .setType(AnimalType.FALCON)
                .withWings(true)
                .build();
        Animal eagle1 = new Builder()
                .setName("Eagle1")
                .setType(AnimalType.EAGLE)
                .withWings(true)
                .build();
        Animal eagle2 = new Builder()
                .setName("Eagle2")
                .setType(AnimalType.EAGLE)
                .withWings(true)
                .build();
        Animal pigeon = new Builder()
                .setName("Pigeon")
                .setType(AnimalType.PIGEON)
                .withWings(true)
                .build();
        Animal snake = new Builder()
                .setName("Snake")
                .setType(AnimalType.SNAKE)
                .withWings(false)
                .build();
        List<Animal> animalList = new ArrayList<>(Arrays.asList(tiger, horse, corgi, chihuahua, falcon, eagle1, eagle2, pigeon, snake));

        RacingController racingController = new RacingController();
        System.out.println(racingController.getWinner(animalList));
    }
}
