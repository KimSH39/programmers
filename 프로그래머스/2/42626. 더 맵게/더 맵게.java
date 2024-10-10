import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        
        // 가장 낮은 거 두 개 poll 해서 스코빌 계산 > 다시 삽입
        // 가장 낮은 게 k 이상일 때까지 반복
        
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 추가
        for (int s: scoville) {
            pq.add(s);
        }
        
        while(pq.size() > 1) {
            int smallest = pq.poll();
            
            if (smallest >= K) {
                break;
            }
            
            int secondSmallest = pq.poll();
            int newScoville = smallest + (secondSmallest * 2);
            
            pq.add(newScoville);
            
            answer++;
        }
        
        // 가장 작은 것 삭제하지 않고 찾기
        if (pq.peek() >= K) {
            return answer;
        } else {
            return -1;
        }
    }
}