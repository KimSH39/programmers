import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String st = Long.toString(n);
        
        int[] answer = new int[st.length()];
        
        for (int i = 0; i < st.length(); i++) {
            answer[i] = Character.getNumericValue(st.charAt(st.length() - i - 1));
        }
        
        return answer;
    }
}