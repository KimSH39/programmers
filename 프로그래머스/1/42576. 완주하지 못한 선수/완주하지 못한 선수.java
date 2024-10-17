import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

// 아래는 효율성 X        
//         String answer = "";
        
//         ArrayList<String> list = new ArrayList<>();
        
//         for (int i = 0; i < participant.length; i++) {
//             list.add(participant[i]);
//         }
        
//         for (int i = 0; i < completion.length; i++) {
//             list.remove(completion[i]);
//         }
        
//         answer = list.get(0);
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        return participant[participant.length - 1];
    }
}