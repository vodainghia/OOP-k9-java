package lesson_09.lesson_09_3;

public class TestLoginPage {
    // Is-A relationship
    public void login(LoginPage loginPage) {
        loginPage.login();
    }

    public static void main(String[] args) {
        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        TestLoginPage testLoginPage = new TestLoginPage();

        testLoginPage.login(internalLoginPage);
        testLoginPage.login(externalLoginPage);
    }
}
