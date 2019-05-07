import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRU {
    static Deque<Integer> dq;
    static HashSet<Integer> map;
    static int csize = 0;

    LRU(int n) {
        dq = new LinkedList<>();
        map = new HashSet<>();
        csize = n;
    }

    public void addInCache(int x) {
        if (!(map.contains(x))) {
            if (csize == dq.size()) {
                int last = dq.removeLast();
                map.remove(last);
            }
        }else {
                int index = 0;
                int i = 0;
                Iterator<Integer> itr = dq.iterator();
                while (itr.hasNext()) {
                    if (itr.next() == x) {
                        index = i;
                        break;
                    }
                    i++;
                }
                dq.remove(index);

            }
            dq.push(x);
            map.add(x);
        }

    public void display() {
        Iterator<Integer> itr = dq.iterator();
        while (itr.hasNext()) {
            System.out.println(" " + itr.next());
        }
    }

    public static void main(String[] args) {
        LRU ca = new LRU(4);
        ca.addInCache(1);
        ca.addInCache(2);
        ca.addInCache(3);
        ca.addInCache(1);
        ca.addInCache(4);
        ca.addInCache(5);
        ca.display();
    }
}



