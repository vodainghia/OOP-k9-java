package lesson_09.lesson_09_3;

public abstract class LoginPage {
    protected void login() {
        System.out.println(getUsernameLocator());
        System.out.println(getPasswordLocator());
        System.out.println(getLoginBtnLocator());
    }

    protected abstract String getUsernameLocator();

    protected abstract String getPasswordLocator();

    protected abstract String getLoginBtnLocator();
}
