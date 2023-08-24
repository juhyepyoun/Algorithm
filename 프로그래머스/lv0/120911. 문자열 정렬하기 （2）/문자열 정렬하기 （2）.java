import java.util.*;
class Solution {
    public String solution(String my_string) {
        String new_string = my_string.toLowerCase();
        char[] charArr = new_string.toCharArray();
        Arrays.sort(charArr);
        String answer = new String(charArr);
        return answer;
    }
}