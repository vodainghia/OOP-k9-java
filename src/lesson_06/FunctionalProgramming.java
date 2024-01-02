package lesson_06;

// Template | Blueprint
// If you want to use from other packages, you need to "import" them
public class FunctionalProgramming {
    public void gatLua(String cayLua) {
        System.out.println("Dang gat " + cayLua);
    }

    public void xayLua(String hatLua) {
        System.out.println("Dang xay " + hatLua);
    }

    public static void main(String[] args) {
        FunctionalProgramming mayGatDapLienHop = new FunctionalProgramming();
        mayGatDapLienHop.gatLua("cay lua");
        mayGatDapLienHop.xayLua("hat lua");
    }
}
