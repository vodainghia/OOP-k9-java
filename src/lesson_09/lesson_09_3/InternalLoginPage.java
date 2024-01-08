package lesson_09.lesson_09_3;

public class InternalLoginPage extends LoginPage {
    @Override
    protected String getUsernameLocator() {
        return "InternalLoginPage | getUsernameLocator";
    }

    @Override
    protected String getPasswordLocator() {
        return "InternalLoginPage | getPasswordLocator";
    }

    @Override
    protected String getLoginBtnLocator() {
        return "InternalLoginPage | getLoginBtnLocator";
    }
}
