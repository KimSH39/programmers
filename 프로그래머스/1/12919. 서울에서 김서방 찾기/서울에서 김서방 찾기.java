class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int temp = 1;
        
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                temp = i;
            }
        }
        
        return "김서방은 " + temp + "에 있다";
    }
}