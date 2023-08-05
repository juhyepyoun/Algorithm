import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int num : arr) {
            answer.add(num);
        }
        
        for(int del : delete_list) {
            if(answer.contains(del)) {
                answer.remove(answer.indexOf(del));
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}