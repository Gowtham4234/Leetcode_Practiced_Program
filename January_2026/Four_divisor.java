package January_2026;

class Four_divisor {
    static public int sumFourDivisors(int[] nums) {
        
    int t = 0;

    for (int i = 0; i < nums.length; i++) {
        int sum = 0;
        int count = 0;

        for (int x = 1; x <= nums[i]; x++) {
            if (nums[i] % x == 0) {
                sum += x;
                count++;
            }
        }

        if (count == 4) {
            t += sum;
        }
    }

    return t;
    }

    public static void main(String[] args) {
        int arr[] ={21,4,7};

        System.out.print(sumFourDivisors(arr));
    }
}