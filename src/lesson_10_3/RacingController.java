package lesson_10_3;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    // Has a relationship | unique for some classes
    public void flyableRacing(List<IFlyable> flyableAnimals) {

    }

    public void nonFlyableRacing(List<IMoveAble> nonFlyableAnimals) {

    }

    public static void main(String[] args) {
        Animal cat = new Cat("Meo", 20);
        Eagle eagle = new Eagle("Chim Dai Bang", 200);

        RacingController racingController = new RacingController();
        racingController.flyableRacing(Arrays.asList(eagle));
    }
}
