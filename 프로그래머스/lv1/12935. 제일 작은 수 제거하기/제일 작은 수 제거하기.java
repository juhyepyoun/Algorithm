import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[arr.length - 1];
            int idx = 0;
            int min = Arrays.stream(arr).min().getAsInt();
            for(int i : arr) {
                if(i != min) {
                    answer[idx++] = i;
                }
            }
            return answer;
        }
    }
}