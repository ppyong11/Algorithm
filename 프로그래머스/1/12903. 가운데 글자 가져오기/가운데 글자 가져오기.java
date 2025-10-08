class Solution {
    public String solution(String s) {
        int middleIdx= s.length() / 2;
        char[] sArray= s.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        if(s.length() % 2 == 0){ //짝수면 앞 idx까지
            answer.append(sArray[middleIdx-1]);
            answer.append(sArray[middleIdx]);
        } else{
            answer.append(sArray[middleIdx]);
        }
        
        return answer.toString();
    }
}