import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
		    String[] arr = br.readLine().split(" ");
		    int a = Integer.parseInt(arr[0]);
		    int b = Integer.parseInt(arr[1]);
		    int answer = 1;
		    
		    for(int j = 0; j < b; j++) {
		        answer = answer * a % 10;
		    }
		    
		    answer = (answer == 0) ? 10 : answer;
		    System.out.println(answer);
		}
		
		br.close();
	}
}