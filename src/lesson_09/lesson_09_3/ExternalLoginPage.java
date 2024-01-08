package lesson_09.lesson_09_3;

public class ExternalLoginPage extends LoginPage {
    @Override
    protected String getUsernameLocator() {
        return "ExternalLoginPage | getUsernameLocator";
    }

    @Override
    protected String getPasswordLocator() {
        return "ExternalLoginPage | getPasswordLocator";
    }

    @Override
    protected String getLoginBtnLocator() {
        return "ExternalLoginPage | getLoginBtnLocator";
    }
}
