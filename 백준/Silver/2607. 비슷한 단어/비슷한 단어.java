import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        
        char[] wordArr = new char[26];
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String firstWord = br.readLine();

        for(int i = 0; i < firstWord.length(); i++) {
            wordArr[firstWord.charAt(i) - 'A']++;
        }
        
        for(int i = 0; i < N - 1; i++) {
            String str = br.readLine();
            char[] strArr = new char[26];
            // "하나의 문자" 더하거나 빼거나 다른 문자로 바꾸거나
            boolean change = false;
            int changeCnt = 0;
            boolean isDiff = false;
            
            for(int j = 0; j < str.length(); j++) {
                strArr[str.charAt(j) - 'A']++;
            }
            
            int lenDiff = Math.abs(firstWord.length() - str.length());
            
            if(lenDiff == 1) {
                for(int j = 0; j < 26; j++) {
                    if(!change && Math.abs(wordArr[j] - strArr[j]) == 1) {
                        change = true;
                    } else if(wordArr[j] == strArr[j]) {
                        continue;
                    } else {
                        isDiff = true;
                        break;
                    }
                }
            } else if(lenDiff == 0) {
                for(int j = 0; j < 26; j++) {
                    if(changeCnt < 2 && Math.abs(wordArr[j] - strArr[j]) == 1) {
                        changeCnt++;
                    } else if(wordArr[j] == strArr[j]) {
                        continue;
                    } else {
                        isDiff = true;
                        break;
                    }
                }
            } else {
                isDiff = true;
            }
            
            
            if(!isDiff) {
                count++;
            }
        }
        
        System.out.println(count);

    }
}