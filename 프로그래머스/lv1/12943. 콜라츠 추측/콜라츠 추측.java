class Solution {
    public int solution(int num) {
        int answer = 0;
        Long lnum = Long.valueOf(num);
        
        for(int i = 1; i <= 500; i++) {
            if(lnum == 1) {
                break;
            }
            lnum = lnum % 2 == 0 ? lnum / 2 : lnum * 3 + 1;
            answer++;
        }
        
        if(answer == 500 && lnum != 1) {
            answer = -1;
        }
        
        return answer;
    }
}