import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int[] alpha = new int[26];
        int max = 0;
        int index = -1;
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        
        for(int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'A']++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(alpha[i] > max) {
                index = i;
                max = alpha[i];
            } else if(alpha[i] == max) {
                index = -1;
            }
        }
        
        if(index == -1) {
            System.out.println("?");
        } else {
            System.out.println((char)(index + 'A'));
        }
        
    }
}