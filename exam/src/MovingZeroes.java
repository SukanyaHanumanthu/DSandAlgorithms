import java.util.Arrays;

public class MovingZeroes {
    public void moveArray(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }
        while (count < a.length)
            a[count++] = 0;

    }


    public static void main(String[] args) {
        int a[] = {0, 2, 4, 5, 0, 2};
        MovingZeroes movzero = new MovingZeroes();
        movzero.moveArray(a);
        System.out.printf(Arrays.toString(a));
    }
}
