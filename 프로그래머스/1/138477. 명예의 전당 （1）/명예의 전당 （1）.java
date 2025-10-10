import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] topScore= Arrays.copyOfRange(score, 0, k); //명예의 전당
        Arrays.sort(topScore); //반환 값이 없어서 초기화할 때 사용 X
        int[] answer= new int[score.length]; //명예의 전당 중 최저 점수 담는 배열
        
        int min= score[0];
        answer[0]= min;
        
        //score == k
        for(int i= 1; i < k; i++){//1~k-1 중 작은 놈 배열에 담기
            if(i >= answer.length){
                break;
            }
            if(min > score[i]){
                min= score[i];
            }
            answer[i]= min;
        }
        if(score.length > k){
            for(int i= k; i < score.length; i++){ //k == score 길이일 경우 안 돌아감 
            //i >= k, 비교 시작 (명예의 전당 중 작은 점수보다 크면 넣기)
            if(topScore[0] < score[i]){
                topScore[0]= score[i];
                Arrays.sort(topScore); //또 정렬
            }
            answer[i]= topScore[0];
            }  
        }
        return answer;
    }
}