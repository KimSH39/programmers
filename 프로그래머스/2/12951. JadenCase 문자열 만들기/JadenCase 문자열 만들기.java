import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] st = s.split(" ", -1);
        
        for (int i = 0; i < st.length; i++) {
            if (st[i].length() > 0) {
                answer += Character.toUpperCase(st[i].charAt(0)) + st[i].substring(1).toLowerCase();
            }
            
            if (i < st.length - 1) {
                answer += " ";
            }
        }
        
        return answer;
    }
}
