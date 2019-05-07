import java.util.HashMap;
import java.util.LinkedList;

public class FirstRecurring {
    public void findRecurringHashMap(char[] input) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0; i<input.length;i++) {
            if (!(map.containsKey(input[i])))
            {
                // System.out.println(map.containsValue(element));
                map.put(input[i], i);

            } else {

                System.out.println(input[i]);
                break;
            }


        }

    }
    public static void main(String args[]) {
        FirstRecurring firstRecurring = new FirstRecurring();
        char[] a;
        a = new char[]{'a','b','b','c', 'a','b'};
        firstRecurring.findRecurringHashMap(a);
    }
}
