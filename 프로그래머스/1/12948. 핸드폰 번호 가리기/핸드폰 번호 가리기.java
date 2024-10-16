import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 넘버 몇 자리인지 count
        // 거기서 4 뺀 값만큼 별 채우고
        // 남은 건 그 자릿수 숫자 가져오기
        
        int leg = phone_number.length();
        int star = phone_number.length() - 4;
        
        for (int i = 0; i < star; i++) {
            answer += "*";
        }
        
        for (int i = star; i < leg; i++) {
            answer += phone_number.charAt(i);
        }
        
        return answer;
    }
}