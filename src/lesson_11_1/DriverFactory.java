package lesson_11_1;

public class DriverFactory {

    public static void initAppiumDriver(Platform platform) {
        switch (platform){
            case ANDROID -> System.out.println("Init Android driver");
            case IOS -> System.out.println("Init iOS driver");
            default -> throw new IllegalArgumentException("Please provide correct platform!");
        }
    }
}
