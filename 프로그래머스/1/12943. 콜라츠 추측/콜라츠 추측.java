class Solution {
    public int solution(int num) {
        
        // 오버플로우 때문에...
        long n = num;
        
        int answer = 0;
        
        if (n == 1) {
            return 0;
        }
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            
            answer += 1;
            
            if (answer >= 500) {
                return -1;
            }
        }
        
        return answer;
    }
}