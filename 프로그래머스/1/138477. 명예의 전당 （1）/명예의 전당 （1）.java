import java.util.*;

class Solution {
    public Integer[] solution(int k, int[] score) {
        PriorityQueue<Integer> topScore = new PriorityQueue<>(); //오름차순 우선순위 (낮은 놈 우선)
        Integer[] answer= new Integer[score.length];
        
        //k가 score[]보다 많을 수 있음 (명예의 전당이 가수보다 많은 것 -> 다 상위권임)
        //어쨌든 score를 다 돌긴 해야 함
        for(int i= 0; i < score.length; i++){
            if(topScore.size() < k){ //큐가 k보다 작으면 수행
                topScore.offer(score[i]); 
                answer[i]= topScore.peek(); //젤 작은 놈 삭제 않고 반환 (에러 X) 
                continue;
            } else if(topScore.peek() < score[i]){
                topScore.offer(score[i]);
                topScore.poll(); //젤 작은 놈 삭제 후 반환 (에러 X)
            }
            answer[i]= topScore.peek();
        }
        return answer;
    }
}