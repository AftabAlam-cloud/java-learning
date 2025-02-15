import java.util.*;
public class hasMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("china", 150);
        map.put("US",30);

        System.out.println(map.keySet());

        for(Map.Entry<String , Integer> e : map.entrySet()) {
           System.out.println(e.getKey());
           System.out.println(e.getValue()); 
        
    }
}
}
