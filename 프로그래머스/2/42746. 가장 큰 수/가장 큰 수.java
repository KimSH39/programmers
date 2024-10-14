import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        String[] st = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            st[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(st, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + a + a;
                String order2 = b + b + b;
                
                return order2.compareTo(order1);
            }
        });

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < st.length; i++) {
            result.append(st[i]);
        }

        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}
