import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] array = new int[N];
            int score = 1;
            int minKey = Integer.MAX_VALUE;
            int minValue = Integer.MAX_VALUE;
            Map<Integer, Integer> teamMap = new HashMap<>();
            Map<Integer, Integer> scoreMap = new HashMap<>();
            Map<Integer, Integer> countMap = new HashMap<>();
            Map<Integer, Integer> fifth = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int data = Integer.parseInt(st.nextToken());
                array[j] = data;
                teamMap.put(data, teamMap.getOrDefault(data, 0) + 1);
            }
            
            for(int e : array) {
                if(teamMap.get(e) >= 6) {
                    countMap.put(e, countMap.getOrDefault(e, 0) + 1);
                    if(countMap.get(e) <= 4) {
                        scoreMap.put(e, scoreMap.getOrDefault(e, 0) + score);
                    }
                    if(countMap.get(e) == 5) {
                        fifth.put(e, score);
                    }
                    score++;
                }
            }
            
            for(Integer key : scoreMap.keySet()){
                if(scoreMap.get(key) < minValue) {
                    minKey = key;
                    minValue = scoreMap.get(key);
                } else if(scoreMap.get(key) == minValue) {
                    if(fifth.get(key) < fifth.get(minKey)) {
                        minKey = key;
                        minValue = scoreMap.get(key);
                    }
                }
            }
            
            System.out.println(minKey);
        }
        
    }
}