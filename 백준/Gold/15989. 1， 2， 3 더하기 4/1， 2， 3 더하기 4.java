import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int quot = n / 3;
            for(int j = 1; j <= quot; j++) {
                cnt += (n - (3 * j)) / 2 + 1;
            }
            cnt += n / 2 + 1;
            System.out.println(cnt);
        }
    }
}