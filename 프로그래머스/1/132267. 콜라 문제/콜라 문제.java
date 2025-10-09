class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){//가진 빈 병이 반납하는 병보다 적을 때 멈춤
            answer += b*(n / a); //받은 병 수
            n= (b*(n / a)) + (n % a); //가진 병: 반납하고 받은 병 + 기존 병
        }
        return answer;
    }
}