package lesson_10_2;

public class DriverFactory {
    // Controller
    public AppiumDriver getAppiumDriver() {
        AppiumDriver appiumDriver;
        String platform = System.getenv("platform");

        // Polymorphism | Transition to take another form
        if (platform.equals("android")) {
            appiumDriver = new AndroidDriver();
        } else if (platform.equals("ios")) {
            appiumDriver = new IOSDriver();
        } else {
            throw new IllegalArgumentException("We don't support " + platform);
        }

        return appiumDriver;
    }
}
