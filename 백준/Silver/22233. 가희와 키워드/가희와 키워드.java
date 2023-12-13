import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 키워드 개수  
        int M = Integer.parseInt(st.nextToken()); // 글 개수
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
            String keyword = br.readLine();
            set.add(keyword);
        }
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), ",");
            while(st.hasMoreTokens()) {
                String key = st.nextToken();
                if(set.contains(key)) {
                    set.remove(key);
                }
            }
            sb.append(set.size()).append('\n');
        }
        
        System.out.println(sb);

    }
}