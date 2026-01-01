package January_2026;

import java.util.Arrays;

public class Oneplus {
    
    static public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {


            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

          
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
