package lesson_12;

public class DriverFactory {

    public static AppiumDriver getAppiumDriver(Platform platform) {
        AppiumDriver appiumDriver;
        switch (platform) {
            case ANDROID -> appiumDriver = new AndroidDriver();
            case IOS -> appiumDriver = new IOSDriver();
            default -> throw new IllegalArgumentException("Please provide correct platform!");
        }

        return appiumDriver;
    }
}
