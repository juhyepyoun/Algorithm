import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int res = 0;
        String game = st.nextToken();
        Set<String> set = new HashSet<String>();
        
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        switch(game) {
            case "Y":
                res = set.size() / 1;
                break;
            case "F":
                res = set.size() / 2;
                break;
            case "O":
                res = set.size() / 3;
                break;
        }
        
        System.out.println(res);
    }
}