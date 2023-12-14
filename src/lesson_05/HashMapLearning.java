package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        System.out.println(emergencyList.get(113));

        for (int key : emergencyList.keySet()) System.out.println(emergencyList.get(key));

        System.out.println(emergencyList.containsKey(113));
        System.out.println(emergencyList.containsValue("Cuu Hoa"));

        emergencyList.replace(113, "Royal Police");
        emergencyList.replace(113, "Royal Police", "New Royal Police");
        System.out.println(emergencyList.get(113));

        emergencyList.remove(116);
        emergencyList.remove(116, "Value");
    }
}
