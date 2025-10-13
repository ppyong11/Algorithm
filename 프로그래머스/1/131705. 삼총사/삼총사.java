class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i= 0; i < number.length; i++){ //첫 번째 요소
            for(int j= i+1; j < number.length; j++){ //두 번째 더하는 요소
                for(int k= j+1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}