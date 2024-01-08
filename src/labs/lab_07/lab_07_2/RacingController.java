package labs.lab_07.lab_07_2;

import java.util.List;

public class RacingController {
    public String getWinner(List<Animal> animalList) {
        int max = 0, index = 0;
        for (int i = 0; i < animalList.size(); i++) {
            int animalSpeed = animalList.get(i).getSpeed();
            if (animalSpeed > max) {
                max = animalSpeed;
                index = i;
            }
        }
        return animalList.get(index).getWinnerMessage(max);
    }
}
