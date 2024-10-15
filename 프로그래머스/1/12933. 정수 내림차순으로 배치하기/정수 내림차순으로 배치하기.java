import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String st = Long.toString(n);
        
        int[] arr_first = new int[st.length()];
        
        for (int i = 0; i < st.length(); i++) {
            arr_first[i] = Character.getNumericValue(st.charAt(i));
        }
        
        Arrays.sort(arr_first);
        
        StringBuilder sb = new StringBuilder();
        for (int i = arr_first.length - 1; i >= 0; i--) {
            sb.append(arr_first[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}