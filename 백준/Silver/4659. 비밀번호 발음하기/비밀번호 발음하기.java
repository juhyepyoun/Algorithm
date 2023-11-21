import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        String str = "";
    
        while(!(str = br.readLine()).equals("end")) {
            boolean flag = false;
            int count = 0;
            char prev = '-';
            for(int i = 0; i < str.length(); i++) {
                if(isVowel(str.charAt(i))) {
                    flag = true;
                }
                
                if(isVowel(str.charAt(i)) != isVowel(prev)) {
                    count = 1;
                } else {
                    count++;
                }
                
                if(count >= 3 || (str.charAt(i) == prev && str.charAt(i) != 'e' && str.charAt(i) != 'o')) {
                    flag = false;
                    break;
                } else {
                    prev = str.charAt(i);
                }
                
            }
            System.out.print("<" + str + "> ");
            System.out.println(flag ? "is acceptable." : "is not acceptable.");
            
        }
        
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}