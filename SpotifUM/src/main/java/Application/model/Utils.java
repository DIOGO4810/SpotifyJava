package Application.model;

import java.util.Map;

public class Utils {
    
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            
        }
    }

}
