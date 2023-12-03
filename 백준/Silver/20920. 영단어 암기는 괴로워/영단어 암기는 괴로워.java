import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length() < M) continue;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        List<String> words = new ArrayList<>(map.keySet());
        
        Collections.sort(words ,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(Integer.compare(map.get(s1), map.get(s2)) != 0) {
                    return Integer.compare(map.get(s2), map.get(s1));
                }
                else if(s1.length() != s2.length()) {
                    return s2.length() - s1.length();
                }
                return s1.compareTo(s2);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(String str : words) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}