class Solution {
    public String solution(int n) {
        String answer = "";
        int div = n / 2;
        
        // 2로 나눠
        // 홀수는 버림될 거고 짝수는 딱 몫이 생길 테니
        // "수박"을 한 세트로 더해준 후
        // 홀수라면 "수"를 붙이자
        
        if (n % 2 == 1) {
            for (int i = 0; i < div; i++) {
                answer += "수박";
            }
            answer += "수";
        } else {
            for (int i = 0; i < div; i++) {
                answer += "수박";
            }
        }
        
        return answer;
    }
}