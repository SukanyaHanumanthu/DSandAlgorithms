import java.io.*;
import java.util.*;
public class DupHashSet {

    public void findDuplicatesUsingHashSet(int inputArray[])
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : inputArray)
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element : "+element);
            }
        }
    }

    public static void main(String[] args) {
        int input[]={1,2,3,4,5,2};
        DupHashSet finddup=new DupHashSet();
        finddup.findDuplicatesUsingHashSet(input);
    }
}
