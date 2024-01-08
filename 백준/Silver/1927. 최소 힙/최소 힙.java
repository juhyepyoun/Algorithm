import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(pQ.isEmpty()) {
                    sb.append('0').append('\n');
                } else {
                    sb.append(pQ.poll()).append('\n');
                }
            } else {
                pQ.offer(x);
            }
        }
        
        System.out.println(sb);
    }
}