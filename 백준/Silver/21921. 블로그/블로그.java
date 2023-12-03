import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
        int max = 0;
        int sum = 0;
        int maxCnt = 1;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < X; i++) {
            sum += array[i];
        }
        
        max = sum;
        
        for(int i = X; i < N; i++) {
            sum += array[i] - array[i - X];
            if(max == sum) {
                maxCnt++;
            } else if(max < sum) {
                max = sum;
                maxCnt = 1;
            }
        }
        
        if(max == 0 ) {
            sb.append("SAD");
        } else {
            sb.append(max).append('\n').append(maxCnt);
        }
        System.out.println(sb);
        
    }
}