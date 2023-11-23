package lesson_03;

public class FlowControlKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3) break; //thoát luôn khỏi loop
        }

        for (int i = 0; i < 5; i++) {
            if (i==3) continue; //skip this iteration
            System.out.println(i);
        }
    }
}
