import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < N; i++) {
            int rank = 0;
            for(int j = 0; j < N; j++) {
                if(x[i] < x[j] && y[i] < y[j]) {
                    rank++;
                }
            }
            sb.append(rank + 1).append(' ');
        }
        
        System.out.println(sb.toString().trim());
    }
}