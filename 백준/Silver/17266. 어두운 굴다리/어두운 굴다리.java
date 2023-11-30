import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] location = new int[M];
        int[] interval = new int[M + 1];
        int cur = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }
        
        interval[0] = location[0] - cur;
        interval[M] = N - location[M - 1];
        for(int i = 1; i < M; i++) {
            int diff = location[i] - location[i - 1];
            interval[i] = (diff % 2 == 0) ? diff / 2 : (diff + 1) / 2;
        }
        
        Arrays.sort(interval);
        
        System.out.println(interval[M]);
        
    }
}