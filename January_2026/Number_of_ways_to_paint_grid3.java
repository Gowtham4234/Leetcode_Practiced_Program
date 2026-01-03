package January_2026;


class Number_of_ways_to_paint_grid3 {
    static public int numOfWays(int n) {
        final int MOD = 1_000_000_007;

        long a = 6; // Type ABA
        long b = 6; // Type ABC

        for (int i = 2; i <= n; i++) {
            long newA = (a * 3 + b * 2) % MOD;
            long newB = (a * 2 + b * 2) % MOD;

            a = newA;
            b = newB;
        }

        return (int)((a + b) % MOD);
    }

    public static void main(String[] args) {
        int n=1;

        System.out.println(numOfWays(n));
    }
}
