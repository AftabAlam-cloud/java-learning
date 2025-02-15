import java.util.HashSet;
import java.util.Iterator;
public class Hashing {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        if(!set.contains(4)){
            System.out.println("Number  not found");
        }
        else{
            System.out.println("found");
        }
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            // process value
            System.out.println(value);
        }
    }
    
}
