package lesson_12;

public class LaunchAppTest {

    public static void main(String[] args) {
        AppiumDriver appiumDriver = null;
        try {
            appiumDriver = DriverFactory.getAppiumDriver(Platform.IOS);
            appiumDriver.initDriver();
            // Continue logic here
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (appiumDriver != null) {
                appiumDriver.closeDriver();
            }
        }
    }
}
