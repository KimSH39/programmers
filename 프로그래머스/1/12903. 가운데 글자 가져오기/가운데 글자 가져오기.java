import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // s의 길이 찾아서
        // 홀수라면 2 나눠서 ceil
        // 짝수라면 2 나눠서 + 1
        // s를 거기서부터 거기서부터 하나 혹은 둘 출력
        
        int len = s.length();
        int mid = 0;
        
        System.out.println(len);
        
        if (len % 2 == 1) {
            mid = len / 2;
            
            answer += s.charAt(mid);
            
        } else {
            mid = len / 2;
            
            answer += s.charAt(mid - 1);
            answer += s.charAt(mid);
        }
        
        return answer;
    }
}