import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int idx = 0;
        int num = 1;
        int last = num;
        int N = str.length();
        
        while(idx < N) {
            String numStr = Integer.toString(num);
            String subStr = str.substring(idx, idx + numStr.length() > N ? N : idx + numStr.length());
            int subStrIdx = 0;
            for(int i = 0; i < numStr.length(); i++) {
                if(subStrIdx >= subStr.length()) {
                    break;
                }
                if(numStr.charAt(i) == subStr.charAt(subStrIdx)) {
                    subStrIdx++;
                    idx++;
                    last = num;
                }
            }
            num++;
        }
        
        System.out.println(last);
        
    }
}