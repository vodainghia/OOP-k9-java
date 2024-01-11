package labs.lab_11;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public String getWinner(List<Animal> animalList) {
        if (animalList.isEmpty()) {
            System.out.println("The animals list should has at least one animal");
        }

        List<Animal> nonFlyableAnimalList = new ArrayList<>();
        for (Animal animal : animalList) {
            if(!animal.isFlyable()){
                nonFlyableAnimalList.add(animal);
            }
        }

        if (nonFlyableAnimalList.isEmpty()) {
            System.out.println("There is no non-flyable animal in the provided list");
        }

        int max = nonFlyableAnimalList.get(0).getSpeed(), index = 0;
        for (int i = 1; i < nonFlyableAnimalList.size(); i++) {
            int animalSpeed = nonFlyableAnimalList.get(i).getSpeed();
            if (animalSpeed > max) {
                max = animalSpeed;
                index = i;
            }
        }
        return nonFlyableAnimalList.get(index).getWinnerMessage(max);
    }
}
