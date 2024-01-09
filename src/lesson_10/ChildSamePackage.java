package lesson_10;

public class ChildSamePackage extends ParentClass {

    // Subclass - Same package: Can access to parent class's method
    @Override
    public void fromParent() {
        super.fromParent();
    }
}
