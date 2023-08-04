import java.lang.Math;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = Integer.toString(a) + Integer.toString(b);
        String sum2 = Integer.toString(b) + Integer.toString(a);
        answer = Math.max(Integer.parseInt(sum1), Integer.parseInt(sum2));
        return answer;
    }
}