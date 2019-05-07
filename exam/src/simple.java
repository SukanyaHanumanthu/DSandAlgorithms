import java.util.ArrayList;

class simple {

    ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }
     public static void main(String... args)
     {
        simple s= new simple();

         ArrayList<ArrayList<Integer>> A = new ArrayList<>();
         for (int i = 0; i < 4; i++) {
             A.add(new ArrayList<Integer>()); //Add this line
             for (int j = 0; j < 4; j++)
                 A.get(i).add(j); //You should only add 1 integer value
         }
         ArrayList<ArrayList<Integer>> B = s.performOps(A);
         for (int i = 0; i < B.size(); i++) {
             for (int j = 0; j < B.get(i).size(); j++) {
                 System.out.print(B.get(i).get(j) + " ");
             }
         }

     }

}
