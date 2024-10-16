import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer.add(arr[i]);
            }
        }
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}