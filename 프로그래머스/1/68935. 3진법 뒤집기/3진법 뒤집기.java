import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int n) {
        StringBuilder sb= new StringBuilder();
        int answer= 0;
        int j= 0;
        
        while(n != 0){
            sb.append(String.valueOf(n%3));
            n= n / 3;
        }
        
        for(int i= sb.length()-1; i >= 0; i--){ //3~0
            answer += (sb.charAt(i) - '0') * (Math.pow(3, j++)); 
        }
        return answer;
    }
}