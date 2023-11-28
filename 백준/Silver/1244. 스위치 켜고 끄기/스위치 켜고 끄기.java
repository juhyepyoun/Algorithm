import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] switches = new int[cnt + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= cnt; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            if(gender == 1) { // 남자 -> 배수
                for(int j = num; j <= cnt; j += num) {
                    switches[j] ^= 1;
                }
            } else { // 여자 -> 대칭
                switches[num] ^= 1;
                for(int j = 1; j <= Math.min(num - 1, cnt - num); j++) {
                    if(switches[num - j] == switches[num + j]) {
                        switches[num - j] ^= 1;
                        switches[num + j] ^= 1;
                    } else {
                        break;
                    }
                }
            }
        }
        
        for(int i = 1; i <= cnt; i++) {
            System.out.print(switches[i]);
            if(i % 20 == 0) {
                System.out.println();
            } else if(i != cnt) {
                System.out.print(" ");
            }
        }

    }
}