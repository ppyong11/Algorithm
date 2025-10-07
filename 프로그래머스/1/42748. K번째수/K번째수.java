import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //2차원 배열 행 개수로 길이 지정
        int answerIdx= 0;
        
        for(int[] idxArray:commands){ //2차원 -> 1차원
            int[] tmp= new int[idxArray[1]-idxArray[0]+1];
            int idx= 0;
            
            for(int i=idxArray[0]; i <= idxArray[1]; i++){ //해당하는 idx의 요소 담기
                tmp[idx++]= array[i-1];
            }
            Arrays.sort(tmp); //오름차순 정렬
            answer[answerIdx++]= tmp[idxArray[2]-1];
        }
        return answer;
    }
}