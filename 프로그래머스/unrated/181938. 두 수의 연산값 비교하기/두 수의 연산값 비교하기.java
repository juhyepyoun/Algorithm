import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = "" + a + b;
        answer = Math.max(Integer.parseInt(str), 2 * a * b);
        return answer;
    }
}