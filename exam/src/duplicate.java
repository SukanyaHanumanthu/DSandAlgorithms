import java.util.HashMap;

public class duplicate {
    private static void duplicatesHashmap(char[] input) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i =0; i<input.length;i++) {
            if (!(map.containsKey(input[i])))
            {
               // System.out.println(map.containsValue(element));
                map.put(input[i], true);

            } else {

                System.out.println(input[i]);
               break;
            }


        }

    }

    public static void main(String args[]) {
        duplicate duplicate = new duplicate();
        char[] a;
        a = new char[]{'a','b','c', 'a'};
        duplicate.duplicatesHashmap(a);
    }
}
