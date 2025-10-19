import java.util.*;

class Solution {
    public int solution(String s) {
        Map map= Map.of(
            "zero", "0",
            "one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9"
        );
        
        StringBuilder answer= new StringBuilder(); //정답
        StringBuilder tmp= new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                answer.append(ch);
                continue;
            }
            tmp.append(ch); //StringBuilder에 ch 저장 가능
            if(map.containsKey(tmp.toString())){
                answer.append(map.get(tmp.toString()));
                tmp.setLength(0); //비우기
            }
        }
        System.out.printf("%s", tmp.toString());
        return Integer.parseInt(answer.toString());
    }
}