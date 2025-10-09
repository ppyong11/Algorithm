class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer= new String[strings.length];
        String tmp;
        
        for(int i= 0; i < strings.length; i++){ //1, 2 (length= 3)
            for(int j= i; j < strings.length; j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){ //앞놈이 뒷놈보다 크면
                    tmp= strings[i];
                    strings[i]= strings[j];
                    strings[j]= tmp;
                } 
                else if(strings[i].charAt(n) == strings[j].charAt(n) && 
                        strings[i].compareTo(strings[j]) > 0){ //char이 같고 앞놈이 뒷놈보다 사전순으로 크면
                    tmp= strings[i];
                    strings[i]= strings[j];
                    strings[j]= tmp;
                }
            }
        }
        return strings;
    }
}