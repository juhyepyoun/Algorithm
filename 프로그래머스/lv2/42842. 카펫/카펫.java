import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int area = brown + yellow;
        int sqrt = (int)Math.sqrt(area);
        for(int i = 3; i <= sqrt; i++) {
            if(area % i == 0) {
                if((i-2) * (area / i - 2) == yellow) {
                    answer[0] = area / i;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}