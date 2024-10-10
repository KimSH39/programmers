import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // 배열에 있는 숫자를 쭉 다시 리스트에 받음
        // 근데 직전 들어온 값과 같으면 안 받음
        // 리스트를 배열로
        
        // 리스트 생성
        List<Integer> result = new ArrayList<>();
        
        // 일단 첫 번째 값은 리스트에 넣음
        result.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}