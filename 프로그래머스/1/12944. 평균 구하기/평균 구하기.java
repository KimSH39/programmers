class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int arrSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        
        answer = (double) arrSum / arr.length;
        
        return answer;
    }
}