class Solution {
    public long solution(int n) {
        long answer = 0;
        
        // dp 점화식 활용 > dp[n] = dp[n-1]+dp[n-2]
        // 칸 3개면 칸 2개 + 칸1개
        
        int[] array = new int[n + 1];
        
        if (n == 1) {
            return 1;
        }
        
        array[1] = 1;
        array[2] = 2;
        
        for (int i = 3; i < n + 1; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }
        
        return array[n];
    }
}