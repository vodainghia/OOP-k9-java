package labs.lab_08;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public String getWinner(List<Animal> animalList) {
        if (animalList == null || animalList.isEmpty()) {
            throw new IllegalArgumentException("Animal list is empty or null.");
        }

        List<Animal> racingAnimals = new ArrayList<>(animalList);
        racingAnimals.removeIf(Animal::isFlyable);

        if (racingAnimals.isEmpty()) {
            throw new IllegalArgumentException("No animals can participate in the race.");
        }

        int max = 0, index = 0;
        for (int i = 0; i < racingAnimals.size(); i++) {
            int animalSpeed = racingAnimals.get(i).getSpeed();
            if (animalSpeed > max) {
                max = animalSpeed;
                index = i;
            }
        }

        return racingAnimals.get(index).getWinnerMessage();
    }
}
