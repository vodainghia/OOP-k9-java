package lesson_10;

public class NormalUnrelatedClass {

    // Non-Subclass - Same package: Can access to parent class's method
    public void doSth() {
        ParentClass childSamePackage = new ChildSamePackage();
        childSamePackage.fromParent();
    }
}
