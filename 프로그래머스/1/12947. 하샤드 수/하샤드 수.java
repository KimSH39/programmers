import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        // st로 바꾸고 for로 길이만큼 반복 돌림
        // 각각을 int로 바꾸고 더함: 자릿수 합 생성
        // x가 자릿수 합으로 나눠떨어지는지 확인
        
        String st = Integer.toString(x);
        int temp = 0;
        
        for (int i = 0; i < st.length(); i++) {
            temp += Character.getNumericValue(st.charAt(i));
        }
        
        if (x % temp != 0) {
            answer = false;
        }
        
        return answer;
    }
}