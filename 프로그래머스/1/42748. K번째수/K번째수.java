import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //2차원 배열 행 개수로 길이 지정
        
        for(int i= 0; i < commands.length; i++){
            int[] tmp= Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(tmp); //오름차순 정렬
            answer[i]= tmp[commands[i][2]-1];
        }
        return answer;
    }
}