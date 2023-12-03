import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] array = new char[N];
        boolean[] ate = new boolean[N];
        int count = 0;
        
        array = br.readLine().toCharArray();

        for(int i = 0; i < N; i++) {
            if(array[i] == 'P') {
                int startIndex = Math.max(i - K, 0);
                int endIndex = Math.min(i + K, N - 1);
                for(int j = startIndex; j <= endIndex; j++) {
                    if(array[j] == 'H' && !ate[j]) {
                        ate[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(count);

    }
}