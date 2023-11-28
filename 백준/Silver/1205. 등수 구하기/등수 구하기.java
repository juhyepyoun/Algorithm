import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int rank = 1;
        int[] array = new int[N + 1];
        
        if(N > 0) {
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
        }
        array[N] = score;
        
        Integer[] newArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(newArray, Collections.reverseOrder());
        
        if(N >= P && (array[P-1] > score || (array[P-1] == score && array[P] == score))) {
            System.out.println("-1");
        } else {
            for(int i = 0; i <= N; i++) {
                if(array[i] > score) {
                    rank++;
                } else {
                    System.out.println(rank);
                    break;
                }
            }
        }
    }
}