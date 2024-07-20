import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int[] array = new int[N];
            for(int j = 0; j < N; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }
            int max = array[N-1];
            long cnt = 0;
            for(int j = N-2; j >= 0; j--) {
                if(array[j] < max) {
                    cnt += max - array[j];
                } else if(array[j] > max) {
                    max = array[j];
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}