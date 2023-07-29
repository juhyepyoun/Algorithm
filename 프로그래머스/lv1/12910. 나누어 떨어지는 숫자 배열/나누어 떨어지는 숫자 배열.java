import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {0};
        ArrayList<Integer> list = new ArrayList<>();
        for(int e : arr) {
            if(e % divisor == 0) {
                list.add(e);
            }
        }
        if(list.size() == 0) {
            answer[0] = -1;
        } else {
            Collections.sort(list);
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}