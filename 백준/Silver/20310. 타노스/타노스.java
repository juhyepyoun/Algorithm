import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String S = br.readLine();
        boolean bool[] = new boolean[S.length()];
        Arrays.fill(bool, true);
        int cnt0 = (S.length() - S.replace("0", "").length()) / 2;
        int cnt1 = (S.length() - S.replace("1", "").length()) / 2;
        
        for(int i = 0; i < S.length(); i++) { // 1은 앞에서부터 제거
            if(cnt1 == 0) {
                break;
            } else if(S.charAt(i) == '1') {
                bool[i] = false;
                cnt1--;
            }
        }
        
        for(int i = S.length() - 1; i >= 0; i--) { // 0은 뒤에서부터 제거
            if(cnt0 == 0) {
                break;
            } else if(S.charAt(i) == '0') {
                bool[i] = false;
                cnt0--;
            }
        }
        
        for(int i = 0; i < S.length(); i++) {
            if(bool[i]) {
                sb.append(S.charAt(i));
            }
        }
        
        System.out.println(sb);
        
    }
}