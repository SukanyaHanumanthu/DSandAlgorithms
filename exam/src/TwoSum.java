import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            System.out.println("no elements");
        }else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j >= 0; j--) {
                    int expected = target - nums[i];
                    //System.out.println(Arrays.asList(nums).indexOf(expected));

                    int indices[] = new int[2];
                    if (nums[j] == expected) {
                        indices[0] = i;
                        indices[1] = nums.length-(j+1);
                        System.out.println(indices[1]);
                        return indices;
                    }
                }
            }

        }    return nums;
    }
    public static void main (String args[]){
        TwoSum sum = new TwoSum();
        int target = 72;
        int[] a = {2, 52, 70, 23, 42};
        System.out.println(sum.twoSum(a, target));
    }
}

