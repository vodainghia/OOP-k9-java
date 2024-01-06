package lesson_08;

// import static
import static lesson_08.HouseWithBuilder.Builder;

public class TestHouseBuilder {
    public static void main(String[] args) {
        // WRITE ONLY
        Builder builder = new Builder();
        // Method chaining
        HouseWithBuilder house = builder
                .setDoorNum(2)
                .setTopRoofColor("Dark blue")
                .setColor("Green")
                .build();

        // READ ONLY
        System.out.println(house.toString());
    }
}
