import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        int temp = arr[0];
        answer.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != temp) {
                answer.add(arr[i]);
                temp = arr[i];
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}