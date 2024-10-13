import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // (는 저장
        // ) 나오면 ( 하나 pop
        // 뺄 게 없거나 다 했는데 (가 남으면 false
        
        Stack<Character> st = new Stack<>();
        
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                st.push(arr[i]);
            } else {
                if (st.isEmpty()) {
                    answer = false;
                    break;
                }
                st.pop();
            }
        }
        
        if (!st.isEmpty()) {
            answer = false;
        }
        
        return answer;
    }
}