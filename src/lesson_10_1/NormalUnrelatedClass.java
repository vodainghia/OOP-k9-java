package lesson_10_1;

import lesson_10.ChildSamePackage;

public class NormalUnrelatedClass {

    // Non-Subclass - Same package: Can access to parent class's method
    public void doSth() {
        ChildSamePackage childSamePackage = new ChildSamePackage();
        childSamePackage.fromParent();
    }
}
