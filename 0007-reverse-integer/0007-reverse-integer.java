class Solution {
    public int reverse(int x) {
          int sum = 0;
        int b = (x > 0) ? x : (-x); 
        while (b > 0) {
            int a = b % 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && a > 7)) return 0;
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && a < -8)) return 0;
            sum = (sum * 10) + a;
            b = b / 10;
        }
        return (x < 0) ? -sum : sum; 
    }
}