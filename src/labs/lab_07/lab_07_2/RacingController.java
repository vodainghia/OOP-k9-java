package labs.lab_07.lab_07_2;

import java.util.List;

public class RacingController {
    public void getTheWinner(List<Animal> animalList) {
        int max = 0, index = 0;
        for (int i = 0; i < animalList.size(); i++) {
            int animalSpeed = animalList.get(i).getSpeed();
            if (animalSpeed > max) {
                max = animalSpeed;
                index = i;
            }
        }
        animalList.get(index).printWinnerMessage(max);
    }
}
