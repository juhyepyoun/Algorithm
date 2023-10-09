import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[20];
        
        int P = Integer.parseInt(br.readLine());
        for(int i = 0; i < P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int no = Integer.parseInt(st.nextToken());
            int cnt = 0;
            arr[0] = Integer.parseInt(st.nextToken());
            for(int j = 1; j < 20; j++) {
                int cur = Integer.parseInt(st.nextToken());
                for(int k = j - 1; k >= 0; k--) {
                    if(arr[k] > cur) {
                        arr[k + 1] = arr[k];
                        arr[k] = cur;
                        cnt++;
                    } else {
                        arr[k + 1] = cur;
                        break;
                    }
                }
            }
            sb.append(no).append(' ').append(cnt).append('\n');
        }
        System.out.print(sb);
    }
}