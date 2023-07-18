class Solution {
    public int solution(int n) {
        int answer = n;
        int n_cnt = Integer.bitCount(n);
        while(true) {
            n++;
            if(n_cnt == Integer.bitCount(n)) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}