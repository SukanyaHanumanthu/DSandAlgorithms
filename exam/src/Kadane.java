public  class Kadane {

    public int maxsubarray(int a[]){
        int max_end_here = 0;
        int max_till_now = 0;
        for (int i = 0; i < a.length; i++) {
            if(max_end_here<0){
                max_end_here=0;
            }
            max_end_here = max_end_here + a[i];

            if (max_end_here > max_till_now) {
                max_till_now = max_end_here;
                //return  max_end_here;
            }          }
        return max_till_now;
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 3, -4, -5, 7};
        Kadane kadane=new Kadane();
        System.out.println(kadane.maxsubarray(input));
    }
}

