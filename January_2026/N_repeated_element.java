package January_2026;

import java.util.HashSet;

public class N_repeated_element {
    
    static public int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int n =nums[0];
        for (int num : nums) {
            if (!set.add(num)) {
                n = num;
                break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        
        int arr[] ={1,2,3,3};

        System.out.println(repeatedNTimes(arr));
    }
}
