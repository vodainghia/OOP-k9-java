package lesson_11;

public interface ISomething {

    // Abstract method
    void doSth();

    // default method: Allow child class to use
    default void doAnotherThing() {}

    // static method: Can call it directly from interface
    static void doAnything() {}
}
