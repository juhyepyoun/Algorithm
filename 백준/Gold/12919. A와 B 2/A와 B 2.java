import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int result = solve(s, t);
        System.out.println(result);
    }
    
    static int solve(String s, String t) {
        if(s.length() == t.length()) {
            if(s.equals(t)) return 1;
            else return 0;
        }
        
        int res = 0;
        
        if(t.charAt(0) == 'B') {
            String substring = t.substring(1);
            StringBuilder sb = new StringBuilder(substring);
            String string = sb.reverse().toString();
            res += solve(s, string);
        }
        
        if(t.charAt(t.length() - 1) == 'A') {
            String substring = t.substring(0, t.length() - 1);
            res += solve(s, substring);
        }
        
        return res > 0 ? 1 : 0;
    }
    
}