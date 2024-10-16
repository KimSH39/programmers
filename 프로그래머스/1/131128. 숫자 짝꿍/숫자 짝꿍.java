class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i) - '0']++;
        }
        
        for (int j = 0; j < Y.length(); j++) {
            yCount[Y.charAt(j) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xCount[i], yCount[i]);
            
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) {
            return "-1";
        }
        
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}