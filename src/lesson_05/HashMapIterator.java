package lesson_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(117, "Others");
        emergencyList.put(118, "Others");

        // Will encounter the error ConcurrentModificationException:
//        Set<Integer> allKeys = emergencyList.keySet();
//        for (int key : allKeys) {
//            if (emergencyList.get(key).equals("Others")) {
//                emergencyList.remove(key);
//            }
//        }

        // Solution: utilize the Iterator
        Iterator<Map.Entry<Integer, String>> emergencyListIterator = emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()) {
            Map.Entry<Integer, String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Others")) {
                emergencyListIterator.remove();
            }
        }

        System.out.println(emergencyListIterator);
    }
}
