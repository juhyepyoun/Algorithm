import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "" + n;
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", arr));
        return answer;
    }
}