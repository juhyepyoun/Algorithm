import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String op : operations) {
            String[] arr = op.split(" ");
            if(arr[0].equals("I")) {
                int num = Integer.parseInt(arr[1]);
                maxPQ.add(num);
                minPQ.add(num);
            } else {
                if(maxPQ.isEmpty()) {
                    continue;
                } else if(arr[1].equals("1")) {
                    int poll = maxPQ.poll();
                    minPQ.remove(poll);
                } else {
                    int poll = minPQ.poll();
                    maxPQ.remove(poll);
                }
                
            }
        }
        
        if(maxPQ.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = maxPQ.peek();
            answer[1] = minPQ.peek();
        }
        return answer;
    }
}