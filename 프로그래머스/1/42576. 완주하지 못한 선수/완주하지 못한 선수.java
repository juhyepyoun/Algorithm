import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {   
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < completion.length; i++) {
            String p = participant[i];
            String c = completion[i];
            
            map.put(p, map.getOrDefault(p,0) + 1);
            map.put(c, map.getOrDefault(c,0) - 1);
        }
        
        int last = participant.length - 1;
        
        map.put(participant[last], map.getOrDefault(participant[last], 0) + 1);
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
        
    }
}