import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distance = new long[N - 1];
        long[] price = new long[N];
        long res = 0L;
        long min = Long.MAX_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < N - 1; i++) {
            if(min > price[i]) {
                min = price[i];
            }
            res += min * distance[i];
        }
        
        System.out.println(res);
    }
}