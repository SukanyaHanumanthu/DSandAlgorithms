public class common_items {

    public static boolean duplicate(char[] A, char[] B) {
        String found = "";
        Boolean result = false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    result = true;

                }

            }
        }
        return result;

    }

    public static void main(String args[]) {
        common_items com = new common_items();
        char[] A = new char[]{'a', 'b', 'v', 'o'};
        char[] B = new char[]{'l', 'g', 't', 'i'};

        System.out.println(com.duplicate(A, B));
    }


}
