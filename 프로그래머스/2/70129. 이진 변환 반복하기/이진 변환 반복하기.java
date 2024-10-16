import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int con_count = 0;
        int del_count = 0;
        
        while (!s.equals("1")) {
            
            int len = s.length();
            String non_zero_str = s.replace("0", "");
            int non_zero_len = non_zero_str.length();
                
            del_count += (len - non_zero_len);
                
            s = Integer.toBinaryString(non_zero_len);
                
            con_count++; 
        }
        
        return new int[] {con_count, del_count};
        
    }
}