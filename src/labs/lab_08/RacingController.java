package labs.lab_08;

import java.util.List;

public class RacingController {
    public void getTheWinner(List<Animal> animalList) {
        animalList.removeIf(Animal::isFlyable);

        int max = 0, index = 0;
        for (int i = 0; i < animalList.size(); i++) {
            int animalSpeed = animalList.get(i).speed();
            if (animalSpeed > max) {
                max = animalSpeed;
                index = i;
            }
        }
        Animal winner = animalList.get(index);
        winner.printWinnerMessage(winner.getName(), max);
    }
}
