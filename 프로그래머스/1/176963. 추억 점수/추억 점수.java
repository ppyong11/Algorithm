import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> hashMap= new LinkedHashMap<>();
        int[] answer = new int[photo.length];
        
        for(int i= 0; i < name.length; i++){
            hashMap.put(name[i], yearning[i]);
        }
        
        for(int i= 0; i < photo.length; i++){
            for(int j= 0; j < photo[i].length; j++){
                if(hashMap.containsKey(photo[i][j])){
                    answer[i] += hashMap.get(photo[i][j]).intValue();
                }
            }
        }
        return answer;
    }
}