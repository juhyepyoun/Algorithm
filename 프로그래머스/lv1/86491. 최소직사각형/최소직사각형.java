import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        TreeSet<Integer> max = new TreeSet<>();
        TreeSet<Integer> min = new TreeSet<>();
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1])  {
                max.add(sizes[i][0]);
                min.add(sizes[i][1]);
            } else {
                max.add(sizes[i][1]);
                min.add(sizes[i][0]);
            }
        }
        
        answer = max.last() * min.last();
        
        return answer;
    }
}